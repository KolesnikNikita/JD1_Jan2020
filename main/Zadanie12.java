package by.htp.les100.main;

// Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

public class Zadanie12 {

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double y1;
		double y2;
		
		double S;
		
		x1 = 5.0;
		x2 = 7.0;
		y1 = 8.0;
		y2 = 4.0;
	
		S = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		
		System.out.println("S = " + S);
				

	}

}
