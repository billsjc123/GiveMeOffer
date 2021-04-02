public class TestFor{
	public static void main(String [] args){
		int n = 0;
		for(int i=1000; i>=1; i--){
			if(i % 5 == 0){
				System.out.print(i + "\t");
				n++;
				if(n == 3){
					System.out.println();
					n = 0;
				}
			}
		}
	}
}