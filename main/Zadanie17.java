package by.htp.les100.main;

// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class Zadanie17 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 30;
		
		double arifm;
		double geomet;
		
		arifm =  (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		geomet = Math.sqrt(Math.abs(a * b));
		
		System.out.println("Среднее арифметическое = " + arifm + "\n" + "Среднее геометрическое = " + geomet);
		
		

	}

}
