package inleveropdrachten.opdracht4B;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoHuurTest {
    @Test
    void newAutoZonderEigenaar(){
        Auto a1 = new Auto("Audi A1", 25);

        assertEquals("Er is geen huurder gevonden", a1.toString());
    }
    
    @Test
    void nochEigenaarNochAuto(){
        Auto a1 = new Auto("Audi A1", 25);
        assertEquals("Er is geen huurder gevonden", a1.toString());
    }
    @Test
    void negaPrijs(){
        Auto a1 = new Auto("Ferrari F50", -20);
        assertEquals(20, a1.getPrijsPerDag());
    }
    @Test
    void geenKlantNaam(){
        Klant k1 = new Klant(null);
        assertEquals(null, k1.toString());
    }
    @Test
    void geenAutoNaam(){
        Auto a1 = new Auto(null , 24);
        assertEquals(null, a1.getType());
    }
    @Test
    void negaDagen(){
        AutoHuur ah1 = new AutoHuur(-23);
        assertEquals(23, ah1.getAantalDagen());
    }
}
