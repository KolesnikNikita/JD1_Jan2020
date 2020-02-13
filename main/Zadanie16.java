package by.htp.les100.main;

//  Найти произведение цифр заданного четырехзначного числа.

public class Zadanie16 {

	public static void main(String[] args) {
		
		int x = 3486;
		int a;
		int b;
		int c;
		int d;
		int y;
		
		a = x % 10;
		b = (x % 100) / 10;
		c = (x % 1000) / 100;
		d = x / 1000;
		
		y = a * b * c * d;
		
		System.out.println("y = " + y);
		

	}

}
