package infra;

import domain.entity.Chambre;
import domain.usecase.ChambreRepository;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvChambreRepository implements ChambreRepository {

    private File csvFile;

    public CsvChambreRepository(String csvPath) {
        this.csvFile = new File(csvPath);
    }

    @Override
    public List<Chambre> getChambres() {
        BufferedReader br = null;
        String line = "";

        List<Chambre> chambres = new ArrayList<>();

        try (BufferedReader bufferedReader = br = new BufferedReader(new FileReader(csvFile))){
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    chambres.add(lireChambre(line));
                }
            }
            return chambres;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private Chambre lireChambre(String line) {
        String[] fields = line.split(";");
        int etage = Integer.parseInt(fields[0]);
        String numero = fields[1];
        String description = fields[2];
        int capacite = Integer.parseInt(fields[3].substring(0,1));
        return new Chambre(etage, numero, description, capacite);
    }

}
