package Abstraction.Interface;

public class Iphone implements Phone {

	@Override
	public String os() {
		return "IOS";
	}

	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public int memory() {
		return 64;
	}

}
