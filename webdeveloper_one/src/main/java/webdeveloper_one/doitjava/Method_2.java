package webdeveloper_one.doitjava;

public class Method_2 {

	public String name;
	public int age;
	public String address;
	
	
	// alt + shift + s -> generate getters and setters
	// get : ���� ��´�
	// set : ���� �Է�, ����, ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public void Home(String name, int age, String address) {
		System.out.println("�̸� : " + name + " ���� : " + age + " �ּ� : " + address);
	}
	
	public void Home() {
		System.out.println("�̸��� ���Ƶ� ���ڰ����� Ÿ���� Ʋ���� �����ε�");
	}

	public static void main(String[] args) {
		Method_2 me = new Method_2();
		me.Home("�ƹ���", 20, "�Ȼ�");
		me.setName("���缺");
		me.setAddress("�����");
		me.setAge(26);

		System.out.println(me.name);
		System.out.println(me.age);
		System.out.println(me.address);
		
	}

}