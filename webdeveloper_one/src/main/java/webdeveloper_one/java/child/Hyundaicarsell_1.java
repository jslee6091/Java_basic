package webdeveloper_one.java.child;

public class Hyundaicarsell_1 implements Commoncar{

	
	@Override
	public void Carname(String name) {
		System.out.println("차이름 : " + name);
		
	}

	@Override
	public void Carprice(String price) {
		System.out.println("차가격 : " + price);
		
	}

	public static void main(String[] args) {
		/* 비즈니스로직, 비즈니스 업무 */
		/* 현대자동차 대리점 1에 손님 gv80 가격은 */
		Commoncar ccar = new Hyundaicarsell_1();
		
		// 부모인 Commoncar의 메소드를 자식에서 오버라이딩
		ccar.Carname("gv80");
		ccar.Carprice("8000");
		
	}

}
