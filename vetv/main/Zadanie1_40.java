package by.htp.vetv.main;

import java.util.Scanner;

public class Zadanie1_40 {
	
	public static void zadanie1() {
//��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� ����� 7, � ��������� ������ � ����� 8.

		int a = 1;
		int b = 2;

		if (a < b) {

			System.out.println(7);
		} else {

			System.out.println(8);
		}
	}

	public static void zadanie2() {
// ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� ����� �yes�, � ��������� ������ � ����� �no�	

		int a = 1;
		int b = 2;

		if (a < b) {

			System.out.println("yes");
		} else {

			System.out.println("no");
		}

	}

	public static void zadanie3() {
//��������� ��������� ��������� ���������� ����� � � ����� 3. ������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.		

		int a = 5;
		int b = 3;
		
		if (a < b) {

			System.out.println("yes");
		} else {

			System.out.println("no");
		}
		
		
	}

	public static void zadanie4() {

//��������� ���������: ����� �� ��� ����� � � b?
		
		int a = 7;
		int b = 4;
		
		if (a == b) {

			System.out.println("�����");
		} else {

			System.out.println("�� �����");
		}
		
	}

	public static void zadanie5() {

//	��������� ���������: ����������� ����������� �� ���� ����� � � b.	
		
		
		int a = 15;
		int b = 45;
		
		if (a < b) {

			System.out.println("���������� ����� - �");
		} else {

			System.out.println("���������� ����� - b");
		}
	}

	public static void zadanie6() {
		
//	��������� ���������: ����������� ����������� �� ���� ����� � � b.	

		
		
		int a = 8;
		int b = 455;
		
		if (a > b) {

			System.out.println("���������� ����� - �");
		} else {

			System.out.println("���������� ����� - b");
		}
	
	}

	public static void zadanie7() {
		
//	��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �	
		
		int a = 5;
		int b = 7;
		int c = 8;
		int x = 45;
		
		int rez = a * x * x + b * x + c;
		
		System.out.println(Math.abs(rez));

	}

	public static void zadanie8() {
		
//	��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.	
		
		int a = 5;
		int b = 3;
		
		if (a * a > b * b) {
			System.out.println("�������� ������� ����� b");
		}else {
			System.out.println("�������� ������� ����� a");
		}

	}

	public static void zadanie9() {
		
//	��������� ���������, ������� ��������� �� ���� ��������� ��������, �������� �� ������ ����������� ��������������.	
		
		int a = 7;
		int b = 8;
		int c = 8;
		
		if (a == b && a == c && b == c) {
			
			System.out.println("����������� ��������������");
		}else {
			System.out.println("����������� �� ��������������");
		}


	}

	public static void zadanie10() {
		
//	��������� ���������, ������� ��������� ������� ������ ����� ������.	
		
		int R1 = 5;
		int R2 = 7;
		
		double S1;
		double S2;

		S1 = Math.PI * Math.pow(R1, 2);
		S2 = Math.PI * Math.pow(R2, 2);

		if (S1 > S2) {

			System.out.println("������� ����� S2 ������");
		} else {
			System.out.println("������� ����� S1 ������");
		}

	}
	
	public static void zadanie11() {

//	��������� ���������, ������� ��������� ������� ������ ������������ ������	
		
		int h1 = 7;
		int h2 = 12;
		int a1 = 14;
		int a2 = 3;
		int S1;
		int S2;
		

		S1 = (h1 * a1) / 2;
		S2 = (h2 * a2) / 2;

		if (S1 > S2) {

			System.out.println("������� ������������ S2 ������");
		} else {
			System.out.println("������� ������������ S1 ������");
		}
	}

	public static void zadanie12() {
		
//	���� ��� �������������� �����. �������� � ������� �� �� ���, �������� ������� ��������������, � � ��������� ������� � �������������	

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
		
//	���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, ������� �� ����� ��������� ����� � ������ ���������	
		
		double A;
		double B;
		
		int x1 = 5;
		int x2 = 8;
		int y1 = 9;
		int y2 = 4;
		
		A = Math.sqrt(x1 * x1 + y1 * y1);
		B = Math.sqrt(x2 * x2 + y2 * y2);
		
		if (A < B) {

			System.out.println("����� � ��������� �����");
		} else {
			System.out.println("����� � ��������� �����");
		}

	}

	public static void zadanie14() {
		
//	���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������	

		int yg1 = 56;
		int yg2 = 35;
		
		if (yg1 + yg2 >= 180) {
			
			System.out.println("����� ����������� �� ����������");
		}
		
		if (180 - (yg1 + yg2) == 90) {
			System.out.println("����������� ��������� ������������� ");
		} else {
			System.out.println("����������� �� ��������� ������������� ");

		}
	}

