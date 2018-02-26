
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;


public class CardTest 
{
	private Card card1;
	private Card card2;
	
	@Before
	public void setUp() throws Exception
	{
		card1 = new Card("Alan Turing", "British", 1912,1954);
	}
	
	@After
	public void tearDown() throws Exception
	{
		card1 = null;
	}
	
	@Test
	public void constructorTest()
	{
		
	}
	
	@Test
	public void comparisonTest1()
	{
		
	}
	
	@Test
	public void comparisonTest2()
	{
		
	}
}
