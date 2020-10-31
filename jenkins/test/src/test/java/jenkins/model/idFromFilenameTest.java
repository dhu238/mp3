import jenkins.model.*;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;


public class idFromFilenameTest {
@Test 
     public void idFromFilenameTest1() {
        IdStrategy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        String filename = "$0021abcd"; 
        String returnValue = cs.idFromFilename(filename);
        assertEquals(returnValue, "!abcd");
    }
    
    @Test
    public void IdFromFilenameTest2() {
        IdStrategy.CaseSensitive cs = new IdStrategy.CaseSensitive();
        String filename = "abcd$21"; 
        String returnValue = cs.idFromFilename(filename);
        assertEquals(returnValue, "abcd!");
    }
    
}
