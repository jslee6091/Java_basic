package webdeveloper_one.doitjava.child;

public class CarDealer2 implements Hyundai, Samsung{

	@Override
	public String Car(String carname) {
		System.out.println(carname + "�� �Դϴ�");
		return carname + "��";
	}
	
	// ���ʱ� �Ｚ, ���� �븮��
	public static void main(String[] args) {
		CarDealer2 car = new CarDealer2();
		car.Car("�Ｚ����");
		car.Car("���� gv80");

	}

}
