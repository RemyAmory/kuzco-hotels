package domain.usecase;

import domain.entity.Chambre;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecupererChambresTest {

    //    @InjectMocks
    private RecupererChambres recupererChambres;

    private List<Chambre> expected = List.of(
            new Chambre(1, "101", "Une belle chambre", 2),
            new Chambre(2, "202", "Une moins belle chambre", 1)
    );

    @Test
    public void getChambres() {
        //GIVEN
        recupererChambres = new RecupererChambres(new ChambreRepository() {
            @Override
            public List<Chambre> getChambres() {
                return expected;
            }
        });
        //WHEN
        List<Chambre> actual = recupererChambres.executer();
        //THEN
        Assertions.assertEquals(expected, actual);
    }

}
