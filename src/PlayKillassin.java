package To_Team_Killassin;

import java.util.Scanner;
public class PlayKillassin {
	
	private int scoreOfPlayer1=10000;
	private int scoreOfPlayer2=10000;
	private int scoreOfPlayer3=10000;
	private int scoreOfPlayer4=10000;
	
	public void setPlayKillassin()
	{
		this.scoreOfPlayer1=10000;
		this.scoreOfPlayer2=10000;
		this.scoreOfPlayer3=10000;
		this.scoreOfPlayer4=10000;
	}
	
	
	public void increaseScoreOfPolice(int cop)
	{
		if(cop==1)this.scoreOfPlayer1+=500;
		if(cop==2)this.scoreOfPlayer2+=500;
		if(cop==3)this.scoreOfPlayer3+=500;
		if(cop==4) this.scoreOfPlayer4+=500;
	}
	
	
	public void decreaseScoreOfPolice(int cop)
	{
		if(cop==1) this.scoreOfPlayer1-=500;
		if(cop==2)this.scoreOfPlayer2-=500;
		if(cop==3)this.scoreOfPlayer3-=500;
		if(cop==4)this.scoreOfPlayer4-=500;
	}
	
	public void increaseScoreOfFriend(int fr)
	{
		if(fr==1)this.scoreOfPlayer1+=500;
		if(fr==2)this.scoreOfPlayer2+=500;
		if(fr==3)this.scoreOfPlayer3+=500;
		if(fr==4)this.scoreOfPlayer4+=500;
	}
	
	public void decreaseScoreOfFriend(int fr)
	{
		if(fr==1) this.scoreOfPlayer1-=500;
		if(fr==2)this.scoreOfPlayer2-=500;
		if(fr==3)this.scoreOfPlayer3=-500;
		if(fr==4)this.scoreOfPlayer4-=500;
	
	}
	public void showPoint()
	{
		System.out.println("Player1: "+scoreOfPlayer1+"\nPlayer2: "+scoreOfPlayer2
						+"\nPlayer3: "+scoreOfPlayer3+"\nPlayer4: "+scoreOfPlayer4);
	}
	
	public String showPolice(String name1,String name2,String name3,String name4)
	{
            String str="";
            if(name1.equals("Police")) 
                {
                   // System.out.println("Player1: Police");
                    str=name1;
                }
        	if(name2.equals("Police")) 
                {
                    //System.out.println("Player2: Police");
                    str= name2;
                }
		if(name3.equals("Police"))
                {
                    //System.out.println("Player3: Police");
                    str= name3;
                }
		if(name4.equals("Police")) 
                {
                    //System.out.println("Player4: Police");
                    str= name4;
                }
                return str;
        }
	public void showFriend(String name1,String name2,String name3,String name4)
	{
		if(name1.equals("Friend")) System.out.println("Player1: Friend");
		if(name2.equals("Friend")) System.out.println("Player2: Friend");
		if(name3.equals("Friend")) System.out.println("Player3: Friend");
		if(name4.equals("Friend")) System.out.println("Player4: Friend");
	}
	public boolean findKillerByPolice(String name1,String name2,String name3,String name4)
	{
		int cop = 0;
		String guess[]=new String[20];
		guess[0]=name1;
		guess[1]=name2;
		guess[2]=name3;
		guess[3]=name4;
		for(int i=0;i<4;i++)
		{
			if(guess[i].equals("Police")) cop=i+1;
		}
		Scanner input=new Scanner(System.in);
		System.out.printf("\t\tHello cop\n\twhich one is the assassin???: ");
		int x=input.nextInt();
		if(guess[x-1].equals("Assassin")) 
		{
			//System.out.println("Congrats");
			increaseScoreOfPolice(cop);
			return true;
		}
		else
		{
			decreaseScoreOfPolice(cop) ;
			return false;
		}
	}
	
	public boolean findKillerByFriend(String name1,String name2,String name3,String name4)
	{
		int fr=0;
		String guess[]=new String[20];
		guess[0]=name1;
		guess[1]=name2;
		guess[2]=name3;
		guess[3]=name4;
		for(int i=0;i<4;i++)
		{
			if(guess[i].equals("Friend")) fr=i+1;
		}
		Scanner input=new Scanner(System.in);
		System.out.printf("\n\n\t\tHello Friend\n\twhich one is the assassin???: ");
		int x=input.nextInt();
		if(guess[x-1].equals("Assassin"))
		{
			increaseScoreOfFriend(fr);
			return true;
		}
		else
		{
			decreaseScoreOfFriend(fr);
			return false;
		}
	}
}