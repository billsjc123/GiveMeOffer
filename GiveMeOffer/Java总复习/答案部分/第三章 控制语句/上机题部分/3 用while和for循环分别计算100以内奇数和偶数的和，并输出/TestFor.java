public class TestFor{
	public static void main(String [] args){
		int jishu = 0;
		int oushu = 0;
		for(int i=1; i<=100; i++){
			if(i % 2 == 0){
				oushu++;
			}else{
				jishu++;
			}
		}
		System.out.println("jishu=" + jishu);
		System.out.println("oushu=" + oushu);
	}
}