package by.htp.vetv.main;

import java.util.Scanner;

public class Zadanie1_40 {
	
	public static void zadanie1() {
//Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.

		int a = 1;
		int b = 2;

		if (a < b) {

			System.out.println(7);
		} else {

			System.out.println(8);
		}
	}

	public static void zadanie2() {
// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes», в противном случае – слово «no»	

		int a = 1;
		int b = 2;

		if (a < b) {

			System.out.println("yes");
		} else {

			System.out.println("no");
		}

	}

	public static void zadanie3() {
//Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».		

		int a = 5;
		int b = 3;
		
		if (a < b) {

			System.out.println("yes");
		} else {

			System.out.println("no");
		}
		
		
	}

	public static void zadanie4() {

//Составить программу: равны ли два числа а и b?
		
		int a = 7;
		int b = 4;
		
		if (a == b) {

			System.out.println("равны");
		} else {

			System.out.println("не равны");
		}
		
	}

	public static void zadanie5() {

//	Составить программу: определения наименьшего из двух чисел а и b.	
		
		
		int a = 15;
		int b = 45;
		
		if (a < b) {

			System.out.println("наименьшее число - а");
		} else {

			System.out.println("наименьшее число - b");
		}
	}

	public static void zadanie6() {
		
//	Составить программу: определения наибольшего из двух чисел а и b.	

		
		
		int a = 8;
		int b = 455;
		
		if (a > b) {

			System.out.println("наибольшее число - а");
		} else {

			System.out.println("наибольшее число - b");
		}
	
	}

	public static void zadanie7() {
		
//	Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х	
		
		int a = 5;
		int b = 7;
		int c = 8;
		int x = 45;
		
		int rez = a * x * x + b * x + c;
		
		System.out.println(Math.abs(rez));

	}

	public static void zadanie8() {
		
//	Составить программу нахождения наименьшего из квадратов двух чисел а и b.	
		
		int a = 5;
		int b = 3;
		
		if (a * a > b * b) {
			System.out.println("наимений квадрат числа b");
		}else {
			System.out.println("наимений квадрат числа a");
		}

	}

	public static void zadanie9() {
		
//	Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.	
		
		int a = 7;
		int b = 8;
		int c = 8;
		
		if (a == b && a == c && b == c) {
			
			System.out.println("треугольник равносторонний");
		}else {
			System.out.println("треугольник не равносторонний");
		}


	}

	public static void zadanie10() {
		
//	Составить программу, которая определит площадь какого круга меньше.	
		
		int R1 = 5;
		int R2 = 7;
		
		double S1;
		double S2;

		S1 = Math.PI * Math.pow(R1, 2);
		S2 = Math.PI * Math.pow(R2, 2);

		if (S1 > S2) {

			System.out.println("площадь круга S2 меньше");
		} else {
			System.out.println("площадь круга S1 меньше");
		}

	}
	
	public static void zadanie11() {

//	Составить программу, которая определит площадь какого треугольника больше	
		
		int h1 = 7;
		int h2 = 12;
		int a1 = 14;
		int a2 = 3;
		int S1;
		int S2;
		

		S1 = (h1 * a1) / 2;
		S2 = (h2 * a2) / 2;

		if (S1 > S2) {

			System.out.println("площадь треугольника S2 меньше");
		} else {
			System.out.println("площадь треугольника S1 меньше");
		}
	}

	public static void zadanie12() {
		
//	Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные	

		int a = -8;
		int b = 5;
		int c = 6;

		if (a >= 0) {

			a = a * a;

		} else {

			a = a * a * a * a;

		}

		if (b >= 0) {

			b = b * b;

		} else {

			b = b * b * b * b;

		}
		if (c >= 0) {

			c = c * c;

		} else {

			c = c * c * c * c;

		}
		
		System.out.println(a + " " + b + " " + c);
	}

	public static void zadanie13() {
		
//	Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится ближе к началу координат	
		
		double A;
		double B;
		
		int x1 = 5;
		int x2 = 8;
		int y1 = 9;
		int y2 = 4;
		
		A = Math.sqrt(x1 * x1 + y1 * y1);
		B = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (A < B) {

			System.out.println("точка А находится ближе");
		} else {
			System.out.println("точка В находится ближе");
		}

	}

