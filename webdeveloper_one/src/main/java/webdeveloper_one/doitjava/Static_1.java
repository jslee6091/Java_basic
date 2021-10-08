package webdeveloper_one.doitjava;

public class Static_1 {

	public static int init = 0;
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(Static_1.init++);
		}
	}

}
