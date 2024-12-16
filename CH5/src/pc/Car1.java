package pc;

public class Car1 {
	private int num;
	private double gas;
	public Car1() {
		num=0;
		gas=0;
		System.out.println("產生了汽車");
	}
	public void setcar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
