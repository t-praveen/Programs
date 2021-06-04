//TOWER OF HANOI//

package Recursion;

public class TowerofHanoi {

	public static void main(String args[])
	{
		int discs = 3 ;
		doTowers(discs , 'A','B','C');
	}
	public static void doTowers(int topN , char from , char inter , char to)
	{
		if(topN == 1)
		{
			System.out.println("Disc 1 from "+from+" to "+to);
		}
		else
		{
			doTowers(topN - 1 , from , to , inter);
			System.out.println("Disk "+topN+" from "+from+" to "+to);
			doTowers(topN - 1,inter,from,to);
		}
	}
	
}
