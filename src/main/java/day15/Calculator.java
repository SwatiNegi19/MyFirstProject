package day15;

public class Calculator {

	public static void main(String[] args) {
		Calculator objj = new Calculator();
		int sum= objj.ad(4,3);
		int sub= objj.su(4,3);
		int mul= objj.mu(4,3);
		int div= objj.di(10,5);
		System.out.println("Addition:" + sum +"\nSubtraction:" + sub +"\nMultiplication:"+ mul +"\nDivision:"+ div);
		// TODO Auto-generated method stub

	}
	public int ad(int a, int b) {
		return a+b;
	}
	public int su(int c, int d) {
		return c-d;
	}
	public int mu(int e, int f) {
		return e*f;
	}
	public int di(int g, int h) {
		return g/h;
	}

}