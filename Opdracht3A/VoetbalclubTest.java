package inleveropdrachten.opdracht2B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoetbalclubTest {

    @Test
    void nullNaamTest() {
        Voetbalclub vc1 = new Voetbalclub(null);
        assertEquals("FC", vc1.naam);
    }

    @Test
    void eenGewonnenTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('w');
        assertEquals(1, vc2.aantalGespeeld());
        assertEquals(1, vc2.aantalGewonnen);
        assertEquals(0, vc2.aantalGelijk);
        assertEquals(0, vc2.aantalVerloren);
        assertEquals(3, vc2.aantalPunten());
    }
    @Test
    void eenGelijkTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('g');
        assertEquals(1, vc2.aantalGespeeld());
        assertEquals(0, vc2.aantalGewonnen);
        assertEquals(1, vc2.aantalGelijk);
        assertEquals(0, vc2.aantalVerloren);
        assertEquals(1, vc2.aantalPunten());
    }
    @Test
    void eenVerlorenTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('v');
        assertEquals(1, vc2.aantalGespeeld());
        assertEquals(0, vc2.aantalGewonnen);
        assertEquals(0, vc2.aantalGelijk);
        assertEquals(1, vc2.aantalVerloren);
        assertEquals(0, vc2.aantalPunten());
    }

    @Test
    void eenLTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('l');
        assertEquals(0, vc2.aantalGespeeld());
        assertEquals(0, vc2.aantalGewonnen);
        assertEquals(0, vc2.aantalGelijk);
        assertEquals(0, vc2.aantalVerloren);
        assertEquals(0, vc2.aantalPunten());
    }

    @Test
    void drieGewonnenTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('w');
        vc2.verwerkResultaat('w');
        vc2.verwerkResultaat('w');
        assertEquals(3, vc2.aantalGespeeld());
        assertEquals(3, vc2.aantalGewonnen);
        assertEquals(0, vc2.aantalGelijk);
        assertEquals(0, vc2.aantalVerloren);
        assertEquals(9, vc2.aantalPunten());
    }
    void drieGelijkTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('g');
        vc2.verwerkResultaat('g');
        vc2.verwerkResultaat('g');
        assertEquals(3, vc2.aantalGespeeld());
        assertEquals(0, vc2.aantalGewonnen);
        assertEquals(3, vc2.aantalGelijk);
        assertEquals(0, vc2.aantalVerloren);
        assertEquals(3, vc2.aantalPunten());
    }
    void drieVerlorenTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('v');
        vc2.verwerkResultaat('v');
        vc2.verwerkResultaat('v');
        assertEquals(3, vc2.aantalGespeeld());
        assertEquals(0, vc2.aantalGewonnen);
        assertEquals(0, vc2.aantalGelijk);
        assertEquals(3, vc2.aantalVerloren);
        assertEquals(0, vc2.aantalPunten());
    }
    void eenEenEenTest() {
        Voetbalclub vc2 = new Voetbalclub("FC Leentjer");
        vc2.verwerkResultaat('w');
        vc2.verwerkResultaat('v');
        vc2.verwerkResultaat('g');
        assertEquals(3, vc2.aantalGespeeld());
        assertEquals(1, vc2.aantalGewonnen);
        assertEquals(1, vc2.aantalGelijk);
        assertEquals(1, vc2.aantalVerloren);
        assertEquals(4, vc2.aantalPunten());
    }
}
// extra comment voor andere account :P -NL