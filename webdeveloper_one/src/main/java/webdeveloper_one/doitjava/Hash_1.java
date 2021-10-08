package webdeveloper_one.doitjava;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Hash_1 {

	public static void main(String[] args) {
		
		HashMap<String, String> hash = new HashMap();
		
		hash.put("���缺", "���缺");
		hash.put("ȫ�浿", "ȫ�浿");
		hash.put("�ƹ���", "�ƹ���");
		hash.put("�̸�", "�ּ�");
		
		// ���� ����Ͻÿ�
		for(Object key : hash.keySet()) {
			System.out.println(key + " : " + hash.get(key));
		}
		
		Collection col = hash.values();
		Object ob[] = col.toArray();
		System.out.println(col);
		System.out.println(hash.values());
		
		System.out.println("==============keyset()===============");
		
		// Ű�� ���� ��ġ�ϴ� ���� ���
		for(String key : hash.keySet()) {
			if(key.equals(hash.get(key))) {
				System.out.println(key + " : " + hash.get(key));
			}
		}
		
		Hashtable ht = new Hashtable(hash);
//		ht.put("���缺", "���缺");
//		ht.put("ȫ�浿", "ȫ�浿");
//		ht.put("�ƹ���", "�ƹ���");
//		ht.put("�̸�","�ּ�");
		
		Enumeration enu = ht.keys();
		
		System.out.println("==============hashtable===============");
		
		// Ű�� ���� ��ġ�ϴ� ���� ���
		while(enu.hasMoreElements()) {
			String strkey = enu.nextElement().toString();
			if(ht.get(strkey).equals(strkey)) {
				System.out.println(strkey + " : " + ht.get(strkey));
			}
		}
		
	}

}
