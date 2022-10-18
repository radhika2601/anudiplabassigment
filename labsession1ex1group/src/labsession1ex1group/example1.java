package labsession1ex1group;
import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your roll no");
		int x= obj.nextInt();
		//int z=x%4;
		//System.out.println("Z="+z);
		if(x%4==1)
		{
			System.out.println("Emerald group");
			//1 ,5,9,13
		}
		else if(x%4==2)
		{
			System.out.println("ruby group");
			// 2,6,8,10
		}
		else if(x%4==3)
		{
			System.out.println("perl group");
			// 3,7,11,15
		}
		else if(x%4==4)
		{
			System.out.println("saphair group");
			// 3,7,11,15
		}
		}
	}


