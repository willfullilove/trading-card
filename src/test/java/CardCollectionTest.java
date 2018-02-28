import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Test class for CardCollection
 * @author stephengoebel
 * @version 1.0
 */
public class CardCollectionTest 
{
	private CardCollection john;
	private CardCollection amy;
	private Card card1;
	private Card card2;
	
	@Before
	public void setUp() throws Exception
	{
		john = new CardCollection("John");
		amy = new CardCollection("Amy");
		card1 = new Card("Alan Turing", "British", 1912,1954);
		card2 = new Card("Vint Cerf", "American", 1943,-1);
	}
	
	@After
	public void tearDown() throws Exception
	{
		john = null;
		amy = null;
		card1 = null;
		card2 = null;
	}
	
	@Test
	public void constructorTest()
	{
		
	}
	
	@Test
	public void addCardTest()
	{
		
	}
	
	@Test
	public void removeCardTest()
	{
		
	}
	
	@Test
	public void mergeCollectionsTest()
	{
		
	}
}
