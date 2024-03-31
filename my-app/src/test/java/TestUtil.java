import org.junit.Test;
import static org.junit.Assert.*;
public class TestUtil {

    @Test
    public void test1() {
        Util util = new Util();
        boolean result = util.compute(5);
        assertFalse(result);  
    }

    @Test
    public void test2() {
        Util util = new Util();
        int []numbers={1,2,3,4};
        boolean result = util.compute(numbers);
        assertFalse(result);  
    }
    
   @Test 
    public void test3() {
         Util util = new Util();     
 	 int[] numbers = {0,2,0};
    	boolean result = false;
    try{
      util.compute(numbers);
    } catch(RuntimeException e){
        result = true;
    }
    
    assertTrue(result);
            

    }

    @Test
    public void test4() {
        Util util = new Util();
        int []numbers={2,4,6};    
        assertTrue(util.compute(numbers));  
    }

    @Test
    public void test5() {
        Util util = new Util();
        int []numbers={2,4,7};
        assertFalse(util.compute(numbers));
    }
}

