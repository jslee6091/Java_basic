package webdeveloper_one.doitjava.child;

// class �� �ϳ��� ��� ���� �� �ִ�(object ����)
// interface �� ��� �޴� ������ ������ ����
// �Ｚ, ����, ��� �븮��
public class CarDealer1 implements Hyundai, Kia, Samsung{

	public void Name() {
		System.out.println("InheritanceOfInterface_1 name");
	}
	
	@Override
	public String Car(String carname) {
		System.out.println(carname + "���Դϴ�");
		return carname + "��";
	}
	
	public static void main(String[] args) {
		CarDealer1 ob = new CarDealer1();
		
		System.out.println(ob.Car("��� ev6"));
		System.out.println(ob.Car("�׽���"));
		System.out.println(ob.Car("���� gv80"));
		
	}

}
