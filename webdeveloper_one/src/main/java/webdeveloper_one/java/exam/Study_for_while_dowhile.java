package webdeveloper_one.java.exam;

public class Study_for_while_dowhile {

	public static void main(String[] args) {
		// for ,while,do while 
		// 1 ~ 20 까지의합에서 3,7,9,13 을빼고 짝수의합 홀수의합을출력 
		
		// for 활용
		// 짝수의 합
		int sum_even = 0;
		// 홀수의 합
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
		System.out.println("===============for 문 결과=================");
		System.out.println("짝수의 합 : " + sum_even);
		System.out.println("홀수의 합 : " + sum_odd);
		
		
		// while 활용
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
		System.out.println("===============while 문 결과=================");
		System.out.println("짝수의 합 : " + sum_even);
		System.out.println("홀수의 합 : " + sum_odd);
		
		
		// dowhile 활용
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
		System.out.println("===============dowhile 문 결과=================");
		System.out.println("짝수의 합 : " + sum_even);
		System.out.println("홀수의 합 : " + sum_odd);
	}

}
