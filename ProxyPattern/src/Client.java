import java.util.Scanner;

public class Client 
{
	public static void main(String args[])
	{
		//actual client
		System.out.println("Select the mode to run in: 1. Player 2. Proxy ");
		Scanner sc=new Scanner(System.in);
		int mode=sc.nextInt();
		if(mode==1)
		{
		IGamePlayer player=new GamePlayer("Edward");
		player.login("greatPlayer","password");
		player.killboss();
		player.upgrade();
		}
		else if(mode == 2)
		{
		
		//proxy
	
		IGamePlayer playerpro=new GamePlayer("Edward");
		IGamePlayer proxy=playerpro.getproxy();
		proxy.login("greatPlayer","password");
		proxy.killboss();
		proxy.upgrade();
		}
		else
			System.out.println("Sorry incorrect mode system Exit!");
	}

}