	public static void zadanie15() {
		
//	���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ���� ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.	

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
		
//�� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ��� ����������� (�� ����� ��� ��� � ����� ������������ ����).		

		int x = 5;
		int y = 7;
		
		if (x == 0 && y == 0) {
			System.out.println("����� ��������� � � ������ ��� ���������");
		}
		
		if (x == 0 && y > 0  || y < 0) {
			System.out.println("����� � ��������� �� ��� y");
		}
		
		if (x > 0 || x < 0 && y == 0) {
			System.out.println("����� � ��������� �� ��� x");
		}
		
		if (x < 0 && y > 0) {
			System.out.println("����� � ���������  � ������ ��������");
		}
		
		if (x > 0 && y > 0) {
			System.out.println("����� � ��������� �� ������ ��������");
		}
		
		if (x < 0 && y < 0) {
			System.out.println("����� � ��������� � ������� ��������");
		}
		
		if (x > 0 && y < 0) {
			System.out.println("����� � ��������� � ��������� ��������");
	}
	}
	public static void zadanie17() {

//���� ����� ����� m, n. ���� ����� �� �����, �� �������� ������ �� ��� ����� � ��� �� ������, ������ �������� �� ��������, 
//� ���� �����, �� �������� ����� ������.	
		
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
		
//���������� ���������� ������������� ����� ����� �, b, �.		
		
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
		System.out.println("���������� ������������� ����� = " + i);
		

	}

	public static void zadanie19() {
		
//���������� ���������� ������������� ����� ����� �, b, �.		
		
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
		System.out.println("���������� ������������� ����� = " + i);

	}

	public static void zadanie20() {
		
//����������, ��������� ����� ����� �, b, � �������� ����� k.	
		
		double a = 15.0;
		double b = 10.0;
		double c = 2.0;
		double k =5.0;
		
		if (a % k == 0 ) {
			System.out.println("����� k �������� ��������� ����� a");
		}else {
			System.out.println("����� k �� �������� ��������� ����� a");
		}
		
		if (b % k == 0 ) {
			System.out.println("����� k �������� ��������� ����� b");
		}else {
			System.out.println("����� k �� �������� ��������� ����� b");
		}
		if (c % k == 0 ) {
			System.out.println("����� k �������� ��������� ����� c");
		}else {
			System.out.println("����� k �� �������� ��������� ����� c");
		}
		
	}

	public static void zadanie21() {
		
//��������� � ������. �� ������ ������������� ������ ���� ��: ������� ��� �������? ����� � ��� ̻.
//� ����������� �� ������ �� ������ ������ ��������� ����� ���� �������� �������!� ��� ���� �������� ��������!�.		

		Scanner scanner = new Scanner(System.in);
		

		System.out.println("��� ��: ������� ��� �������?: ");

		String gender = scanner.nextLine();
		
	switch (gender) {
		
		case "�":
			
			System.out.println("��� �������� �������!");
			break;

		case "�":

			System.out.println("��� �������� �������� ! ");
			break;

		}

		scanner.close();

	}
	public static void zadanie22() {
		
//���������������� �������� ���������� � � � ���, ����� � � ��������� ������� �� ���� ��������, � � y - �������.	
		
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

//���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31, ����� � �� 1 �� 12). 
//���� ������� ������������ ������, �� �������� �� ����.	
		
		int day = 3;
		int month = 8;
		
		if (day > 1 && day < 31 && month > 1 && month < 12) {
			
			System.out.println("���� ������ �����");
		}else {
			System.out.println("���� ������ �������");
		}
		

		
	}

	public static void zadanie24() {
		
//��������� ���������, ������������ ��������� ������� �� ������� � �������� �����, ���� �� �������� ������ ���������� ��������� �.		
		
		int n = 8;
		
		if (n % 2 == 0) {
			
			System.out.println("�����");
		} else {
			System.out.println("�� �����");
		}
	}

	public static void zadanie25() {
		
//�������� ��������� � ������ ������� ��������� ������� � ���������, ������� ������� ��������� �������������� �������� �, 
//���� ����������� � ������� ��������� 60� �.		
		int t = 87;
		
		if (t > 60) {
			System.out.println("������������� ��������");
		}

	}

	public static void zadanie26() {
		
//�������� ��������� ���������� ����� �������� � �������� �� ���� �����.		

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
		
		System.out.println("����� = " + rez);
		
	}

	public static void zadanie27() {
		
//����� max{min(a, b), min(c, d)}.	
		
		int a = 4;
		int b = 6;
		int c = 7;
		int d = 9;
		
		int max;
		
		max = Math.max(Math.min(a, b), Math.min(d, c));
		
		System.out.println("max = " + max);

	}

	public static void zadanie28() {
		
//���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� �� ����� d, �� ����� max(d � a, d � b, d �c).		

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

//���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.	
		
		int x1 = 2;
		int y1 = 3;
	    int x2 = 4;
	    int y2 = 5;
	    int x3 = 6;
	    int y3 = 7;
	    int A;
	    
		A = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);
		
