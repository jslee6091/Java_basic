package webdeveloper_one.exam;

/* for, while, dowhile �޼ҵ� �����
 * 1���� �迭�� ���� ���� ���� ���
 * int intvalue[] = new int[max];
 * ���� ���� start, max ����� ����� ��� �޼ҵ� Print()
 * ���� ��� for, while, dowhile
 * ������ ����� start, max
 * ������ �ȿ��� ���ؼ� ���
 * for, while, dowhile ���
*/

public class Move {

	public int start;
	public int max;
	
	public int forsum(int start, int max) {
		int result = 0;
		int intvalue[] = new int[max];
		
		for(int i = 0; i < max; i++) {
			intvalue[i] = start + i;
			result += intvalue[i];
		}
		return result;
	}
	
	public int whilesum(int start, int max) {
		int result = 0;
		int index = -1;
		int intvalue[] = new int[max];
		
		while(++index<max){
			intvalue[index] = start + index;
			result += intvalue[index];
		}
		return result;
	}
	
	public int dowhilesum(int start, int max) {
		int result = 0;
		int index = 0;
		int intvalue[] = new int[max];
		
		do {
			intvalue[index] = start + index;
			result += intvalue[index];
		}
		while(++index<max);
		return result;
	}

	public void Print() {
		System.out.println("========for ���============");
		System.out.println(forsum(start, max));
		
		System.out.println("========while ���============");
		System.out.println(whilesum(start, max));
		
		System.out.println("========dowhile ���============");
		System.out.println(dowhilesum(start, max));
	}
	
	public Move(int start, int max) {
		this.start = start;
		this.max = max;
		
		Print();
	}
	
	public static void main(String[] args) {
		// 3���� 20���� ���ڸ� ���ϱ�
		Move obj = new Move(3, 20);
	}

}

/* ������ ���� Ǯ��
package webdeveloper_one.exam;

public class Move {

	int array[];
	int sum = 0;
	int start = 0;
	int max = 0;
	
	public void Initsum(int start){
		if(sum != 0){
			sum = 0;
		}
		
		if(start != 0){
			this.start = start;
		}
	}
	
	public int forsum(int start, int max) {
		Initsum(start);
		array = new int[max];
		
		for(; start < array.length; start++) {
			array[start] = start + 1;
			sum += array[start];
		}
		return sum;
	}
	
	public int whilesum(int start, int max) {
		Initsum(start);
		array = new int[max];
		
		while(start < array.length){
			array[start] = start + 1;
			sum += array[start];
			++start;
		}
		return sum;
	}
	
	public int dowhilesum(int start, int max) {
		Initsum(start);
		array = new int[max];
		
		do{
			array[start] = start + 1;
			sum += array[start];
		}while(++start < array.length);
		
		return sum;
	}

	public void Print() {
		System.out.println("========for ���============");
		System.out.println(forsum(0, 20));
		
		System.out.println("========while ���============");
		System.out.println(whilesum(0, 20));
		
		System.out.println("========dowhile ���============");
		System.out.println(dowhilesum(0, 20));
	}
	
	public static void main(String[] args) {
		// 3���� 20���� ���ڸ� ���ϱ�
		Move obj = new Move();
		obj.Print();
	}

}
*/