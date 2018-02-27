
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Test class for Card
 * @author Stephen Goebel
 * @version 1.0
 */
public class CardTest 
{
	private Card card1;
	private Card card2;
	private Card card3;
	
	/**
	 * Creates necessary objects
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		card1 = new Card("Alan Turing", "British", 1912,1954);
		card2 = new Card("Vint Cerf", "American", 1943,-1);
		card3 = new Card("Vint Cerf", "American", 1943,-1);
	}
	/**
	 * Tears down all objects
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		card1 = null;
		card2 = null;
	}
	
	/**
	 * Tests the Card constructor and toString() methods
	 */
	@Test
	public void constructorTest()
	{
		assertEquals("Your constructor and/or toString() is not correct.","Alan Turing (1912-1954) - British",card1.toString());
		assertEquals("Your constructor and/or toString are not handling a living person card correctly", "Vint Cerf (1943-present) - American",card2.toString());
	}
	
	/**
	 * Tests compareTo()
	 */
	@Test
	public void comparisonTest1()
	{
		assertEquals("compareTo() is not sorting correctly by name alphabetically.",1,card2.compareTo(card1));
	}
	
	/**
	 * Tests compareTo()
	 */
	@Test
	public void comparisonTest2()
	{
		assertEquals("compareTo() should return 0 if two cards are equal.",0,card2.compareTo(card3));
	}
	
	/**
	 * Tests compareTo()
	 */
	@Test
	public void comparisonTest3()
	{
		assertEquals("compareTo() is not sorting correctly by name alphabetically.",-1,card1.compareTo(card2));
	}
}
