import domain.entity.Chambre;
import domain.usecase.RecupererChambres;
import infra.HardcodedChambreRepository;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if (input.equals("liste")) {
            afficherChambres();
        }
    }

    private static void afficherChambres() {
        RecupererChambres recupererChambres = new RecupererChambres(new HardcodedChambreRepository());
        List<Chambre> chambres = recupererChambres.executer();
        for (Chambre chambre : chambres) {
            String chambreString = chambre.toString();
            out.println(chambreString);
        }
    }
}
