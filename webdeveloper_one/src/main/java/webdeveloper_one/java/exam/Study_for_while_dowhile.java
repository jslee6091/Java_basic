package webdeveloper_one.java.exam;

public class Study_for_while_dowhile {

	public static void main(String[] args) {
		// for ,while,do while 
		// 1 ~ 20 �������տ��� 3,7,9,13 ������ ¦������ Ȧ����������� 
		
		// for Ȱ��
		// ¦���� ��
		int sum_even = 0;
		// Ȧ���� ��
		int sum_odd = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i != 3 && i != 7 && i != 9 && i != 13) {
				if(i % 2 == 0) {
					sum_even += i;
				}
				else {
					sum_odd += i;
				}
			}
		}
		System.out.println("===============for �� ���=================");
		System.out.println("¦���� �� : " + sum_even);
		System.out.println("Ȧ���� �� : " + sum_odd);
		
		
		// while Ȱ��
		sum_even = 0;
		sum_odd = 0;
		int init = 0;
		while(++init <= 20) {
			// if(!(init == 3 || init == 7 || init == 9 || init == 13)){
			if(init != 3 && init != 7 && init != 9 && init != 13) {
				if(init % 2 == 0) {
					sum_even += init;
				}
				else {
					sum_odd += init;
				}
			}
		}
		System.out.println("===============while �� ���=================");
		System.out.println("¦���� �� : " + sum_even);
		System.out.println("Ȧ���� �� : " + sum_odd);
		
		
		// dowhile Ȱ��
		sum_even = 0;
		sum_odd = 0;
		init = 1;
		do {
			if(init != 3 && init != 7 && init != 9 && init != 13) {
				if(init % 2 == 0) {
					sum_even += init;
				}
				else {
					sum_odd += init;
				}
			}
		}while(init++ < 20);
		System.out.println("===============dowhile �� ���=================");
		System.out.println("¦���� �� : " + sum_even);
		System.out.println("Ȧ���� �� : " + sum_odd);
	}

}
