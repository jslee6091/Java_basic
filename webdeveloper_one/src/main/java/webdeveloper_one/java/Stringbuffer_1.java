package webdeveloper_one.java;

public class Stringbuffer_1 {

	public static void main(String[] args) {
		StringBuffer bu = new StringBuffer();
		bu.append("���缺 1");
		bu.append("��� ���� ����� 1111");
		bu.append("���̴� 26 1 1");
		
		System.out.println(bu.toString());
		
		int num = 0;
		Character ch = '1';
		
		for(int i = 0; i < bu.length(); i++) {
			if(ch.equals(bu.charAt(i))) {
				num++;
			}
		}
		System.out.println("1�� ���� : " + num);
		
		System.out.println(bu.indexOf("1"));
	}

}
