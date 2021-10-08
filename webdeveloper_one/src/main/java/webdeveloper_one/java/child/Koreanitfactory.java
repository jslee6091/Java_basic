package webdeveloper_one.java.child;

// 추상 클래스는 추상이므로 객체 생성 불가
// 몸체 구현은 가능
// 인터페이스를 추상클래스에서 상속받으면 몸체구현 안해도 됨
// class(front) <=> abstract class(factory) <=> interface(command)

public abstract class Koreanitfactory implements Koreanit{
	public String classname;
	public String classtype;
	
	
	@Override
	public void Classroom(String classname, String classtype) {
		System.out.println("클래스 이름 : " + classname);
		System.out.println("클래스 타입 : " + classtype);
		
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
		// abstract : 객체 생성 못함
		//Koreanitfactory ko = new Koreanitfactory();
		
	}
	
}
