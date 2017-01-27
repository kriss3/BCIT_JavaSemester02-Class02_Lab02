package pl.kriss3.class2.homelab;

public class Runner 
{
	public static void main(String[] args)
	{
		System.out.println("Let's play SKUNK !!!");
		Run();
		System.out.println("Finished !!");
	}
	
	private static void Run()
	{
		Setup skunk = new Setup();
		Game g = new Game();
		g.Play(skunk);
	}
}
