package ex;

public class Sample5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car1=new Car2();
		try {
			car1.setcar(1234,-10);
		}
		catch(CarException e) {
			System.out.println("拋出"+e+"了");
		}
		car1.show();
	}

}
