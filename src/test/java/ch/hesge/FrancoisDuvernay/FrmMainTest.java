package ch.hesge.FrancoisDuvernay;

import ch.hesge.FrancoisDuvernay.domaine.Personne;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 *
 * @author francois.duvernay
 */
public class FrmMainTest {
    
    @Test
    public void testAjoutPersonne() {
        FrmMain main = new FrmMain();
        ArrayList idsCadeau = new ArrayList();
        idsCadeau.add(1);
        idsCadeau.add(2);
        main.listPersonnes.add(new Personne("Bob", idsCadeau));
        Personne p = (Personne)main.listPersonnes.get((main.listPersonnes.size() - 1));
        assertEquals(p.toString(),"Bob");
    }

    @Test
    public void testTabToList() {
        FrmMain main = new FrmMain();
        ArrayList l = new ArrayList();
        l.add("CH");
        l.add("FR");
        l.add("GE");
        l.add("DE");
        String tab[] = {"CH", "FR", "GE", "DE"};
        assertEquals(main.tabToList(tab), l);
    }
}
