package infra;

import domain.entity.Chambre;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CsvChambreRepositoryTest {

    private CsvChambreRepository repo = new CsvChambreRepository("./src/main/resources/chambres.csv");


    @Test
    public void readFile() {
        //WHEN
        List<Chambre> actual = repo.getChambres();
        //THEN
        Assertions.assertEquals(12, actual.size());
    }

}
