/**
 * 
 * @author yourNameHere
 *
 */
public class Card implements Comparable<Card>
{
	private String name;
	private String nationality;
	private int yearBorn;
	private int yearDied;
	
	public Card(String name, String nationality, int yearBorn, int yearDied)
	{
		
	}
	
	
	@Override
	public int compareTo(Card o) 
	{
		return 0;
	}
	
	@Override
	public String toString()
	{
		return "";
	}
	
}
