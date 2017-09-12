import java.awt.Color;
public class Lion extends Cat
{
	private Color maneColor;
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setManeColor(Color m)
	{
		m = maneColor;
	}
	
	public void roar()
	{
		System.out.println(name + " just roared!");
	}
}