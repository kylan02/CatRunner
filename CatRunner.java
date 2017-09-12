import java.awt.Color;

public class CatRunner
{
	public static void main(String[] args)
	{
		Cat blake = new Cat();
		blake.setName("Ben");
		blake.eat("cat food");
		blake.setAge(5);
		blake.setOwner("Kylan");
		
		Lion leo = new Lion();
		leo.setName("Leo");
		leo.setManeColor(Color.ORANGE);
		leo.roar();
	}
}