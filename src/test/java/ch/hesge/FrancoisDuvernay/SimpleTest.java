/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import org.;
/**
 *
 * @author francois.duvernay
 */
public class SimpleTest {

    //@BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    //@Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast test");
    }

    //@Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow test");
    }

}
