package webdeveloper_one.java.exam;

public class Home {

	public String name = "���缺";
	public int age= 26;
	public String address= "�����";
	public String email = "aaaa@naver.com";
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getEmail() {
		return email;
	}

	public void Home() {
		System.out.println("�̸� : " + getName() + " ���� : " + getAge() + " �ּ� : " + getAddress() + " �̸��� : " + getEmail());
	}
	
	public void Home2(String name, int age, String address, String email) {
		System.out.println("�̸� : " + name + " ���� : " + age + " �ּ� : " + address + " �̸��� : " + email);	
	}
	public static void main(String[] args) {
		// �̸�, ����, �ּ�, �̸��� : ��������
		// return �޼ҵ�
		// void Home() : �̸�, ����, �ּ�, �̸��� �޼ҵ� ���
		// void Home2(�̸�, ����, �ּ�, �̸���) :  ���
		Home obj = new Home();
		obj.Home();
		obj.Home2("ȫ�浿", 300, "����", "hhh@gmail.com");
	}

}
