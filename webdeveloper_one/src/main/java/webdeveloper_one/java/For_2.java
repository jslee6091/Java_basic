package webdeveloper_one.java;

public class For_2 {

	public static void main(String[] args) {
		// \t : tab(5칸 이동)
		// \n : 줄바꿈
		// System.out.println : 줄바꿈 실행
		// System.out.print : 줄바꿈 없음
		
		// 구구단 2 ~9 중 3,5,7 빼고 출력 
		for(int i = 2; i < 10; i++) {
			if(!(i == 3 || i == 5 || i == 7)) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i + "*" + j + "=" + i*j + " \t");
				}
				System.out.println();
			}
		}
	}
}
