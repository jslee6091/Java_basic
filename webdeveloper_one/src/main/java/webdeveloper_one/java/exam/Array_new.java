package webdeveloper_one.java.exam;

public class Array_new {

	public static void main(String[] args) {
		// 3 ~ 21 까지 배열 초기화 후 합 구하기
		// 19개의 배열 만들어서 합 구하기
		// 4, 9 ,20 요소 덧셈 제외
		int array[] = new int[19];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 3;
			if(!(array[i] == 4 || array[i] == 9 || array[i] == 20)) {
				sum += array[i];
			}
		}
		System.out.println("정답 : " + sum);
	}

}
