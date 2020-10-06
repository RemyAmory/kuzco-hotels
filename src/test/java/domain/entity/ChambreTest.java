package domain.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChambreTest {

    @Test
    public void test(){
        Chambre chambre = new Chambre(1, "101", "une chambre", 1);
        Assertions.assertEquals("|etage=1, numero='101', description='une chambre', capacité=1|", chambre.toString());
    }

}
