package domain.usecase;

import domain.entity.Chambre;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RecupererChambresTest {

    @Mock
    private ChambreRepository repository;

    private RecupererChambres recupererChambres;

    private List<Chambre> expected = List.of(
            new Chambre(1, "101", "Une belle chambre", 2),
            new Chambre(2, "202", "Une moins belle chambre", 1)
    );

    @Test
    public void getChambres() {
        //GIVEN
        recupererChambres = new RecupererChambres(repository);
        when(repository.getChambres()).thenReturn(expected);
        //WHEN
        List<Chambre> actual = recupererChambres.executer();
        //THEN
        Assertions.assertEquals(expected, actual);
    }

}
