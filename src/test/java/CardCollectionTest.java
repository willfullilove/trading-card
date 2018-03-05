import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Test class for CardCollection
 * @author Stephen Goebel
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
		assertEquals("Your constructor is not assigning the owner correctly","John",john.getOwner());
		assertEquals("Your toString and/or constructor are not correct","John\n-----\n",john.toString());
	}
	
	@Test
	public void addCardTest()
	{
		john.addCard(card1);
		assertEquals("addCard is not adding a new card properly",1,john.getCollection().size());
		john.addCard(card1);
		assertEquals("addCard should not add duplicate cards",1,john.getCollection().size());
	}
	
	@Test
	public void removeCardTest()
	{
		john.addCard(card1);
		john.removeCard(0);
		assertEquals("removeCard does not remove the Card at the selected position",0,john.getCollection().size());
	}
	
	@Test
	public void mergeCollectionsTest()
	{
		john.addCard(card1);
		amy.addCard(card2);
		john.mergeCollections(amy);
		assertEquals("Two collections with no duplicates between them should merge perfectly into the first collection",2,john.getCollection().size());
		assertEquals("The second collection that is merged into the first should be empty afterwards",0,amy.getCollection().size());
	}
}
