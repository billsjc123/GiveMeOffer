import java.util.Scanner;
public class Test{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input num:");
		int num = input.nextInt();
		switch(num){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:System.out.println("31 day!"); break;
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:System.out.println("29 day!"); break;
			default:System.out.println("Input error!");
		}
	}
}