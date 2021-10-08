package webdeveloper_one.doitjava.child;

public class CarManager {

	public static void main(String[] args) {
		// ����, ���, �Ｚ
		CarDealer1 car1 = new CarDealer1();
		car1.Car("����");
		car1.Car("���");
		car1.Car("�Ｚ");
		
		// ���, �Ｚ
		CarDealer2 car2 = new CarDealer2();
//		car2.Car("������");
		car2.Car("���");
		car2.Car("�Ｚ");
		
		CommonCar common = new CarDealer1();
		common.Car("����");
		common.Car("���");
		common.Car("�Ｚ");
		
		CommonCar common2 = new CarDealer2();
		common2.Car("�Ｚ");
		common2.Car("���");
		
		// 1000�� ���� �����ϱ�
		
		// java io, network, new, newinstance -> Exception
		try {
			// ���� �븮��
			// ���� ���� 02
			// List : ���(element) �˻��ϴµ� �̸����� �˻��� 0 1 2 ��
			// Hash : �̸����� �˻� ����(key�� value�� 1:1 ��Ī)
			
			for(int i = 0; i < 2; i++) {
				CommonCar commoncar = (CommonCar)Class.forName("webdeveloper_one.doitjava.child.CarDealer1").newInstance();
				System.out.println(commoncar.Car(i + "�� �븮�� �Ｚ ��� ���� �Ǹ�"));
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