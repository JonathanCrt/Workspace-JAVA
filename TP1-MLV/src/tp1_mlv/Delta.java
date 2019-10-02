package tp1_mlv;

import java.util.Scanner;
import java.lang.Math;

public class Delta {
	

	private double a = 00;
	private double b = 00;
	private double c = 00;
	private double delta = 00;
	private double root1 = 00;
	private double root2= 00;
	
	public Delta(double a, double b, double c, double delta, double root1, double root2) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.delta = delta;
		this.root1 = root1;
		this.root2 = root2;
		
	}

	
	
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}

	public double getDelta() {
		return delta;
	}

	public void setDelta(double delta) {
		this.delta = delta;
	}

	public double getRoot1() {
		return root1;
	}

	public void setRoot1(double root1) {
		this.root1 = root1;
	}

	public double getRoot2() {
		return root2;
	}


	public void setRoot2(double root2) {
		this.root2 = root2;
	}

	
	/**
	 * Return  discriminant according to  mathematical formula delta = b�-4ac
	 * @param a
	 * @param b
	 * @param c
	 * @return delta
	 */
	public void calcDiscriminant() {
		
		delta = (Math.pow(b, 2)) - 4 * a  *c;
		
	}
	
	
	public void calcRoots() {
		
		if (delta  == 0.0) {
			root1 = -b/2*a;
			
		}
		else if(delta > 0.0) {
		
			root1 = (-b - (Math.sqrt(delta))) /(2* a);
			root2 = (-b + (Math.sqrt(delta))) /(2* a);
		}
		
		else if(delta < 0.0 )  {
			//nothing
		}
		
	}
	
	/*
	public static boolean weDontHaveRoots() {

		if(testRoot1.equals(0.0) && testRoot2.equals(0.0)) {
			return true;
		}

		return false;
	}


	public static boolean weHaveOneRoot() {

		if(!testRoot1.equals(0.0) && testRoot2.equals(0.0)) {
			return true;
		}

		return false;
	}
	
	public static boolean weHaveTwoRoot() {

		if(!testRoot1.equals(0.0)  && !testRoot2.equals(0.0)) {
			return true;
		}

		return false;
	}
	*/

	
	public static void main(String[] args) {
		
		
		Scanner scannerForA = new Scanner(System.in);
		double aOut = scannerForA.nextDouble();

		Scanner scannerForB = new Scanner(System.in);
		double bOut = scannerForB.nextDouble();
		
		Scanner scannerForC = new Scanner(System.in);
		double cOut = scannerForC.nextDouble();
		
		scannerForA.close();
		scannerForB.close();
		scannerForC.close();

		// to init output variables
		double deltaOut = 00;
		double root1Out = 00;
		double root2Out = 00;

		String noRoots = "Pas de racine reelle";
		String oneRoot = "Une seule racine reelle : ";
		String twoRoots = "Deux racines reelles : ";

		// to instantiate a new object Delta
		Delta delta = new Delta(aOut, bOut, cOut, deltaOut, root1Out, root2Out);
		
		
		// Set the field with output variables
		delta.setA(aOut);
		delta.setB(bOut);
		delta.setC(cOut);
		delta.setDelta(deltaOut);
		delta.setRoot1(root1Out);
		delta.setRoot2(root2Out);
		
	
		// call class method to calculate discriminant and roots
		delta.calcDiscriminant();
		delta.calcRoots();

		// to retrieve value of roots
		double testRoot1= delta.getRoot1();
		double testRoot2= delta.getRoot2();
		/*
		System.out.println(delta.getDelta());
		System.out.println(testRoot1);
		System.out.println(testRoot2);
		*/

		System.out.println("a b c : " + delta.getA() +' '+ delta.getB() +' '+  delta.getC());
		System.out.println("Discriminant : " + delta.getDelta());
		
		// delta is a negative double
		if(testRoot1 == 0.0 && testRoot2 == 0.0) {
			System.out.println(noRoots);
		}
		// delta = -b/2a
		else if (testRoot1 != 0.0 && testRoot2 == 0.0) {
			System.out.println(oneRoot + delta.getRoot1());
		}
		// delta is a positive double
		else if (testRoot1 != 0.0  && testRoot2 != 0.0) {
			System.out.println(twoRoots + delta.getRoot1() + ' ' + delta.getRoot2());
		}
		
		
	}
}
