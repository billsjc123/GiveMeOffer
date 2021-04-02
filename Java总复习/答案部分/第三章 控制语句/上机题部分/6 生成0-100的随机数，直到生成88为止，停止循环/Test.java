public class Test{
	public static void main(String [] args){
		int num = 0;
		while(true){
			num = (int)(Math.random()*100 + 1);
			System.out.println(num);
			if(num == 88){
				break;
			}
		}
	}
}