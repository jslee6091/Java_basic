package webdeveloper_one.java.child;

import java.util.HashMap;

public class C503 extends Koreanitfactory{

	public static void main(String[] args) {
		// C503 classroom = new C503();
		// classroom.Classroom("503", "javaB");
		
		// 원하는 단어 찾기 : ctrl + shift + h
		
		// network,io,instance : 강제적으로 에러처리를 해주어야한다.
		try {
			// for, while, dowhile 중 하나 선택하여 501호부터 503호까지 출력
			String classnum[] = {"501", "502", "503"};
			HashMap<String, String> has = new HashMap<String, String>();
			has.put("501", "java_1");
			has.put("502", "java_2");
			has.put("503", "java_3");
			
			for(int i = 0; i < 3; i++) {
				// new로 객체생성 안하고 클래스의 메소드 사용하기
				Koreanit ko = (Koreanit)Class.forName("webdeveloper_one.java.child.C" + classnum[i]).newInstance();
				ko.Classroom(classnum[i], has.get(classnum[i]));
			}
			
			/*교수님의ㅣ 코드
			 * String array[] = {"webdeveloper_one.java.child.C501", "webdeveloper_one.java.child.C502", "webdeveloper_one.java.child.C503"}; 
			 * for(int i = 0; i < array.length; i++){
			 * 	koreanit ko = (Koreanit)Class.forName(array[i]).newInstance();
			 * 	ko.Classroom("50" + (i + 1), "java_" + (i + 1));
			 * } 
			 */
			
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
