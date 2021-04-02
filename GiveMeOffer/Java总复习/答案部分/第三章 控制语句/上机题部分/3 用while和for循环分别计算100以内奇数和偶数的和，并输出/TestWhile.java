public class TestWhile{
	public static void main(String [] args){
		int jishu = 0;
		int oushu = 0;
		int num = 100;
		while(num >= 1){
			if(num % 2 == 0){
				oushu++;
			}else{
				jishu++;
			}
			num--;
		}
		System.out.println("jishu=" + jishu);
		System.out.println("oushu=" + oushu);
	}
}