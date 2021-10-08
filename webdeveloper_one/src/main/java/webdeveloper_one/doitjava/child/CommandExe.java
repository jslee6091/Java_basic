package webdeveloper_one.doitjava.child;

public class CommandExe implements ChildCommand{
	// class는 명령 실행하는 곳
	
	@Override
	public String Sellcar() {
		System.out.println("차 팔린 개수");
		return "10";
	}
	
	@Override
	public void CarNumber() {
		System.out.println("대리점 차량 보유량");
	}
	
	public static void main(String[] args) {
		
		CommandExe command = new CommandExe();
		System.out.println(command.Sellcar());
		command.CarNumber();

	}

}
