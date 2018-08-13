
public class GamePlayer implements IGamePlayer
{
	String playername;
	String user,password;

	public GamePlayer(String name)
	{
		// TODO Auto-generated constructor stub
		this.playername=name;
	}
	

	@Override
	public void login(String user, String password) 
	{
		this.user=user;
		this.password=password;
		System.out.println("Please use proxy to access");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void killboss() {
		System.out.println("Please use proxy to access");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upgrade() {
		System.out.println("Please use proxy to access");
		// TODO Auto-generated method stub
		
	}

	@Override
	public IGamePlayer getproxy() 
	{
		IGamePlayer gproxy =new GamePlayerProxy(playername);
		return gproxy;
		
	}

}
