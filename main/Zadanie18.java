package by.htp.les100.main;

//  Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

public class Zadanie18 {

	public static void main(String[] args) {
		
		double a = 10.0;
		
		double S_gr;
		double S_pol;
		double V;
		
		S_gr = a * a;
		
		S_pol = S_gr * 6;
		
		V = Math.pow(a, 3);
		
		System.out.println("S gr = "+ S_gr + "\n"+ "S pol = "+ S_pol + "\n" + "V = " + V );
		
		

	}

}
