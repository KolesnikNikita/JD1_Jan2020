package by.htp.les100.main;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Zadanie10 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		double rez;
		
		x = 6.5;
		y = 7.7;
		
		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println("rez = " + rez);

	}

}
