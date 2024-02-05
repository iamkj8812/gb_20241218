package Extends;

public class Main01 {

	public static void main(String[] args) {
		CalcParent calcP = new CalcParent();
		System.out.println(calcP.plus(20, 10));
		
		CalcChild clacC = new CalcChild();
		System.out.println(clacC.times(20, 10));
		System.out.println(clacC.plus(20, 10));
	}

}