	public static void zadanie14() {
		
//	Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным	

		int yg1 = 56;
		int yg2 = 35;
		
		if (yg1 + yg2 >= 180) {
			
			System.out.println("такой треугольник не существует");
		}
		
		if (180 - (yg1 + yg2) == 90) {
			System.out.println("треугольник являяется прямоугольным ");
		} else {
			System.out.println("треугольник не являяется прямоугольным ");

		}
	}

	public static void zadanie15() {
		
//	Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной их суммы, а большее — их удвоенным произведением.	

		int a = 5;
		int b = 8;
		
		if (a < b) {
			
			a = (a + b) / 2;
			b = (a * b) * 2;
			
			System.out.println("a = " + a + " " + "b = " + b);
			
		} else {

		if (b < a) {
			
			b = (a + b) / 2;
			a = (a * b) * 2;
			
			System.out.println("a = " + a + " " + "b = " + b);
			
		}
		}
		
	}

	public static void zadanie16() {
		
//На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или в каком координатном угле).		

		int x = 5;
		int y = 7;
		
		if (x == 0 && y == 0) {
			System.out.println("точка находится А в центре оси координат");
		}
		
		if (x == 0 && y > 0  || y < 0) {
			System.out.println("точка А находится на оси y");
		}
		
		if (x > 0 || x < 0 && y == 0) {
			System.out.println("точка А находится на оси x");
		}
		
		if (x < 0 && y > 0) {
			System.out.println("точка А находится  в первой четверти");
		}
		
		if (x > 0 && y > 0) {
			System.out.println("точка А находится во второй четверти");
		}
		
		if (x < 0 && y < 0) {
			System.out.println("точка А находится в третьей четверти");
		}
		
		if (x > 0 && y < 0) {
			System.out.println("точка А находится в четвертой четверти");
	}
	}
	public static void zadanie17() {

//Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему из исходных, 
//а если равны, то заменить числа нулями.	
		
		int m = 3;
		int n = 5;
		
		if (m != n) {
			m = 6;
			n = 6;
			System.out.println("m = "+ m + " n = " + n );
		}else {
			

		if(m == n) {
			m = 0;
			n = 0;
			System.out.println("m = "+ m + " n = " + n );
		}
		
		}
	}

	public static void zadanie18() {
		
//Подсчитать количество отрицательных среди чисел а, b, с.		
		
		int a = -5;
		int b = 4;
		int c = -9;
		int i = 0;
		
		if (a < 0) {
			i++;
		}

		if (b < 0) {
			i++;
		}
		
		if (c < 0) {
			i++;
		}
		System.out.println("количество отрицательных чисел = " + i);
		

	}

	public static void zadanie19() {
		
//Подсчитать количество положительных среди чисел а, b, с.		
		
		int a = 2;
		int b = -1;
		int c = -4;
		int i = 0;
		
		if (a > 0) {
			i++;
		}

		if (b > 0) {
			i++;
		}
		
		if (c > 0) {
			i++;
		}
		System.out.println("количество положительных чисел = " + i);

	}

	public static void zadanie20() {
		
//Определить, делителем каких чисел а, b, с является число k.	
		
		double a = 15.0;
		double b = 10.0;
		double c = 2.0;
		double k =5.0;
		
		if (a % k == 0 ) {
			System.out.println("число k является делителем числа a");
		}else {
			System.out.println("число k не является делителем числа a");
		}
		
		if (b % k == 0 ) {
			System.out.println("число k является делителем числа b");
		}else {
			System.out.println("число k не является делителем числа b");
		}
		if (c % k == 0 ) {
			System.out.println("число k является делителем числа c");
		}else {
			System.out.println("число k не является делителем числа c");
		}
		
	}

	public static void zadanie21() {
		
//Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
//В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».		

		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Кто ты: Мальчик или Девочка?: ");

		String gender = scanner.nextLine();
		
	switch (gender) {
		
		case "Д":
			
			System.out.println("Мне нравятся девочки!");
			break;

		case "М":

			System.out.println("Мне нравятся мальчики ! ");
			break;

		}

		scanner.close();

	}
	public static void zadanie22() {
		
//Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.	
		
		int x = 2;
		int y = 5;
		
		int z = 0;
		
		if (x < y) {
			
			z = x;
			x = y;
			y = z;
			
			System.out.println("x = " +x + " "+ "y = " + y);
			
		}

	}
	
	public static void zadanie23() {

//Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). 
//Если введены некорректные данные, то сообщить об этом.	
		
		int day = 3;
		int month = 8;
		
		if (day > 1 && day < 31 && month > 1 && month < 12) {
			
			System.out.println("Дата задана верно");
		}else {
			System.out.println("дата задана неверно");
		}
		

		
	}

