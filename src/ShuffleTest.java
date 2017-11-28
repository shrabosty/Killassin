import java.util.Scanner;
public class ShuffleTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	/*	int []a =new int[] {1,2,3,4};
		String st;
		Shuffle s =new Shuffle();
		s.shuffleArray(a);
		PlayersCardDistribution Player= new PlayersCardDistribution(a);
		Player.displayPlayer();
		PlayKillassin play = new PlayKillassin();
		play.setInitialPointForEveryPlayer();
		play.showPoint();
		play.showPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
		play.showFriend(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
	*/
		Scanner input= new Scanner(System.in);
		int i=0;
		//PlayKillassin play = new PlayKillassin();
		PlayKillassin play = new PlayKillassin();
		while(true)
		{
			i++;
			System.out.println("\t\t1.Shuffle");
			System.out.println("\t\t2.Exit");
			int choice=input.nextInt();
			if(choice==1)
			{
				int []a =new int[] {1,2,3,4};
				String st;
				Shuffle s =new Shuffle();
				s.shuffleArray(a);
				PlayersCardDistribution Player= new PlayersCardDistribution(a);
				Player.displayPlayer();
				System.out.printf("\n\n");

				//PlayKillassin play = new PlayKillassin();
				System.out.println("Shuffle "+i);
				play.showPoint();
				System.out.printf("\n\n");
				play.showPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
				play.showFriend(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
				boolean dummy,dummy1;
				dummy=play.findKillerByPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
				dummy1=play.findKillerByFriend(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
				if(dummy1) System.out.println("\t\tWell done Friend.\n\tKeep scoring");
				if(!dummy1)System.out.println("\t\tOh you missed it.\n\tLet's shuffle again.");
				if(dummy) System.out.println("\t\tGreat job cop\n");
				if(!dummy)System.out.println("\t\tOoops cop!!!\n\tBetter luck next time");
				
				play.showPoint();
			
			}
			else if(choice==2) System.exit(1);
			
		}
	
	}

}
