package webdeveloper_one.doitjava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWriter_1 {

	public static void main(String[] args) {
		File file = new File("C:\\project\\present\\test.txt");
		try {
			FileWriter filewr = new FileWriter(file);
			for(int i = 0; i < 5; i++) {
				filewr.write("Hello\n");
				filewr.write("World\n");
			}
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
			filewr2.append(String.valueOf(ldt.getMonth()) + "\n");
			filewr2.write(String.valueOf(ldt.getMinute()));
			
			filewr2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
