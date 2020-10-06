package infra;

import domain.entity.Chambre;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HardcodedChambreRepositoryTest {

    private HardcodedChambreRepository repo = new HardcodedChambreRepository();

    @Test
    public void checkList() {
        List<Chambre> chambres = repo.getChambres();
        assertEquals(12, chambres.size());
    }

}
