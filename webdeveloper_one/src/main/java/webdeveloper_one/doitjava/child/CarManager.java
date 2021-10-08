package webdeveloper_one.doitjava.child;

public class CarManager {

	public static void main(String[] args) {
		// 현대, 기아, 삼성
		CarDealer1 car1 = new CarDealer1();
		car1.Car("현대");
		car1.Car("기아");
		car1.Car("삼성");
		
		// 기아, 삼성
		CarDealer2 car2 = new CarDealer2();
//		car2.Car("현대차");
		car2.Car("기아");
		car2.Car("삼성");
		
		CommonCar common = new CarDealer1();
		common.Car("현대");
		common.Car("기아");
		common.Car("삼성");
		
		CommonCar common2 = new CarDealer2();
		common2.Car("삼성");
		common2.Car("기아");
		
		// 1000개 만들어서 실행하기
		
		// java io, network, new, newinstance -> Exception
		try {
			// 서울 대리점
			// 서울 총판 02
			// List : 요소(element) 검색하는데 이름으로 검색이 0 1 2 값
			// Hash : 이름으로 검색 가능(key와 value의 1:1 매칭)
			
			for(int i = 0; i < 2; i++) {
				CommonCar commoncar = (CommonCar)Class.forName("webdeveloper_one.doitjava.child.CarDealer1").newInstance();
				System.out.println(commoncar.Car(i + "번 대리점 삼성 기아 현대 판매"));
			}
		
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
