package BuilderPattern;

public abstract class DrinkCloud implements Item{
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}
}
