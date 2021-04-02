import java.util.Scanner;
public class Test{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input number:");
		int num = input.nextInt();
		System.out.println("Result=" + fac(num));
	}
	public static int fac(int n){
		int result = 0;
		if(n == 1){
			result = 1;
		}else{
			result = n * fac(n - 1);
		}
		return result;
	}
}