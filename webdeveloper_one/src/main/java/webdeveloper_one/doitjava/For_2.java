package webdeveloper_one.doitjava;

public class For_2 {

	public static void main(String[] args) {
		
		// 2 x 1 3 x 1 4 x 1 ... 9 x 1
		// 2 x 2 3 x 2 4 x 2 ... 9 x 2
		// 3, 6, 8?? ???? ???? (?????? x)
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				if(!(j == 3 || j == 6 || j == 8)) {
					System.out.print(j + " x " + i + " = " + i * j + "\t");
				}	
			}
			System.out.println();
		}
		
		System.out.println();
		
		int h = 1;
		int v = 2;
		while(h <= 9) {
			while(v <= 9) {
				if(!(v == 3 || v == 6 || v == 8)) {
					System.out.print(v + " x " + h + " = " + v * h + "\t");
				}
				v++;
			}
			System.out.println();
			h++; v = 2;
		}
		
		System.out.println();
		
		int doh = 1;
		int dov = 2;
		do {
			do {
				if(!(dov == 3 || dov == 6 || dov == 8)) {
					System.out.print(dov + " x " + doh + " = " + dov * doh + "\t");
				}
			}while(++dov <= 9);
			
			System.out.println();
			dov = 2;
		}while(++doh <= 9);
	}

}
