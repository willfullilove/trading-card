import java.util.List;
import java.util.ArrayList;

/**
 * Add a description!
 * @author yourNameHere
 * @version 1.0 <- increment this as you make changes and delete this note!
 */
public class CardCollection 
{
	private String owner;
	private List<Card> myCollection;
	
	/**
	 * Add a description!
	 * @param owner
	 */
	public CardCollection(String owner)
	{
		
	}
	
	/**
	 * Add a description!
	 * @param other
	 * @return
	 */
	public boolean addCard(Card other)
	{
		return false;
	}
	
	/**
	 * Add a description!
	 * @param i
	 */
	public void removeCard(int i)
	{
		
	}
	/**
	 * Add a description!
	 * @return
	 */
	public int getSize()
	{
		return 0;
	}
	
	/**
	 * Add a description!
	 * @param other
	 * @return
	 */
	public List<Card> mergeCollections(CardCollection other)
	{
		List<Card> duplicates = new ArrayList<Card>();
		
		return duplicates;
	}
	
	/**
	 * Add a description!
	 */
	@Override
	public String toString()
	{
		return "";
	}
	
	/**
	 * Gets the List of Cards - Don't touch this method!
	 * @return myCollection
	 */
	public List<Card> getCollection()
	{
		return myCollection;
	}
}
