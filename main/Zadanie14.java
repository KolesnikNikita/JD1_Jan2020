package by.htp.les100.main;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class Zadanie14 {

	public static void main(String[] args) {
		
		final double Pi = 3.1415926536;
		

		double R = 23;
		
		double P = 2*Pi*23;
		
		double S =(R * R) * Pi;
		
		System.out.println ("Длина окружности при радиусе 23 см равен " + P);
		System.out.println ("Площадь круга при радиусе 23 см равен " + S );

	
	}

}
