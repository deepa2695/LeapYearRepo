package LeapYear;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearTest {
	
	public LeapYear leapYear;
	
	@Test
    public void checkToGetOutput(){
    	leapYear = new LeapYear();
        Assert.assertTrue(leapYear.isLeapYear(2000));
    }
}
