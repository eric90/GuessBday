/* Eric Fakhourian    */
import java.util.*;

public class GuessBday {
	public static void main(String[] args){
		String list1 = 
				"1  3  5  7\n"  +
				"9  11 13 15\n" +
				"17 19 21 23\n" +
				"25 27 29 31\n";
		String list2 = 
				"2  3  6  7\n"  +
				"10 11 14 15\n" +
				"18 19 22 23\n" +
				"26 27 30 31\n";
		String list3 =
				"4  5  6  7\n"  +
				"12 13 14 15\n" +
				"20 21 22 23\n" +
				"28 29 30 31\n";
		String list4 = 
				"8  9  10 11\n"  +
				"12 13 14 15\n" +
				"24 25 26 27\n" +
				"28 29 30 31\n";
		String list5 =
				"16 17 18 19\n"  +
				"20 21 22 23\n" +
				"24 25 26 27\n" +
				"28 29 30 31\n";
		int day = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Is your Bday in list1?\n");
		System.out.println(list1);
		System.out.println("\n enter 0 for no and 1 for yes: ");
		int ans = input.nextInt();
		
		if ( ans == 1)
			day += 1;
		
		System.out.println("Is your Bday in list2?\n");
		System.out.println(list2);
		System.out.println("\n enter 0 for no and 1 for yes: ");
		ans = input.nextInt();
		
		if ( ans == 1)
			day += 2;
		
		System.out.println("Is your Bday in list3?\n");
		System.out.println(list3);
		System.out.println("\n enter 0 for no and 1 for yes: ");
		ans = input.nextInt();
		
		if(ans == 1)
			day += 4;
		System.out.println("Is your Bday in list4?\n");
		System.out.println(list4);
		System.out.println("\n enter 0 for no and 1 for yes: ");
		ans = input.nextInt();
		
		if ( ans == 1)
			day += 8;
		
		System.out.println("Is your Bday in list5?\n");
		System.out.println(list5);
		System.out.println("\n enter 0 for no and 1 for yes: ");
		ans = input.nextInt();
		
		if( ans == 1)
			day += 16;
		
		System.out.println("\nYour BDAY is " + day + "!!!!!!!!!");
		
		input.close();
	}

}
