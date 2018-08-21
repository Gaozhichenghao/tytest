package BuilderPattern;

public abstract class burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

}
