package BuilderPattern;

public class Wrapper implements Packing {
	@Override
	public String pack() {
		System.out.println("包装盒");
		return "包装盒";
	}

}
