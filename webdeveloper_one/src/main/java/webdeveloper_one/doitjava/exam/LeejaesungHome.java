package webdeveloper_one.doitjava.exam;

public class LeejaesungHome {

	public String name;
	public int age;
	public String address;
	public String email;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
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

	public void Homeprint() {
		System.out.println("�̸� : " + getName());
		System.out.println("���� : " + getAge());
		System.out.println("�ּ� : " + getAddress());
		System.out.println("�̸��� : " + getEmail());
		
	}
	public static void main(String[] args) {
		// �̸� ���� �ּ� �̸��� ������� �� �ִ� �޼ҵ�
		// Homeprint(){ �̸�, ����, �ּ�, �̸��� ������� �� �ִ� �޼ҵ� ���}
		LeejaesungHome ljs = new LeejaesungHome();
		ljs.setName("���缺");
		ljs.setAge(26);
		ljs.setAddress("�����");
		ljs.setEmail("aa@email.com");
		ljs.Homeprint();
	}

}
