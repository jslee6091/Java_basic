package webdeveloper_one.java.child;

// �߻� Ŭ������ �߻��̹Ƿ� ��ü ���� �Ұ�
// ��ü ������ ����
// �������̽��� �߻�Ŭ�������� ��ӹ����� ��ü���� ���ص� ��
// class(front) <=> abstract class(factory) <=> interface(command)

public abstract class Koreanitfactory implements Koreanit{
	public String classname;
	public String classtype;
	
	
	@Override
	public void Classroom(String classname, String classtype) {
		System.out.println("Ŭ���� �̸� : " + classname);
		System.out.println("Ŭ���� Ÿ�� : " + classtype);
		
	}


	public String getClassname() {
		return classname;
	}


	public void setClassname(String classname) {
		this.classname = classname;
	}


	public String getClasstype() {
		return classtype;
	}


	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	
	public static void main(String[] args) {
		// abstract : ��ü ���� ����
		//Koreanitfactory ko = new Koreanitfactory();
		
	}
	
}
