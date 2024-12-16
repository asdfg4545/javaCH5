package C6;

public class Sample6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car6 car1=new Car6("1號車");
		car1.start();
		for(int i=0;i<5;i++) {
		try {
			Thread.sleep(1000);
			System.out.println("正在處理main()的工作");
		}
		catch(InterruptedException e){
			
			
		}
		}
	}

}
class Car6 extends Thread{
	private String num;
	public Car6(String n) {
		num=n;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在處理"+num+"的工作");		
			}
	}
}