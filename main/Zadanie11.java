package by.htp.les100.main;

// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов

public class Zadanie11 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double s;
		double p;
		
		a = 7.0;
		b = 4.0;
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		p = a + b + c;
		s = (a * b)/2;
		
		System.out.println("p = " + p );
		System.out.println("s = " + s );


	}

}
