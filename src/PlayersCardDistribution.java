
public class PlayersCardDistribution {
	
	private String player1;
	private String player2;
	private String player3;
	private String player4;
	public PlayersCardDistribution(int [] a)
	{
		setPlayer1(a[0]);
		setPlayer2(a[1]);
		setPlayer3(a[2]);
		setPlayer4(a[3]);
	}
	public void setPlayer1(int x)
	{
		if(x==1) player1="Assassin";
		if(x==2) player1="Victim";
		if(x==3) player1="Police";
		if(x==4) player1="Friend";
	}
	public String getPlayer1()
	{
		return this.player1;
	}
	public void setPlayer2(int x)
	{	
		if(x==1) player2="Assassin";//chor
		if(x==2) player2="Victim";//Dakat
		if(x==3) player2="Police";//Vabu
		if(x==4) player2="Friend";//Police
	}
	public String getPlayer2()
	{
		return this.player2;
	}
	public void setPlayer3(int x)
	{
		if(x==1) player3="Assassin";
		if(x==2) player3="Victim";
		if(x==3) player3="Police";
		if(x==4) player3="Friend";
	}
	public String getPlayer3()
	{
		return this.player3;
	}
	public void setPlayer4(int x)
	{
		if(x==1) player4="Assassin";
		if(x==2) player4="Victim";
		if(x==3) player4="Police";
		if(x==4) player4="Friend";
	
	}
	public String getPlayer4()
	{
		return this.player4;
	}
	public void displayPlayer()
	{
		System.out.println("Player1: "+player1);
		System.out.println("player2: "+player2);
		System.out.println("player3: "+player3);
		System.out.println("player4: "+player4);
	}
}
