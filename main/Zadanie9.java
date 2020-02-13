package by.htp.les100.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Zadanie9 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double d;
		
		double rez;
		
		a = 8.0;
		b = 10.0;
		c = 4.0;
		d = 5.0;
		
		rez = (a / c) * (b / d) - (a * b - c) / (c * d) ;
		
		System.out.println("rez = " + rez);
	}

}
