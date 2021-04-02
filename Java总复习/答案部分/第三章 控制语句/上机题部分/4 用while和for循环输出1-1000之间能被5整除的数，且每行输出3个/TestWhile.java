public class TestWhile{
	public static void main(String [] args){
		int num = 1000;
		int n = 0;
		while(num > 1){
			if(num % 5 == 0){
				System.out.print(num + "\t");
				n++;
				if(n == 3){
					System.out.println();
					n = 0;
				}
			}
			num--;
		}
	}
}