	public static void zadanie24() {
		
//Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное данное количество лепестков п.		
		
		int n = 8;
		
		if (n % 2 == 0) {
			
			System.out.println("любит");
		} else {
			System.out.println("не любит");
		}
	}

	public static void zadanie25() {
		
//Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация », 
//если температура в комнате превысила 60° С.		
		int t = 87;
		
		if (t > 60) {
			System.out.println("Пажароопасная ситуация");
		}

	}

	public static void zadanie26() {
		
//Написать программу нахождения суммы большего и меньшего из трех чисел.		

		int a = 20;
		int b = 5;
		int c = 12;
		
		int min = 0;
		int max = 0;
		int rez = 0;
		
		if (a >b) {
			max = a;
					
		}else {
			max = b;
			
		}
		
		if (c > max) {
			max = c;
		}
		if (a < b) {
			min = a;
					
		}else {
			min = b;
			
		}
		
		if (c < min) {
			min = c;
		}
		
		rez = min + max;
		
		System.out.println("сумма = " + rez);
		
	}

	public static void zadanie27() {
		
//Найти max{min(a, b), min(c, d)}.	
		
		int a = 4;
		int b = 6;
		int c = 7;
		int d = 9;
		
		int max;
		
		max = Math.max(Math.min(a, b), Math.min(d, c));
		
		System.out.println("max = " + max);

	}

	public static void zadanie28() {
		
//Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d —c).		

		int a = 8;
		int b = 9;
		int c = 11;
		int d = 10;
		int max1;
		int max2;
		if (a == d) {
			System.out.println("a = d");
		}
		if (b == d) {
			System.out.println("b = d");
		}
		if (c == d) {
			System.out.println("c = d");
		}	
		
		if (a != d && b != d && c != d) {
			
			max1 =Math.max(d - a,d -b);
			max2 = Math.max(max1, d - c);
			
			System.out.println("max = " + max2);
		}
	}
	
	public static void zadanie29() {

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.	
		
		int x1 = 2;
		int y1 = 3;
	    int x2 = 4;
	    int y2 = 5;
	    int x3 = 6;
	    int y3 = 7;
	    int A;
	    
		A = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);
		
