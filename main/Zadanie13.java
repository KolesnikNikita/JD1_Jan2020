package by.htp.les100.main;

//  Заданы координаты трех вершин треугольника (х1 у1),(х2, у2) ,(х3, у3). Найти его периметр и площадь.

public class Zadanie13 {

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		double a;
		double b;
		double c;
		
		double P;
		double S;
		double p2;
		
		x1 = 4.3;
		x2 = 5.4;
		x3 = 9.9;
		y1 = 1.2;
		y2 = 5.2;
		y3 = 6.7;
		
		a = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		b = Math.sqrt((Math.pow((x3 - x2), 2)) + (Math.pow((y3 - y2), 2)));
		c = Math.sqrt((Math.pow((x1 - x3), 2)) + (Math.pow((y1 - y3), 2)));
		
		P = a + b + c;
		p2 = P / 2;
		S = Math.sqrt(p2 * ( p2 - a) * (p2 - b) * (p2 - c));
		
		System.out.println("P = " + P);
		System.out.println("S = " + S);
				
	}

}
