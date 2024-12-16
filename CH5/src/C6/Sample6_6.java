package C6;

public class Sample6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car8 car1=new Car8("1號車");
		Thread th1=new Thread(car1);
		th1.start();
		for(int i=0;i<5;i++) {
			System.out.println("目前正在處理main()的工作");
		}
	}

}
class Car8 implements Runnable{
	private String num;
	public Car8(String n) {
		num=n;
	}
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("目前正在處理"+num+"的工作");
		}
		}
	
}
