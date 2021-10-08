package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_2 {

	public void Print() {
		
		// �θ����� ����Ŭ������ ������ �ڽĿ� ����Ŭ������ �� �� ����
		// Exception ���� �� �������� ���� �ڽ� Ŭ���� �� �� ����
		try {
			// Exception : ��� ���� ��Ȳ�� �θ�
			// �θ��̱� ������ ��� ���� ó�� ����
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			String temp = "";
			while (temp != null) {
				temp = buffer.readLine();
			}
		} catch (IOException e) {
			new Exception("Error message");
		} catch (Exception e) {
			// TODO : hello
		} finally {
			System.out.println("Error ������� ������ ����");
		}

	}

	// �ش��ϴ� �޼ҵ带 ȣ���ϸ�(call) ȣ���ϴ� �������� ���� ó�� �ؾ���
	public static String Name() throws Exception {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		while (temp != null) {
			temp = buffer.readLine();
			if(temp.equals("exit")) {
				// ���α׷� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				System.exit(0);
			}
			System.out.println(temp);
		}
		return "ȫ�浿";
	}
	
	// �޼ҵ�� ������ ȣ����������
	// java���� main�� jvm�� ȣ��
	// java -> jvm �� �ؼ��Ѵ�(������ x, ��ü)
	// java ����ȭ ĸ��ȭ
	// java ���뼺 -> �ڹ��� ����
	public static void main(String[] args) throws Exception {
		// Exception_2.Name() ���� Exception�� �߻��� �� �����Ƿ� ȣ���ϴ� main()������ Exceptionó�� �������
		// throws �Ǵ� try/catch
		try {
			Exception_2.Name();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
