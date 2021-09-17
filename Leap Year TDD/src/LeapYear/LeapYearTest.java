package LeapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
	
	@Test
    public void checkToGetOutput(){
    	LeapYear leapYearImpl = new LeapYear();
        Assert.assertTrue(leapYearImpl.isLeapYear(2000));
    }
}
