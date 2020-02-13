package by.htp.les100.main;

public class Zadanie2240 {
	
	public static void zadanie22 (){
// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
// значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.
		
		int sek = 72795;
		
		int h;
		int m;
		int s;
		
			h = sek / 3600;
			m = (sek % 3600) / 60;
			s = sek - (m * 60) - (h * 3600);
			
			System.out.println("h = " + h + "ч");
			System.out.println("m = " + m + "мин");
			System.out.println("s = " + s + "сек");
		

	}
	
	public static void zadanie23 () {

// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).

		int r = 5;
		int R = 10;
		double S;
		
		S = Math.PI * (R * R - r * r);
		
		System.out.println("Площадь кольца = " + S );
		
		
	}
	
	public static void zadanie24 () {
//  Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.
		
		int a = 15;
		int b = 8;
		double alf = 72;
		double h;
		double S;
		
		h = ((b - a)/2) * Math.tan(alf);
		S = ((a + b)/2) * h;
		
		 
		System.out.println("Площадь трапеции = " + S);
		
		
		
		
	}
	
	public static void zadanie25 () {
//  Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
//	что а≠0 и что дискриминант уравнения неотрицателен).	
		
		double a = 3;
		double b = 12;
		double c = 5;
		double dis;
		double x1;
		double x2;
		
		dis = (b * b) - 4 * (a * c);
		
		x1 = (-b - (Math.sqrt(dis))) / (2 * a);
		x2 = (-b + (Math.sqrt(dis))) / (2 * a);
		if (dis > 0) {
			System.out.println("X1 = " + x1 + "," + "X2 = " + x2);
		} else if (dis == 0) {
			System.out.println("X = " + (-b / (2 * a)));
		} else if(dis < 0) {
			System.out.println("корней нет");
		}
			
	}
	
	

	public static void zadanie26 () {

//26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.
		
		double a = 3;
		double b = 7;
		double y = 35;
		
		double S;
		
		S = ((a * b) / 2 ) * Math.sin(y);
		
		System.out.println("Площади треугольника = " + S );
		
		
	}
	
	public static void zadanie27 () {
		
// 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за
// три операции и а10 за четыре операции.
		
		int a = 4;
		int a2 = a * a;
		int a4 = a2 * a2;
		int a8 = a4 * a4;
		int a10 = a8 * a2;
		
		System.out.println("a8 = " + a8);
		System.out.println("a10 = " + a10);
	}
	
	public static void zadanie28 () {
	
//  Составить программу перевода радианной меры угла в градусы, минуты и секунды.
		
		double rad = 3.0;
		double g;
		double m;
		double s;
		
		g = Math.toDegrees(rad);
		int grad = (int)g;
		m = (g - grad) * 60;
		int min = (int)m;
		s = (m - min) * 60;
		int sek = (int)s;
		
		System.out.println(Math.round(grad) + " градус " + min + " минуты " + sek + " секунд ");

		
	}
	
	public static void zadanie29 () {
//  Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с
		
	double a = 8;
	double b = 9;
	double c = 4;
	double alfg;
	double betg;
	double gamg;
	
	double alf = Math.acos((a * a + c * c - b * b) / (2 * a * c ));
	
	alfg = Math.toDegrees(alf);
	
    double bet = Math.acos((a * a + b * b - c * c) / (2 * a * b ));
	
	betg = Math.toDegrees(bet);
	
    double gam = Math.acos((b * b + c * c - a * a) / (2 * c * b ));
	
	gamg = Math.toDegrees(gam);
	
	System.out.println("В градусах " + "альфа = " + alfg + " " + "бета = " + betg + " " + "гамма = " + gamg);
	System.out.println("В радианах " + "альфа = " + alf + " " + "бета = " + bet + " " + "гамма = " + gam);
	}
	
	public static void zadanie30 () {
// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения
		
		double R1 = 15;
		double R2 = 64;
		double R3 = 5;
		
		double R;
		
		R = 1 / ((1 / R1) + (1  /R2) + (1 / R3));
		
		System.out.println("Сопротивление соединения = " + R);
	
	}
	
	public static void zadanie31 () {
// Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость
// течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.		
		
		double v = 15;
		double v1 = 5;
		double t1 = 1;
		double t2 = 2;
		
		double S;
		
		S = (v / t1) + ((v - v1) * t2);
		
		System.out.println("Путь равен " + S + " км");
	}
		public static void zadanie32 () {
			
// Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
// часы через р ч q мин r с?
			
			int m = 7;
			int n = 20;
			int k = 35;
			int p = 2;
			int q = 12;
			int r = 3;
			
			int T1;
			int T2;
			int T;
			
			T1 = m * 3600 + n * 60 + k;
			T2 = p * 3600 + q * 60 + r;
			
			T = T1 + T2; 
			
			int hour = T / 3600;
			int min = (T - (hour * 3600)) / 60;
			int sek = (T - (hour * 3600) - (min * 60));
			
			System.out.println(hour + " ч " + min + " мин " + sek + " сек ");
			
			
			
	}
		
		public static void zadanie33 () {
			
// Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
			
			char ch = 'B';
			int code = ch;
			code++;
	
			char ch2;
			ch2 = (char)code;
			
			code--;
			char ch3;
			code--;
			ch3 = (char)code;
			
			System.out.println("сдедующий символ " + ch2 + " " + "предыдущий символ " + ch3);
		}
		
		public static void zadanie34 () {
		
//  Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения
//	информации.
			
	    double b = 23424663;
	    double k;
	    double m;
	    
	    k = b / 1024;
	    m = k / 1024;
	    
	    System.out.println(k + "в килобайтах " + " " + m + " в мегабайтах ");
	    
			
		
		}
		
