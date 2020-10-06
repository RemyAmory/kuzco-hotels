package domain.usecase;

import domain.entity.Chambre;
import java.util.List;

public class RecupererChambres {

    private ChambreRepository chambresRepository;

    public RecupererChambres(ChambreRepository chambresRepository) {
        this.chambresRepository = chambresRepository;
    }

    public List<Chambre> executer(){
        return chambresRepository.getChambres();
    }
}
