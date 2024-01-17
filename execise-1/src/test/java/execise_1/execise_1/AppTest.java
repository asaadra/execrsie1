package execise_1.execise_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void order_aopproved()
    {
       //Arrange
    	final String expected_result="Accepted";
    	int data=5;
    	//Act
    	String actual=App.order_number(data);
    	
    	//Assert
    	org.junit.Assert.assertEquals( actual,expected_result);
    }
    @Test
    public void order_not_aopproved()
    {
       //Arrange
    	final String expected_result="Not Accepted";
    	int data=20;
    	//Act
    	String actual=App.order_number(data);
    	
    	//Assert
    	org.junit.Assert.assertEquals( actual,expected_result);
    }
}
