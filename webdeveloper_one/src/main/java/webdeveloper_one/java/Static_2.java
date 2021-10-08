package webdeveloper_one.java;

public class Static_2 {

	public static int init;
	
	public int Intvalue(int init) {
		return Static_2.init;
	}
	
	public static void main(String[] args) {
		Static_2 stat = new Static_2();
		System.out.println(stat.Intvalue(5));
		System.out.println(Static_2.init);
		System.out.println(init);

	}

}
