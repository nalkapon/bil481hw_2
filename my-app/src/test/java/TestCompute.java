import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class TestCompute {

    private Compute c;
    private MessageQueue mq;

    @Before
    public void setUp() {
        mq = mock(MessageQueue.class);
        c = new Compute(mq);
    }

    @Test
    public void test1() {
        when(mq.size()).thenReturn(0);
        int result = c.countNumberOfOccurrences("test");
        assertEquals(-1, result);
    }

    @Test
    public void test2() {
        when(mq.size()).thenReturn(3);
        when(mq.contains(anyString())).thenReturn(false);

        int result = c.countNumberOfOccurrences("test");

        assertEquals(0, result);
        verify(mq, times(1)).size();
        verify(mq, times(1)).contains("test");
        verifyNoMoreInteractions(mq);
    }

    @Test
    public void test3() {
 
    when(mq.size()).thenReturn(4);
    when(mq.contains("test")).thenReturn(true);
    
    c = new Compute(mq);
    
    when(mq.getAt(0)).thenReturn("test");
    when(mq.getAt(1)).thenReturn("test");
    when(mq.getAt(2)).thenReturn("tes");
    when(mq.getAt(3)).thenReturn("te");
    
    int result=c.countNumberOfOccurrences("test");
    assertEquals(result,2);
    }
}

