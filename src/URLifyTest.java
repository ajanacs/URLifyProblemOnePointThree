import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ajana on 6/9/2017.
 */
public class URLifyTest {
    @Test
    public void test(){
        String input="gi rly";
        char resultARR[]= URLify.replaceSpaces(input);
        String output="gi%20rly";
        char expectedResut[]=output.toCharArray();
        assertArrayEquals(expectedResut,resultARR);

    }

}