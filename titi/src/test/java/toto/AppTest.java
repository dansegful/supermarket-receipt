package toto;


import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    void testV(){
	    assertThat("hola").isEqualTo("hola");
    }
}
