package webdeveloper_one.doitjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exception_1 {

	public static void main (String[] args) throws Exception {
		// System: System.out.println();
//		System.exit(0);
		
		// cache
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = "";
		while(temp != null) {
			temp = br.readLine();
			System.out.println(temp);
		}

	}

}
