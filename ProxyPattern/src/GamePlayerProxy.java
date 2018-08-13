
public class GamePlayerProxy implements IGamePlayer
{
	String playername;
	GamePlayerProxy(String name)
	{
		this.playername=name;
	}
	
	@Override
	public void login(String user, String password) 
	{
		
		System.out.println(playername+ " has successfully logged in via ID: " + user);
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killboss() {
		//gp.killboss();
		System.out.println(playername + " is killing boss!");
		
	}

	@Override
	public void upgrade() 
	{
		//gp.upgrade();
		System.out.println(playername + " has upgraded one level!");
		
	}

	@Override
	public IGamePlayer getproxy() {
		
		return null;
	}

}
