package domain.usecase;

import domain.entity.Chambre;
import java.util.List;

public interface ChambreRepository {

    List<Chambre> getChambres();

}
