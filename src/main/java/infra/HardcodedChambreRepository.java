package infra;

import domain.entity.Chambre;
import domain.usecase.ChambreRepository;
import java.util.List;

public class HardcodedChambreRepository implements ChambreRepository {

    private static List<Chambre> chambres = List.of(
            new Chambre(1, "101", "1 king size bed - A/C - Wi-Fi - private bathroom - wheelchair accessible", 2),
            new Chambre(1, "102", "2 queen size beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 4),
            new Chambre(1, "103", "3 single beds - A/C - Wi-Fi - private bathroom - wheelchair accessible", 3),
            new Chambre(2, "201", "1 king size bed - A/C - Wi-Fi - private bathroom", 2),
            new Chambre(2, "202", "1 queen size bed - Wi-Fi - private bathroom", 2),
            new Chambre(2, "203", "1 king size bed + 3 single beds - A/C - Wi-Fi - private bathroom", 5),
            new Chambre(2, "204", "1 single bed - Wi-Fi - shared bathroom", 1),
            new Chambre(2, "205", "2 single beds - A/C - Wi-Fi - shared bathroom", 2),
            new Chambre(3, "301", "1 queen size bed - A/C - private bathroom", 2),
            new Chambre(3, "302", "2 single beds - A/C - private bathroom", 2),
            new Chambre(3, "303", "3 single beds - A/C - shared bathroom", 3),
            new Chambre(3, "304", "2 single beds - shared bathroom", 2)
    );


    @Override
    public List<Chambre> getChambres() {
        return chambres;
    }
}
