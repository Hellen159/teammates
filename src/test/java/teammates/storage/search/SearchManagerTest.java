package teammates.storage.search;
import teammates.storage.search.SearchManager;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;


public class SearchManagerTest {
     private SearchManager sc;

     @Before
     public void setup(){
        sc = new SearchManager();

     }

    @Test
    public void testCleanSpecialChars1() {
        String input = "\"\"\"";
        String expected = "";
        
        String result = sc.cleanSpecialChars(input);
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void testCleanSpecialChars2() {
        String input = "\"\"\"\"";
        String expected = "\"\"";
        
        String result = sc.cleanSpecialChars(input);

        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void testCleanSpecialChars3() {
        String input = "hfmdf@hotmail.com";
        String expected = "\"hfmdf@hotmail.com\"";
        
        String result = sc.cleanSpecialChars(input);
        
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCleanSpecialChars4() {
        String input = "hfmdfhotmail.com";
        String expected = "hfmdfhotmail.com";
        
        String result = sc.cleanSpecialChars(input);
        
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testCleanSpecialChars5() {
        String input = "\"\"hfmdf@hotmail.com\"";
        String expected = "hfmdfhotmail.com";
        
        String result = sc.cleanSpecialChars(input);
        
        Assert.assertEquals(expected, result);
    }
}
