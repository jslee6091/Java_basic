package webdeveloper_one.doitjava.child;

// class 는 하나만 상속 받을 수 있다(object 생략)
// interface 는 상속 받는 개수의 제한이 없다
// 삼성, 현대, 기아 대리점
public class CarDealer1 implements Hyundai, Kia, Samsung{

	public void Name() {
		System.out.println("InheritanceOfInterface_1 name");
	}
	
	@Override
	public String Car(String carname) {
		System.out.println(carname + "차입니다");
		return carname + "차";
	}
	
	public static void main(String[] args) {
		CarDealer1 ob = new CarDealer1();
		
		System.out.println(ob.Car("기아 ev6"));
		System.out.println(ob.Car("테슬라"));
		System.out.println(ob.Car("현대 gv80"));
		
	}

}
