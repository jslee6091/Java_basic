package webdeveloper_one.java;

public class Method_2 {

	public String name = "�̼���";
	
	public void Print() {
		System.out.println("�̸� : " + name);
	}
	
	// ����(argument) : �޼ҵ忡�� ���ڴ� �������� �� �� �ִ�.
	public void Input(String name, int age, String address) {
		System.out.println("�̸� : " +  name + " ���� : " + age + " �ּ� : " + address);
	}
	
	public static void main(String[] args) {
		Method_2 obj = new Method_2();
		obj.Print();
		obj.Input("ȫ�浿", 300, "����");
	}

}
