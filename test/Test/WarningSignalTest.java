
package Test;

import AlienInvasion.Aliens;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import AlienInvasion.WarningSignal;
/**
 *
 * @author Dell PC
 */
public class WarningSignalTest {
    
    WarningSignal signal=new WarningSignal();
    
    public WarningSignalTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
  
    @Test
    public void testcountBase(){
        
            
            String s="cats";
            int expected=4;
            assertEquals(expected, signal.countBase(s));
            
    
    }
    
    @Test
    public void testTranslate(){
    
            String s="zig";
            int expected=11;
            
            int base=signal.countBase(s);
            assertEquals(expected,signal.translate(s, base));
    }
    
}
