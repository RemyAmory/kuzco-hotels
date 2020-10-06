package infra;

import domain.entity.Chambre;
import domain.usecase.RecupererChambres;
import java.util.List;

public class ChambresController {

    private RecupererChambres recupererChambres;

    public ChambresController(RecupererChambres recupererChambres) {
        this.recupererChambres = recupererChambres;
    }

    public List<Chambre> recupererChambres() {
        return this.recupererChambres.executer();
    }
}
