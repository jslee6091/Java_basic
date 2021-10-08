package webdeveloper_one.java;

public class Trycatch_1 {

	public static void main(String[] args) {
		
		try {
			// 실행 하는 곳
			int array[] = {1,2,3,4,5};
			for(int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error!");
		}catch (Exception e) {
			// Exception : 모든 에러처리의 부모이다
			// catch가 여러개일 때 Exception이 가장 마지막에 와야한다
		}
		
	}

}
