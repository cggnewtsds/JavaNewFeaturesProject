package cgg.defaultandstaticmethods;

public class Welcome implements I1,I2 {

	@Override
	public void display() {
		//System.out.println("Hello");
		I1.super.display();
	}
	
	public static void main(String[] args) {
		Welcome welcome = new Welcome();
		welcome.display();
	}
}
