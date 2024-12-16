package C6;

public class Sample6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car7 car1=new Car7("1號車");
		car1.start();
		try {
			car1.join();
		}
		catch(InterruptedException e){
			
		}
		System.out.println("結束main()的工作");
	}

}
class Car7 extends Thread{
	private String num;
	public Car7(String n) {
		num=n;
	}
	public void run() {
		for(int i=0;i<5;i++)
		System.out.println("現在正在處理"+num+"的工作");
	}
}