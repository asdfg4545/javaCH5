package ex;

public class Sample5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[]test=new int[5];
			System.out.println("將值指定給test[10]");
			test[10]=80;
			System.out.println("將80指定給test[10]");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("超過陣列範圍了");
		}
		finally {
			System.out.println("無論如何，最後都會執行這行");
		}
		System.out.println("順利執行");
	}

}
