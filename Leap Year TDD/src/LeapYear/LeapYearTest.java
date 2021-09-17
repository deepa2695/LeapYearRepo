package LeapYear;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {
	
public LeapYear leapYear;
	
	@Before
	public void initiaLizeLeapYearClass(){
		leapYear = new LeapYear();
	}
	
	@Test
    public void checkToGetOutput(){
        Assert.assertTrue(leapYear.isLeapYear(2000));
    }
	
	@Test
    public void isLeapYearTest(){
        Assert.assertTrue(leapYear.isLeapYear(2000));
    }
	
	@Test
    public void isNonLeapYearTest(){
        Assert.assertFalse(leapYear.isLeapYear(2001));
    }
}