		if (A == 0) {
			
			System.out.println("точки лежат на одной прямой");
		}else {
			System.out.println("точки не лежат на одной прямой");
		}
	}

	public static void zadanie30() {
		
//Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.		
		
		double a = 7.0;
		double b = 5.0;
		double c = 2.0;

		if (a > b && b > c) {

			a = a * 2;
			b = b * 2;
			c = c * 2;

			System.out.println("a = " + a + "b = " + b + "c = " + c);

		} else {

			if (a < 0 && b < 0 && c < 0)

			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);

			System.out.println("a = " + a + "b = " + b + "c = " + c);
		}

	}

	public static void zadanie31() {
		
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.		

		int A = 70;
		int B = 100;
		
		int x = 100;
		int y = 50;
		int z = 250;
		
		if (A >= x || A >= y || A >= z && B >= x || B >= y || B >= z) {
			
			System.out.println("Кирпич пройдет через отверстие");
		} else {
		
			System.out.println("Кирпич не пройдет через отверстие");
		}
	}

	public static void zadanie32() {
		
//Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.		

		int a = -9;
		int b = 8;
		int c = 15;
		
		if ((a + b) > 0 || (a + c) >= 0 || (b + c) >= 0) {
		
		     System.out.println("Сумма некторох из этих чисел явлется положительной");
	} else {
		
		System.out.println("Суммалюбых из этих чисел является отрицательной");
	}
	}

	public static void zadanie33() {
		
//Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной информации в базе данных. 
//Доступ к базе имеют только шесть человек, разбитых на три группы по степени доступа. 
//Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 
//3331, 7922 — доступны модули баз В, С; 9455, 8997 — доступен модуль базы С.		

		int a;
		a = 9583;
		
		if (a == 9583 || a == 1747) { 
			   
			  System.out.println("Доступны модули баз А, В, С; "); 
		} else {
		
			if (a == 3331 || a == 7922) {  
	   
			  System.out.println("Доступны модули баз В, С;"); 
		 } else {  
			 
	 
		    if (a == 9455 || a == 8997) { 
	 
			  System.out.println("Доступен модуль базы С."); 
			 
		 } else {
			 System.out.println("Пароль не подходит");
		 }
		 }
		}
	} 
		 
		
		
	

	public static void zadanie34() {
		
//Составить программу, реализующую эпизод применения компьютера в книжном магазине. 
//Компьютер запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, 
//печатает на экране «спасибо»; если денег внесено больше, чем необходимо, 
//то печатает «возьмите сдачу» и указывает сумму сдачи; если денег недостаточно, 
//то печатает сообщение об этом и указывает размер недостающей суммы		

		double price = 256.30;
		double sum = 260;
		
		if (price == sum ) {
			
			System.out.println("Спасибо ");
		}else {
			
			if (price < sum) {
				
				System.out.println("Возьмите сдачу" + (sum - price));
			} else {
				
				if (price > sum) {
					
					System.out.println("Недостаточно средств , внесите еще" + (price - sum));
				}
			}
		}
		
	}
	
	public static void zadanie35() {

//Вычислить число и месяц в невисокосном году по номеру дня.	
		
		int x = 124;
		
		if ((x >= 1) && (x <= 31)) { 
 			System.out.println(x + " января"); 
 			
 		} else if ((x >= 32) && (x <= 59)) { 
			System.out.println(x - 31 + " февраля"); 

		} else if ((x >= 60) && (x <= 90)) { 
 			System.out.println(x - 59 + " марта"); 
 

 		} else if ((x >= 91) && (x <= 120)) { 
 			System.out.println(x - 90 + " апреля"); 
 

 		} else if ((x >= 121) && (x <= 151)) { 
 			System.out.println(x - 120 + " мая"); 
 

 		} else if ((x >= 152) && (x <= 181)) { 
 			System.out.println(x - 151 + " июня"); 


 		} else if ((x >= 182) && (x <= 212)) { 
 			System.out.println(x - 181 + " июля"); 

			 
 		} else if ((x >= 213) && (x <= 243)) { 
 			System.out.println(x - 212 + " августа"); 

	
 		} else if ((x >= 244) && (x <= 273)) { 
			System.out.println(x - 243 + " сентября"); 

			 
		} else if ((x >= 274) && (x <= 304)) { 
 			System.out.println(x - 273 + " октября"); 
 

		} else if ((x >= 305) && (x <= 334)) { 
 			System.out.println(x - 304 + " ноября"); 

			 
 		} else if ((x >= 335) && (x <= 365)) { 
 			System.out.println(x - 334 + " декабря"); 
 		} 


	}

	public static void zadanie36() {
//Вычислить значение функции:
		
		double F;
		int x = 3;
		if (x <= 3 ) {
			
			F = Math.pow(x, 2) - 3 * x - 9;
			
		    System.out.println("F = " + F );
		
		} else if (x > 3) {
			F = 1 / (Math.pow(x, 3) + 6);
			
			System.out.println("F = " + F );
		}
		
	}

	public static void zadanie37() {
		
//Вычислить значение функции:		

		double F;
		int x = 3;
		if (x >= 3) {

			F = Math.pow(-x, 2) + 3 * x + 9;

			System.out.println("F = " + F);

		} else if (x < 3) {
			
			F = 1 / Math.pow(x, 3) - 6;

			System.out.println("F = " + F);
		}

	}

	public static void zadanie38() {
		
//Вычислить значение функции:	
		
		double F;
		int x = -3;
		
		if (x <= 3 && x >= 0) {

			F = Math.pow(-x, 2);

			System.out.println("F = " + F);

		} else if (x > 3 && x < 0) {
			
			F = 4;

			System.out.println("F = " + F);
		}


	}

	public static void zadanie39() {
		
//Вычислить значение функции:		
		
		double F;
		int x = 7;
		
		if (x >= 8) {

			F = Math.pow(-x, 2) + x - 9;

			System.out.println("F = " + F);

		} else if (x < 8) {
			
			F = 1 / (Math.pow(x, 4) - 6);

			System.out.println("F = " + F);
		}


	}

	public static void zadanie40() {
		
//Вычислить значение функции:		
		
		double F;
		int x = 10;
		
		if (x <= 13) {

			F = Math.pow(-x, 3) + 9;

			System.out.println("F = " + F);

		} else if (x > 13) {
			
			F =  -3 / (x + 1);

			System.out.println("F = " + F);
		}

	}
	
	
	
}
	