		public static void zadanie35 () {
			
// Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
			
			double M = 5;
			double N = 8;
			
			double x = M/N;
			
			int y = (int) (x * 10) % 10;
			int z = (int) x % 10;
			
			System.out.println("Старшая цифра дробной части = " + y + " " + "Младшая цивра целой части = " + z);
		}
		
		public static void zadanie36 () {
			
// 	 Найти частное произведений четных и нечетных цифр четырехзначного числа.

			int num = 4567;
			int a = num / 1000;
			int b = num / 100 % 10;
			int c = num / 10 % 10;
			int d = num % 10;
			int x = 1;
			int y = 1;
			double p;
			
        if (a % 2  == 0 ) {
				
				x *= a;
						
			} else {
				
				y *= a;
		}
			
        if (b % 2  == 0 ) {
				
				x *= b;
						
			} else {
				
				y *= b;
			}
			
         if (c % 2  == 0 ) {
				
				x *= c;
						
			} else {
				
				y *= c;
			}
         if (d % 2  == 0 ) {
		
		       x *= d;
				
	        } else {
		
		       y *= d;
		       
		       
	}
         p = x / y;
         
			System.out.println("Частное произведений четных и нечетных цифр четырехзначного числа = " + p );
			
		}
		
		public static void zadanie37 () {
// Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
// false — в противном случае:
			
			//Целое число N является четным двузначным числом
			
		int a = 357;
		boolean rez = true;

		if ((0 < a && a < 100) && a % 2 == 0) {
			System.out.println(rez);
		} else {
			System.out.println(!rez);
		}

		// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		// последних цифр.

		int num = 2507;
		int a1 = num / 1000;
		int b1 = num / 100 % 10;
		int c1 = num / 10 % 10;
		int d1 = num % 10;

		if (a1 + b1 == c1 + d1) {
			System.out.println(rez);
		} else {
			System.out.println(!rez);
		}
		// Сумма цифр данного трехзначного числа N является четным числом
		
		int N = 123;
		
		int a2 = N / 100;
		int b2 = N / 10 % 10;
		int c2 = N % 10;
		
		if ((a2 + b2 + c2) % 2 == 0) {
			System.out.println(rez);
		} else {
			System.out.println(!rez);
		}
			
		// Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		// прямыми х= m, х= n (m<n).

		int x = 8;
		int m = 3;
		int n = 6;

		if (x >= m && x <= n) {
			System.out.println(rez);
		} else {
			System.out.println(!rez);
		}
		
		//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
		
        int N1 = 123;
		
		int a3 = N / 100;
		int b3 = N / 10 % 10;
		int c3 = N % 10;
		
		if (N1 * N1 == (Math.pow((a3 + b3 + c3), 3))) {
			
			System.out.println(rez);
			
		} else {
			
			System.out.println(!rez);
			
		}
		
		//Треугольник со сторонами а,b,с является равнобедренным.
	
		int a4 = 4;
		int b4 = 4;
		int c4 = 5;
		
		if (a4 == b4 || a4 == c4 || b4 == c4 ) {
			
			System.out.println(rez);
			
		} else {
			
			System.out.println(!rez);
		}
		
		//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.

		int N2 = 123;

		int a5 = N2 / 100;
		int b5 = N2 / 10 % 10;
		int c5 = N2 % 10;
		
		
		if ((a5 + b5 == c5) || (a5 + c5 == b5) || (c5 + b5 == a5)) {
			
			System.out.println(rez);
			
		} else {
			
			System.out.println(!rez);
		}
		
		//Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).
		int N3 = 81;
		int a6 = 4;
		
		for (int i = 0; i >= 0 && i <= 4; i++)
			
			if (Math.pow(a6, i) == N3) {
				
				System.out.println(rez);
				
			} else {
				
				System.out.println(!rez);
			}
		
		//График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n).
		
		int a7 = 5;
		int b7 = 4;
		int c7 = 11;
		
		int m1 = 6;
		int n1 = 7;
		
		if ( n1 == a7 * Math.pow(m1, 2) + b7 * m1 + c7) {
			
			System.out.println(rez);
			
		} else {
			
			System.out.println(!rez);
		}
			
	}
		
        public static void zadanie38 () {
// Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:       
        	int x = 0;
        	int y = -1;
        	boolean rez = true;
        	
			if ( y >= 0 && y <= 4 && x >= -4 && x <= 4) {
				
				System.out.println("a = " + rez);
			} else {
				System.out.println("a = " + !rez);

			}
			
            if ( y >= -3 && y <= 4 && x >= -4 && x <= 4 && x >= -2 && x <= 2 ) {
				
				System.out.println("b = " + rez);
			} else {
				System.out.println("b = " + !rez);

			}
            
            if ((x * x + y * y <= 25) && y <= 0 && x >= 0 || (x * x + y * y <= 16) && y >= 0 && x >= 0) {
				
				System.out.println("c = " + rez);
			} else {
				System.out.println("c = " + !rez);

			}
			
		}
        
        public static void zadanie39 () {
// 9. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
// сложения и вычитания, вычислите за минимальное число операций:
        		int x = 5;
        		int rez;
        		
        		rez = x * ( x * (x * (2 * x - 3 ) + 4 ) - 5 ) + 6;
        		
        		System.out.println(rez);
			
		}
        
        public static void zadanie40 () {
// Дано значение х. Получить значения -2х + 3х2- 4х3 и 1 + 2х + 3х2 + 4х3
// Позаботьтесь об экономии операций.        	
        	
        	int x = 5;
        	int a;
        	int b;
        	
        	
        	a = (( -4  * x + 3 ) * x - 2 ) * x;
        	b = (( 4 * x + 3 )  * x + 2 ) * x + 1;
        	
        	
        	
        	System.out.println( a + " and + " + b );
        	
			
		}
}
