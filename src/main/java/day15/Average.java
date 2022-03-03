package day15;

public class Average {

	public static void main(String[] args) {
		Average objj = new Average();
		double av = objj.av(4.29,2.01,4.88,1.09);
		System.out.println("Avgerage is " + av );
		
		
		// TODO Auto-generated method stub

	}
	public double av(double a, double b, double c, double d) {
		double result = (a+b+c+d)/4;
		displayMsg("Printing");
		return result;
	}
	private void displayMsg(String msg) {
		System.out.println(msg);
	}

}