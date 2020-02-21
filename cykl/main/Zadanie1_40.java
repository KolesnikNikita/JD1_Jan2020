package by.htp.cykl.main;

import java.util.Scanner;

public class Zadanie1_40 {
	

       public static void main(String[] args){
	
	
	Zadanie1_40.zadanie1();
	Zadanie1_40.zadanie2();
	Zadanie1_40.zadanie3();
	Zadanie1_40.zadanie4();
	Zadanie1_40.zadanie5();
	Zadanie1_40.zadanie6();
	Zadanie1_40.zadanie7();
	Zadanie1_40.zadanie8();
	Zadanie1_40.zadanie9();
	Zadanie1_40.zadanie10();
	Zadanie1_40.zadanie11();
	Zadanie1_40.zadanie12();
	Zadanie1_40.zadanie13();
	Zadanie1_40.zadanie14();
	Zadanie1_40.zadanie15();
	Zadanie1_40.zadanie16();
	Zadanie1_40.zadanie17();
	Zadanie1_40.zadanie18();
	Zadanie1_40.zadanie19();
	Zadanie1_40.zadanie20();
	Zadanie1_40.zadanie21();
	Zadanie1_40.zadanie22();
	Zadanie1_40.zadanie23();
	Zadanie1_40.zadanie24();
	Zadanie1_40.zadanie25();
	Zadanie1_40.zadanie26();
	Zadanie1_40.zadanie27();
	Zadanie1_40.zadanie28();
	Zadanie1_40.zadanie29();
	Zadanie1_40.zadanie30();
	Zadanie1_40.zadanie31();
	Zadanie1_40.zadanie32();
	Zadanie1_40.zadanie33();
	Zadanie1_40.zadanie34();
	Zadanie1_40.zadanie35();
	Zadanie1_40.zadanie36();
	Zadanie1_40.zadanie37();
	Zadanie1_40.zadanie38();
	Zadanie1_40.zadanie39();
	Zadanie1_40.zadanie40();
}

	public static void zadanie1() {
//Необходимо вывести на экран числа от 1 до 5.	
		
		int x;
		
		for (x = 1; x <= 5; x++) {
			
			System.out.println("x = " + x);
		}
	}
	
	public static void zadanie2() {

//Необходимо вывести на экран числа от 5 до 1.	
		
		int x;

		for (x = 5; x >= 1; x--) {

			System.out.println("x = " + x);
		}
	}

	public static void zadanie3() {
		
//Необходимо вывести на экран таблицу умножения на 3:	
		
		int a;
		int b;

		for (a = 1; a <= 10; a++) {

			b = a * 3;
			System.out.println(b);
		}


	}

