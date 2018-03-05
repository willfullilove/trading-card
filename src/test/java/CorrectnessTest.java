import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.List;

/**
 * More specific tests of the project - looking at edge cases.
 * @author Stephen Goebel
 * @version 1.0
 */
public class CorrectnessTest 
{
	private CardCollection c1;
	private CardCollection c2;
	private Card turing;
	private Card hopper;
	private Card vonneumann;
	private Card shannon;
	private Card johnson;
	private Card lovelace;
	private Card cerf;
	private Card brin;
	private List<Card> dupes;
	
	@Before
	public void setUp() throws Exception
	{
		c1 = new CardCollection("Alan"); 
		c2 = new CardCollection("Grace");
		turing = new Card("Alan Turing","British",1912,1954);
		hopper = new Card("Grace Hopper","American",1906,1992);
		vonneumann = new Card("John Von Neumann","Hungarian",1903,1957); 
		shannon = new Card("Claude Shannon","American",1916,2001);
		johnson = new Card("Katherine Johnson","American",1918,-1); 
		lovelace = new Card("Ada Lovelace","British",1815,1852);
		cerf = new Card("Vint Cerf","American",1943,-1);
		brin = new Card("Sergey Brin","Russian",1973,-1);
		c1.addCard(turing); c1.addCard(vonneumann); c1.addCard(shannon); c1.addCard(johnson); c1.addCard(cerf); c1.addCard(brin);
		c2.addCard(cerf); c2.addCard(lovelace); c2.addCard(johnson); c2.addCard(vonneumann); c2.addCard(hopper);
	}
	
	@After
	public void tearDown() throws Exception
	{
		c1 = null;
		c2 = null;
		turing = null;
		hopper = null;
		vonneumann = null;
		shannon = null;
		johnson = null;
		lovelace = null;
		cerf = null;
		brin = null;
	}
	
	@Test
	public void test1()
	{
		assertTrue("You are not putting the cards in order inside the List",c1.getCollection().get(5).equals(cerf));
		assertTrue("You are not putting the cards in order inside the List",c2.getCollection().get(3).equals(johnson));
	}
	
	@Test
	public void test2()
	{
		assertEquals("getSize() is not working properly",6,c1.getSize());
		dupes = c1.mergeCollections(c2);
		assertEquals("The second collection should be empty after a merge",0,c2.getSize());
		assertEquals("Your merged list is not the correct size",8,c1.getSize());
	}
	
	@Test
	public void test3()
	{
		dupes = c2.mergeCollections(c1);
		assertEquals("The second collection should be empty after a merge",0,c1.getSize());
		assertEquals("You are not adding the correct items to the duplicate list",3,dupes.size());
	}
	
	@Test
	public void test4()
	{
		c1.addCard(turing);
		c1.addCard(shannon);
		assertEquals("Duplicate cards should not be added to the list of the collection",6,c1.getSize());
		c2.addCard(hopper);
		assertEquals("Duplicate cards should not be added to the list of the collection",5,c2.getSize());
	}
}
