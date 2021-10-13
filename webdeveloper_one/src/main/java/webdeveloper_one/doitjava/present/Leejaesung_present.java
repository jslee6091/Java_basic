package webdeveloper_one.doitjava.present;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;

public class Leejaesung_present {

	public String name;
	public int age;
	public String address;
	public String email;
	public String phone;
	public int todayq;
	public int weekq;
	public int mprojectq;
	public int projectq;
	public String position;
	public int positionpoint;
	
	public static ArrayList info = new ArrayList();
	public static Hashtable users = new Hashtable();
	
	public static void main(String[] args) {
		File file = new File("C:\\project\\present\\test.txt");
		try {
			FileWriter filewr = new FileWriter(file);
//			PrintWriter printwr = new PrintWriter(file);
			for(int i = 0; i < 5; i++) {
//				printwr.print("Hello\n");
//				printwr.print("World\n");
				filewr.write("Hello\n");
				filewr.write("World\n");
			}
//			printwr.close();
			filewr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfMonth());
		
		File file2 = new File("C:\\project\\present\\" + ldt.getYear() + "-" + ldt.getMonthValue() + "-" + ldt.getDayOfMonth() + "-check.log");
		try {
			FileWriter filewr2 = new FileWriter(file2);
			filewr2.write(ldt.getDayOfYear() + "\n");
			filewr2.write(String.valueOf(ldt.getDayOfWeek()) + "\n");
//			filewr2.write(ldt.getMonth());
			filewr2.append(String.valueOf(ldt.getMonth()) + "\n");
			filewr2.write(String.valueOf(ldt.getMinute()));
			
			filewr2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// MySQL DB에 데이터 저장(이름, 나이, 주소, 등등)
		// 검색 시 jdbc와 DB Query(Select) 이용
		// log 파일에 검색한 결과를 저장
		// 통계 출력 (출석률 100%, 결석률 10%)
		// 
		
	}

}