	public static void zadanie4() {
		
//С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
//включительно.		
		
		int a = 2;
		
		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
			a++;
	
		}

	}
	public static void zadanie5() {

//С помощью оператора while напишите программу определения суммы всех нечетных чисел в
//диапазоне от 1 до 99 включительно		
		
		int a = 1;
		int b = 0;

		while (a <= 99) {
			if (a % 2 != 0) {
				b = b + a;
				
				System.out.println(b);
			}
			a++;

		}
	}

	public static void zadanie6() {
		
//Напишите программу, где пользователь вводит любое целое положительное число. А программа
//суммирует все числа от 1 до введенного пользователем числа.		

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		int rez = 0;
		
		System.out.println("Введите целое положительное число");
		
		int num = scan.nextInt();
		
		while (a < num) {
			
			rez += a;
			a++;
		}
		a++;
		System.out.println(rez);
		
		
	}

	public static void zadanie7() {
		
//Вычислить значения функции на отрезке [а,b] c шагом h:		
		
		int a = 5;
		int b = 7;
		int h = 2;
		int x;
		int y;
		
		for (x = a ; x <= b; x += h) {
			System.out.println("x = " + x);
			
			if (x > 2) {
				
				y = x;
				
				System.out.println("y = " + y);
			} else {
				
				if (x <= 2);
				
				y = -x;
				
				System.out.println("y = " + y);
			}
		}

	}

	public static void zadanie8() {
		
//Вычислить значения функции на отрезке [а,b] c шагом h:	
		
		int a = 3;
		int b = 9;
		int h = 1;
		int c = 8;
		int x;
		int y;
		
		for (x = a ; x <= b; x += h) {
			System.out.println("x = " + x);
			
			if (x == 15) {
				
				y = (x + c) * 2;
				
				System.out.println("y = " + y);
			} else {
				
				if (x != 15);
				
				y = (x - c) + 6;
				
				System.out.println("y = " + y);
			}
		}

	}


	public static void zadanie9() {
		
//Найти сумму квадратов первых ста чисел.	
		
		int a = 1;
		int rez = 0;
		
		for (a = 1; a <= 100; a++) {
			
			rez = rez + a * a;
		}
			
			System.out.println("Сумма квадратов первых  ста чсел = " + rez);
			
		

	}

	public static void zadanie10() {
		
//Составить программу нахождения произведения квадратов первых двухсот чисел.
		
		int a;
		double rez = 1;
		
		for (a = 1; a <= 200; a++) {
			
			rez = rez * (a * a);
		}
			
			System.out.println("Произведение квадратов первых двухсот чсел = " + rez);
			
		

	}

	
	public static void zadanie11() {

//Составить программу нахождения разности кубов первых двухсот чисел		
		
		int a;
		double rez = 0;
		
		for (a = 1; a <=200; a++) {
			
			rez = rez - (a * a * a);
		}
			
			System.out.println("Разность кубов первых двухсот чсел = " + rez);
			
		
	}

	public static void zadanie12() {
		
//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу
//нахождения произведения первых 10 членов этой последовательности.		

		int a1 = 1;
		int i;
		int b;
		int rez = 1;
		
		for (i = 1; i <=10; i++) {
			
			b = a1 + 6;
			rez *= b;
			
		}
		System.out.println(rez);
	}

	public static void zadanie13() {
		
//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.	
		
		int a = -5;
		int b = 5;
		double h = 0.5;
		double x;
		double y;
		
		for (x = a ; x <= b; x += h) {
			System.out.println("x = " + x);
			
			y = 5 - Math.pow(x, 2) / 2 ;
				
				System.out.println("y = " + y);
			}
		

	}

	public static void zadanie14() {
		
//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.		
		
		double n = 3.0;
		double i;
		double rez = 1;
		
		for (i = 1; i <= n; i++) {
			
			rez += 1 / i;
			
			
		}
		System.out.println(rez);

	}

	public static void zadanie15() {
		
//Вычислить : 1+2+4+8+...+ 2 в 10 степени.		
		
		double rez;
		int i;
		
		for (i = 1; i <= 5; i++) {
			
			rez = i + Math.pow(2, 10);
			
			System.out.println(rez);
		}

	}

	public static void zadanie16() {
		
//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).	
		
		int i;
		int rez = 1;
		long rez2 = 1;
		
		for (i = 2; i <= 10; i++) {
			
			rez += i ;
			rez2 *= rez;
			
			System.out.println(rez2);
		}

	}
	
	public static void zadanie17() {

//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)		
		
		int a = 5;
		int rez = 1;
		int i;
		
		rez = a * (a + 1);
		
		for (i = 4; i >= 0; i--) {
			
			
			rez = rez * (a + i - 1);
			
			
		}
		
		System.out.println(rez);
	}

	public static void zadanie18() {
		
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:		
		
		double a;
		double e = -2.0;
		double rez = 0.0;
		int i;
		
		for(i = 1; i<=10; i++) {
			
			a = Math.pow(-1, i - 1) / i;
			
			if (Math.abs(a) >= e) {
				
				rez += a;
			}
		}
		System.out.println("Z18 " + rez);

	}

	public static void zadanie19() {
		
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:		
		
		double a;
		double e = -2.0;
		double rez = 0.0;
		int i;
		
		for(i = 1; i<=10; i++) {
			
			a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			
			if (Math.abs(a) >= e) {
				
				rez += a;
			}
		}
		System.out.println("Z19 " + rez);

	}

	public static void zadanie20() {
		
//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:		

		double a;
		double e = -2.0;
		double rez = 0.0;
		int i;
		
		for(i = 1; i<=10; i++) {
			
			a = 1 / ((3 * i - 2) * (3 * i + 1));
			
			if (Math.abs(a) >= e) {
				
				rez += a;
			}
		}
		System.out.println("Z20 " + rez);
	}

	public static void zadanie21() {
		
//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
//значения функции:		
		
		int a = 3;
		int b = 10;
		double h = 1.2;
		double x;
		double y;

		for (x = a; x <= b; x += h) {
	
			y = x - Math.sin(x);

			System.out.println("Z21 y = " + y + "  |  " + "x = " + x);
		}

	}



	public static void zadanie22() {
		
//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
//значения функции:		
		
		int a = 3;
		int b = 10;
		double h = 1.2;
		double x;
		double y;

		for (x = a; x <= b; x += h) {
	
			y = Math.pow(Math.sin(x), 2);

			System.out.println("Z22 y = " + y + "  |  " + "x = " + x);
		}

	}


	
	public static void zadanie23() {

//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
//значения функции:		
		
		int a = 3;
		int b = 10;
		double h = 1.2;
		double x;
		double y;

		for (x = a; x <= b; x += h) {
	
			y = 1 / Math.tan(x / 3) + 0.5 * Math.sin(x);

			System.out.println("Z23 y = " + y + "  |  " + "x = " + x);
		}

	}

	public static void zadanie24() {
		
//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать
//его в другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным
//числом.	
		
	
	}

	public static void zadanie25() {
	
//Требуется определить факториал числа, которое ввел пользователь.	
		
		
		int a;
		long rez = 1;
		
		int n = 25;
	
		
		if (n < 0) {
			
			System.out.println("факториал отрицательный ");
		} else {
		
	       for (a = 1; a <= n; a++) {
	    	   
	    	   rez *= a;
	    	   
	    	   System.out.println("Z25 " + rez);
	       }
	     
		}
	      

	}

	public static void zadanie26() {
		
//Вывести на экран соответствий между символами и их численными обозначениями в памяти
//компьютера (Таблицу ASCII).	
		
		int a;

		for (a = 32; a <= 127; a++) {

			System.out.println(" Численное обозначение " + a + " | ASCII  " + (char) a);

		}
	}

	public static void zadanie27() {
		
//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
//самого числа. m и n вводятся с клавиатуры.
		
		int m = 5;
		int n = 15;
		
		for (int i = 1; i <= n; i++) {
			
			if (n % i == 0 && i != m && i != 1) {
				
				System.out.println("Z27 " + i + ", ");
			}
		}

	}

	public static void zadanie28() {
		
//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
//результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
//также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
//перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
//‘0’.		
		
		double x = 0; 	 
		double y = 7.0;  
 		double z; 
 		
 		

 		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
 		System.out.println("Введите знак опирации + - / * ");
 		String str = scan.nextLine();
 			 
 		do {	
 			
			switch (str) { 
 			 
 			case "-": 
				 
 				z = x - y; 
 				 
 				System.out.println(+x + "-" + y + "=" + z); 
 				 
				break;  
 			case "+": 
 			 
 				z = x + y; 
 				 
				System.out.println(+x + "+" + y + "=" + z); 
 				 

 			case "*": 
 				z = x * y; 
				 
				System.out.println(+x + "*" + y + "=" + z); 
				 
 				break;  
 			case "/": 
 				 
 				if (y != 0) { 
 					 
 					z = x / y; 
					 
 					System.out.println(+x + "/" + y + "=" + z); 
 				 
 				} else { 
 					 
 					System.out.println("На ноль делить нельзя"); 
				} 
				 
				break; 
			 
 			default: 
				 
 				System.out.println("Неверный знак"); 
				 
				break; 
			} 
		 
		} while (x != 0); 
	} 



	
	public static void zadanie29() {

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.		
		
		int a = 24;
		int b = 84;
		int c;
		int d;
		
		while ( a > 0 ) {
			
			d = a % 10;
			a = a / 10;
			c = b;
			
			while (c > 0 ) {
				
				if ( c % 10 == d ) {
					
					System.out.println("Z29 " + d);
					
					break;
				}
				
				c = c / 10;
			}
		}
	}

	public static void zadanie30() {
		
//Написать программу, переводящую римские цифры в арабские.		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите римскую цифру");
		String rim = sc.nextLine();

		switch (rim) {
		case "M":
			System.out.println("1000");
			break;

		case "CÌ":
			System.out.println("900");
			break;

		case "D":
			System.out.println("500");
			break;

		case "CD":
			System.out.println("400");
			break;

		case "C":
			System.out.println("100");
			break;

		case "XC":
			System.out.println("90");
			break;

		case "L":
			System.out.println("50");
			break;

		case "XL":
			System.out.println("40");
			break;

		case "X":
			System.out.println("10");
			break;

		case "IX":
			System.out.println("9");
			break;

		case "V":
			System.out.println("5");
			break;

		case "IV":
			System.out.println("4");
			break;

		case "I":
			System.out.println("1");
			break;

		}

	}



	public static void zadanie31() {
		
//Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
//угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
//программа, а также ошибочные числа пользователя.		

		int a = 1;
		int b = 15;
		int c = 8;
		
		
		int random = a + (int) (Math.random() * b);
		
		    if (c < random) {
		    	System.out.println("no. " + random);
		    }
		    
		    if (c > random) {
		    	System.out.println("no. " + random);
		    }
		    
		    if (c == random) {
		    	System.out.println("yes " + random);
		    }
	
		
	}

	public static void zadanie32() {
		
//Проверить введенную пользователем строку на наличие недопустимых символов. 
//В качестве первого символа допустимы только буквы и знак подчеркивания. 
//Остальные символы могут быть буквами, цифрами и знаком подчеркивания.	
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст");
		
		String str = sc.nextLine();

		char a = str.charAt(0); 
		
		      if ((Character.isLetter(a)) || (a == '_')) { 
		    	  
		            System.out.println("верно введен первый символ"); 
		} else { 
			
		            System.out.println("неверно введен первый символ"); 
		} 

		 
		for (int i = 1; i < str.length(); i++) { 
			
		a = str.charAt(i); 
		
		      if ((Character.isLetter(a)) || (a == '_') || (Character.isDigit(a))) { 
		    	  
		            System.out.println("верно введен " + (i + 1) + " символ:" + a); 
		} else { 
			
		            System.out.println("неверно введен " + (i + 1) + " символ:" + a); 
		} 
} 
		

}

	public static void zadanie33() {
		
//Найдите наибольшую цифру данного натурального числа.	

		int a;
		int b;
		int c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите трехзначное число : ");
		
		int ch =sc.nextInt();
		

		a = ch % 10;
		b = (ch / 10) % 10;
		c = (ch / 100) % 10;

		    if (a >= b & a > c || a > c & b >= a) {
		    	
			         System.out.println("В числе " + ch + " наибольшая цифра " + a);
			         
		} else {
			
			if (b > a & b >= c) {
				
				System.out.println("В числе " + ch + " наибольшая цифра " + b);
				
		} else {
			
				System.out.println("В числе " + ch + " наибольшая цифра " + c);
			}
		}

	}

	public static void zadanie34() {
		
//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.		
		

		int a;
		int b;
		int c;
		int d;
		int k;

		for (int i = 1000; i <= 9999; i++) {
			
			a = (i % 100) % 10;
			b = (i % 100) / 10;
			c = (i % 1000) / 100;
			d = i / 1000;
			k = a + b + c + d;
			
			if (k == 15) {
				
				System.out.println(i);
			}
		}
	}


	public static void zadanie35() {

//Найдите количество четных цифр данного натурального числа.		
		 
		int a;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите трехзначное число : ");
		
		int ch =sc.nextInt();
		
		int rez = 0;


		while (ch != 0) {
			a = ch % 10;
			ch = ch / 10;
			if (a % 2 == 0) {
				rez++;
			}
		}
		System.out.println(rez);

	}

	public static void zadanie36() {
		
//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.	
		
		int a;
		int b;
		int c;

		for (a = 10; a <= 99; a++) {
			
		for (b = 10; b <= 99; b++) {
				
				c = a * 100 + b;
				
			if (c % (a * b) == 0) {
					
				c /= (a * b);
					
					System.out.println("Z36 " + a + b);
					
					c = 0;
				}
			}
		}

	}

	public static void zadanie37() {
		
//Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: 
//первое число получили путем написания сначала числа А, затем В. 
//Для получения второго числа сначала записали число В, затем А. 
//Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.		
		
		int a;
		int b;
		int c;
		int d;

		for (a = 10; a <= 99; a++) {
			
		for (b = 10; b <= 99; b++) {
				
				c = a * 100 + b;
				d = b * 100 + a;
				
			if ((c % 99 == 0) && (d % 49 == 0)) {
					
					System.out.println("Z37 " + c + " " + d);
					
				}
			}
		}

	}


	public static void zadanie38() {
		
//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
//Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.		
		
		int a = 3269;
		int b;
		int c;
		int d;

		b = a % 10;
		a = a / 10;
		c = a % 10;
		a = a / 10;
		d = a % 10;
		a = a / 10;

		if (b - c == c - d) {
			
			System.out.println("Цифры данного числа образуют арифметическую прогрессию");
			
		} else {
			
			System.out.println("Цифры данного числа не образуют арифметическую прогрессию");
		}

	}

	public static void zadanie39() {
		
//В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число.	

		int a;
		int b;

		for (b = 100; b <= 999; b++) {

			a = b % 100;

			if (7 * a == b) {

				System.out.println(b);
			}
		}

	}

	public static void zadanie40() {
		
//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.		
		
		int N = 365;
		int a;
		boolean b;

		for (int i = 1; i < N; i++) {

			a = i;
			b = true;

			while (a > 0 && b) {

				if (a % 10 == 0 || (i % (a % 10) != 0)) {

					b = false;

				} else {
					
					a /= 10;
				}
			}
			if (b) {
				
				System.out.print(i + ", ");
			}
		}
	}

}