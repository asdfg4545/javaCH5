package ex;
class CarException extends Exception{
	
	
}
public class Car2 {
	private int num;
	private double gas;
	public Car2() {
		num=0;
		gas=0;
		System.out.println("生產了汽車");
	}
	public void setcar(int n,double g)throws CarException {
		if(g<0) {
			CarException e=new CarException();
			throw e;
		}else {
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
			
		}
		
	}
	public void show() {
		System.out.println("車號為"+num);
		System.out.println("汽油量為"+gas);
	}
}
