package webdeveloper_one.java.child;

import java.util.HashMap;

public class C503 extends Koreanitfactory{

	public static void main(String[] args) {
		// C503 classroom = new C503();
		// classroom.Classroom("503", "javaB");
		
		// ���ϴ� �ܾ� ã�� : ctrl + shift + h
		
		// network,io,instance : ���������� ����ó���� ���־���Ѵ�.
		try {
			// for, while, dowhile �� �ϳ� �����Ͽ� 501ȣ���� 503ȣ���� ���
			String classnum[] = {"501", "502", "503"};
			HashMap<String, String> has = new HashMap<String, String>();
			has.put("501", "java_1");
			has.put("502", "java_2");
			has.put("503", "java_3");
			
			for(int i = 0; i < 3; i++) {
				// new�� ��ü���� ���ϰ� Ŭ������ �޼ҵ� ����ϱ�
				Koreanit ko = (Koreanit)Class.forName("webdeveloper_one.java.child.C" + classnum[i]).newInstance();
				ko.Classroom(classnum[i], has.get(classnum[i]));
			}
			
			/*�������Ǥ� �ڵ�
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
