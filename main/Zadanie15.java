package by.htp.les100.main;

//  Написать программу, которая выводит на экран первые четыре степени числа π.

public class Zadanie15 {

	public static void main(String[] args) {
		
		final double Pi = 3.1415926536;
		
		double Pi1;
		double Pi2;
		double Pi3;
		double Pi4;
		 
		Pi1 = Math.pow(Pi, 2);
		Pi2 = Math.pow(Pi, 3);
		Pi3 = Math.pow(Pi, 4);
		Pi4 = Math.pow(Pi, 5);
		
		System.out.println("Pi во второй степени = " + Pi1 + "\n" + "Pi во третьей степени = " + Pi2 + "\n" + "Pi в четвертой степени = " + Pi3 + "\n" + "Pi в пятой степени = " + Pi4);
		
		

	}

}
