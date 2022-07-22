package Abstraction.Interface;

public class OnePlus implements Phone {

	@Override
	public String os() {
		
		return "Android";
	}

	@Override
	public String processor() {
		return "SD888";
	}

	@Override
	public int memory() {
		return 128;
	}

}
