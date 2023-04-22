import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
   @Test
    public void shouldCheckIfBlank(){
       char []charArray=new char[]{'a', 'b', 'c'};
        boolean ifBlank=StringUtils.isBlank(charArray);
        assertFalse(ifBlank);
    }
    @Test
    public void shouldBeRussian(){
       char[] charArray = new char[]{'а', 'б', 'в'};
       boolean isRussian=StringUtils.isRussian(charArray);
       assertTrue(isRussian);
    }
    @Test
    public void shouldContainSmallPart(){
        char[] charArray = new char[]{'а', 'б', 'в'};
        char[] charArray2 = new char[]{'а', 'б'};
        boolean isContains=StringUtils.ifContains2(charArray2,charArray);
        assertTrue(isContains);
    }
    @Test
    public void shouldParseIntoInt(){
        char[] charArray = new char[]{'3', '2', '1'};
        int expectedNum=StringUtils.parseInt(charArray);
        assertEquals(expectedNum, 321);
    }
}
