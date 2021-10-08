package webdeveloper_one.java.child;

import java.util.HashMap;

public class Kiacarsell_1 implements Commoncar{

	@Override
	public void Carname(String name) {
		System.out.println("차이름 : " + name);
	}
	
	@Override
	public void Carprice(String price) {
		System.out.println("차가격 : " + price);	
	}
	
	public void Print() {
		System.out.println("출력");
	}
	
	public static void main(String[] args) {
		Commoncar ccar = new Kiacarsell_1();
		Commoncar hcar = new Hyundaicarsell_1();
		
		// new 안쓰고 객체생성
		// 에러처리 Exception : 에러가 날만한 코드에서 에러처리한다.
		// network.io 객체 생성, jdbc.port 생성 시 반드시 에러처리(안하면 실행 안됨)
		// Exception : 모든 에러처리의 부모
		// 자식은 부모에 있는 모든 것을 쓸 수 있다.
		// 자식이 부모보다 같거나 크다.
		// 자식은 부모타입에 포함된다.
		
		try {
			// 업캐스팅
			Commoncar commoncar = (Commoncar)Class.forName("webdeveloper_one.java.child.Kiacarsell_1").newInstance();
//			commoncar.Carname("카렌스3");
//			commoncar.Carprice("1000");
			
			// 매우 많은 데이터가 있을 때는 일일이 객체를 생성하지 않고 hashmap을 사용
			HashMap hash = new HashMap();
			hash.put("kia", "webdeveloper_one.java.child.Kiacarsell_1");
			hash.put("hyundai", "webdeveloper_one.java.child.Hyundaicarsell_1");
			
			System.out.println(hash.get("kia"));
			System.out.println(hash.get("hyundai"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*catch (InstantiationException e) {// 객체 생성 실패 에러
			// printStackTrace() : 에러문 출력
			e.printStackTrace();
		} catch (IllegalAccessException e) {// 잘못된 접근으로 인한 접근 거부 에러
			e.printStackTrace();
		} catch (ClassNotFoundException e) {// 클래스가 없는 에러
			e.printStackTrace();
		}*/
		
		// 자동차가 100개 일 때
		// 공통 : 모듈을 만들면 재사용 할 수 있다.
		
		// k7 가격 4000풀옵션
//		ccar.Carname("k7");
//		ccar.Carprice("4000");
//		
//		hcar.Carname("gv70");
//		hcar.Carprice("5000");
	}

}