		if (A == 0) {
			
			System.out.println("����� ����� �� ����� ������");
		}else {
			System.out.println("����� �� ����� �� ����� ������");
		}
	}

	public static void zadanie30() {
		
//���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, � �������� �� ����������� ����������, ���� ��� �� ���.		
		
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
		
//������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������.		

		int A = 70;
		int B = 100;
		
		int x = 100;
		int y = 50;
		int z = 250;
		
		if (A >= x || A >= y || A >= z && B >= x || B >= y || B >= z) {
			
			System.out.println("������ ������� ����� ���������");
		} else {
		
			System.out.println("������ �� ������� ����� ���������");
		}
	}

	public static void zadanie32() {
		
//�������� ���������, ������� �� �������� ���� ������ ����������, �������� �� ����� �����-���� ���� �� ��� �������������.		

		int a = -9;
		int b = 8;
		int c = 15;
		
		if ((a + b) > 0 || (a + c) >= 0 || (b + c) >= 0) {
		
		     System.out.println("����� �������� �� ���� ����� ������� �������������");
	} else {
		
		System.out.println("���������� �� ���� ����� �������� �������������");
	}
	}

	public static void zadanie33() {
		
//�������� ���������, ������� �� ������ ����� ���������� ������� ������� ���������� � ��������� ���������� � ���� ������. 
//������ � ���� ����� ������ ����� �������, �������� �� ��� ������ �� ������� �������. 
//��� ����� ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �; 
//3331, 7922 � �������� ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.		

		int a;
		a = 9583;
		
		if (a == 9583 || a == 1747) { 
			   
			  System.out.println("�������� ������ ��� �, �, �; "); 
		} else {
		
			if (a == 3331 || a == 7922) {  
	   
			  System.out.println("�������� ������ ��� �, �;"); 
		 } else {  
			 
	 
		    if (a == 9455 || a == 8997) { 
	 
			  System.out.println("�������� ������ ���� �."); 
			 
		 } else {
			 System.out.println("������ �� ��������");
		 }
		 }
		}
	} 
		 
		
		
	

	public static void zadanie34() {
		
//��������� ���������, ����������� ������ ���������� ���������� � ������� ��������. 
//��������� ����������� ��������� ����, ����� �����, ��������� �����������; ���� ����� �� ���������, 
//�������� �� ������ ��������; ���� ����� ������� ������, ��� ����������, 
//�� �������� ��������� ����� � ��������� ����� �����; ���� ����� ������������, 
//�� �������� ��������� �� ���� � ��������� ������ ����������� �����		

		double price = 256.30;
		double sum = 260;
		
		if (price == sum ) {
			
			System.out.println("������� ");
		}else {
			
			if (price < sum) {
				
				System.out.println("�������� �����" + (sum - price));
			} else {
				
				if (price > sum) {
					
					System.out.println("������������ ������� , ������� ���" + (price - sum));
				}
			}
		}
		
	}
	
	public static void zadanie35() {

//��������� ����� � ����� � ������������ ���� �� ������ ���.	
		
		int x = 124;
		
		if ((x >= 1) && (x <= 31)) { 
 			System.out.println(x + " ������"); 
 			
 		} else if ((x >= 32) && (x <= 59)) { 
			System.out.println(x - 31 + " �������"); 

		} else if ((x >= 60) && (x <= 90)) { 
 			System.out.println(x - 59 + " �����"); 
 

 		} else if ((x >= 91) && (x <= 120)) { 
 			System.out.println(x - 90 + " ������"); 
 

 		} else if ((x >= 121) && (x <= 151)) { 
 			System.out.println(x - 120 + " ���"); 
 

 		} else if ((x >= 152) && (x <= 181)) { 
 			System.out.println(x - 151 + " ����"); 


 		} else if ((x >= 182) && (x <= 212)) { 
 			System.out.println(x - 181 + " ����"); 

			 
 		} else if ((x >= 213) && (x <= 243)) { 
 			System.out.println(x - 212 + " �������"); 

	
 		} else if ((x >= 244) && (x <= 273)) { 
			System.out.println(x - 243 + " ��������"); 

			 
		} else if ((x >= 274) && (x <= 304)) { 
 			System.out.println(x - 273 + " �������"); 
 

		} else if ((x >= 305) && (x <= 334)) { 
 			System.out.println(x - 304 + " ������"); 

			 
 		} else if ((x >= 335) && (x <= 365)) { 
 			System.out.println(x - 334 + " �������"); 
 		} 


	}

	public static void zadanie36() {
//��������� �������� �������:
		
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
		
//��������� �������� �������:		

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
		
//��������� �������� �������:	
		
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
		
//��������� �������� �������:		
		
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
		
//��������� �������� �������:		
		
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
	