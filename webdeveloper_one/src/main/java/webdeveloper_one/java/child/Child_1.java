package webdeveloper_one.java.child;

public class Child_1 extends Parent{

	@Override
	public boolean equals(Object obj) {
		System.out.println("�������̵��� �޼ҵ� �Դϴ�");
		return true;
	}
	
	// main()�� ��� ��ü���� �����ؾ��ϹǷ� static �̴�.
	public static void main(String[] args) {
		Child_1 ch = new Child_1();
		ch.equals("amugae");
		
		Parent ch2 = new Child_1();
		// equals�� Parent�������� ���� ������ �ڽ� �޼ҵ�� �������̵� �ȴ�.
		// �θ� Ÿ������ �����ϴ� ���� : 
		// �ڽ� Ÿ������ �����ϸ� ��ü�� ���� ������ �� ������ ���ŷο�Ƿ� �θ� �̿��� ������ �����Ѵ�.
		ch2.equals(ch2);
	}
}
