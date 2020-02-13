package by.htp.les100.main;

// Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.

public class Zadanie1 {
	
	public static void main(String[] args) {
		
		double x;
		double y;
		
		double rez;
		double rez2;
		double rez3;
		double rez4;
		
		x = 8.5;
		y = 9.5;
		
		rez = x + y;
		rez2 = x - y;
		rez3 = x / y;
		rez4 = x * y;
		
		 
		System.out.println("rez = " + rez);
		System.out.println("rez2 = " + rez2);
		System.out.println("rez3 = " + rez3);
		System.out.println("rez4 = " + rez4);
	}

}
