package by.htp.les100.main;

// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной
// и описанной окружностей

public class Zadanie19 {

	public static void main(String[] args) {
		
		double a = 7.0;
		double S;
		double h;
		double r1;
		double R2;
		
		h = (a * a * Math.sqrt(3)) / 2;
		S = (a / 2 ) * h;
		r1 = a / (2 * Math.sqrt(3));
		R2 = a / Math.sqrt(3);
		
		
		System.out.println("h = "+ h + "\n" + "S = "+ S + "\n" + "r1 = " + r1 + "\n" + "R2 = " + R2);
		
	
		
	}

}
