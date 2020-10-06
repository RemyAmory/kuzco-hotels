package infra;

import domain.entity.Chambre;
import domain.usecase.RecupererChambres;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChambresControllerTest {


    private ChambresController chambresController;

    private List<Chambre> expected = List.of(
            new Chambre(1, "101", "Une belle chambre", 2),
            new Chambre(2, "202", "Une moins belle chambre", 1)
    );

    @Test
    public void getChambres() {
        //GIVEN
        chambresController = new ChambresController(
                new RecupererChambres(
                        new HardcodedChambreRepository()) {

                    public List<Chambre> executer() {
                        return expected;
                    }
                });
        //WHEN
        List<Chambre> actual = chambresController.recupererChambres();
        //THEN
        Assertions.assertEquals(expected, actual);
    }
}
