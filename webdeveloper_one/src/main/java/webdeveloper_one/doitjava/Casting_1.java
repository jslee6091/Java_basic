package webdeveloper_one.doitjava;

public class Casting_1 {
	
	public static void main(String[] args) {
		
		// up , down casting
		// ����, �ڵ� casting
		
		// ���ڿ��� ���� ũ��
		// ���ڿ��� ũ�� ������ �ڵ����� �������� ���������� �ٲ��
		System.out.println("���ڿ�" + 10);
		// ���� -> ����
		String strvalue = "1";
		int intvalue = Integer.parseInt(strvalue);
		intvalue = intvalue + 10;
		
		System.out.println("������ ��ȯ : " + intvalue);
		// ���� -> ����
		int intvalue2 = 10;
		String strvalue2 = String.valueOf(intvalue2);
		System.out.println(strvalue2);
		
		// ��ĳ����
		// ��� Ŭ������ �ݵ�� Object�� ��� �޾ƾ��Ѵ�
		// Object ��� ���� ������ �ڹٰ� �ƴϴ�(native)
		
		// ��� Ŭ������ �θ�� Object
		// ��� Ÿ��(type)�� �θ� ���� �� �ִ�
		// ����� ���信�� �ڽ��� �θ𺸴� ũ�ų� ����
		Object ob = (Object)new String("upcasting");
		if(ob.equals("upcasting")) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		String obstrvalue = (String)ob;
		String obstrvalue2 = ob.toString();
		System.out.println("down casting : " + obstrvalue2);
		
	}
}
