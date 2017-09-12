public class Cat
{
	public String name;
	private int age;
	private String owner;
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setOwner(String o)
	{
		owner = o;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public void eat(String food)
	{
		System.out.println(name + " just ate " + food + "!");
	}
}