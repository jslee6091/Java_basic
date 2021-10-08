package webdeveloper_one.doitjava.child;

public class CarDealer2 implements Hyundai, Samsung{

	@Override
	public String Car(String carname) {
		System.out.println(carname + "차 입니다");
		return carname + "차";
	}
	
	// 서초구 삼성, 현대 대리점
	public static void main(String[] args) {
		CarDealer2 car = new CarDealer2();
		car.Car("삼성르노");
		car.Car("현대 gv80");

	}

}
