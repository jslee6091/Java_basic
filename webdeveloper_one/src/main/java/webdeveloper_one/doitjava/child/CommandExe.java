package webdeveloper_one.doitjava.child;

public class CommandExe implements ChildCommand{
	// class�� ��� �����ϴ� ��
	
	@Override
	public String Sellcar() {
		System.out.println("�� �ȸ� ����");
		return "10";
	}
	
	@Override
	public void CarNumber() {
		System.out.println("�븮�� ���� ������");
	}
	
	public static void main(String[] args) {
		
		CommandExe command = new CommandExe();
		System.out.println(command.Sellcar());
		command.CarNumber();

	}

}
