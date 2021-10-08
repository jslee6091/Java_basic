package webdeveloper_one.doitjava;

public class Constructor_1 {

	public String name;
	public int age;
	public String address;
	public String email;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Constructor_1() {
		System.out.println("�⺻ ������");
	}
	
	public Constructor_1(String name, int age, String address, String email) {
		// application : �ܼ� -> �������α׷�
		// web + application : ������ : safari, chrome, opera, firefox ... -> �� ���ø����̼�
		// �Ű����� : �ش��ϴ� �������� (app, web)
		// ����(argument) : application
		// parameter : web + application
		// ���������� ���������� �̸��� ������ �ݵ�� �������� this.��������
		setName(name);
		setAge(age);
		setAddress(address);
		setEmail(email);
	}
	
	public static void main(String[] args) {
		// �⺻�����ڴ� ���� ����
		// �̹� Ŭ���� Ÿ���� �ִ�

		// 5�� �̸�, ����, �ּ�, �̸��� �Է� => new 5��
		// 5�� �̸�, ����, �ּ�, �̸����� �޼ҵ带 ���ؼ� ����Ͻÿ�
		Constructor_1 con1 = new Constructor_1("���缺", 26, "�����", "a@gmail.com");
		Constructor_1 con2 = new Constructor_1("�ƹ���", 55, "�̱�", "aa@email.com");
		Constructor_1 con3 = new Constructor_1("ȫ�浿", 100, "����", "aaa@email.com");
		Constructor_1 con4 = new Constructor_1("�̼���", 400, "����", "aaaa@email.com");
		Constructor_1 con5 = new Constructor_1("����", 1000, "����", "aaaaa@email.com");
		
		Constructor_1 arr[] = {con1, con2, con3, con4, con5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("�̸� : " + arr[i].getName());
			System.out.println("���� : " + arr[i].getAge());
			System.out.println("�ּ� : " + arr[i].getAddress());
			System.out.println("�̸��� : " + arr[i].getEmail());
			System.out.println("--------------------------------");
		}
		
	}

}
