package by.htp.les100.main;

// 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Zadanie8 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		double rez;
		
		a = 3;
		b = 4;
		c = 7;
		
		rez = (b + (Math.sqrt(b * b + 4 * a * c)) ) / (2 * a ) - (a * a * a) * c + (1 / (b * b) );
		
		System.out.println("rez = " + rez);
		

	}

}
