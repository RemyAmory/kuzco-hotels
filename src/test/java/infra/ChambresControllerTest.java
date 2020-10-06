package infra;

import domain.entity.Chambre;
import domain.usecase.RecupererChambres;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChambresControllerTest {

    @Mock
    private RecupererChambres usecase;

    private ChambresController chambresController;

    private List<Chambre> expected = List.of(
            new Chambre(1, "101", "Une belle chambre", 2),
            new Chambre(2, "202", "Une moins belle chambre", 1)
    );

    @Test
    public void getChambres() {
        //GIVEN
        chambresController = new ChambresController(usecase);
        when(usecase.executer()).thenReturn(expected);
        //WHEN
        List<Chambre> actual = chambresController.recupererChambres();
        //THEN
        Assertions.assertEquals(expected, actual);
    }
}
