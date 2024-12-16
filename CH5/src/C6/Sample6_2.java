package C6;

public class Sample6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car1=new Car4("1號車");
		car1.start();
		Car4 car2=new Car4("2號車");
		car2.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的工作");
		}
	}

}
class Car4 extends Thread{
	private String name;
	public Car4(String nm) {
		name=nm;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行"+name+"的處理工作");	
		}
	}
	
}
