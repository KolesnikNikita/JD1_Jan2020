package by.htp.les100.main;

// »звестна длина окружности. Ќайти площадь круга, ограниченного этой окружностью.

public class Zadanie20 {

	public static void main(String[] args) {
		
		double L = 145.0;
		double R;
		double S;
		
		R = L / 2 * Math.PI;
		
		S = Math.PI * R * R;
		
		System.out.println("S = " + S);
		
	}

}
