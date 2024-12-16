package C6;
import java.io.IOException;
public class Sample6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car5 car1=new Car5("1號車");
		car1.start();
		for(int i=0;i<5;i++) {
			System.out.println("正在進行main()的工作");
		}
	}

}
class Car5 extends Thread{
	private String name;
	public Car5(String nm) {
		name=nm;
	}
	public void run() {	
		for(int i=0;i<5;i++) {
		try {
				sleep(1000);
				System.out.println("正在處理"+name+"的工作");
			}
		
		catch(InterruptedException e) {
		}
		
		}
	}
}
