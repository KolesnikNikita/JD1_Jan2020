package by.htp.les100.main;

// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� �������
// ������� � ����� ����� ����� � ������� ���������� �������� �����.

public class Zadanie21 {

	public static void main(String[] args) {
		
	double R = 253.462;
	int T = (int) R;
	int P;
	double rez;
	double Z = T;
	
	
	P = (int) Math.round((R % 1) * 1000);
	
	rez = P + (Z / 1000);
	

	
	System.out.println(rez);
	
	}

}
