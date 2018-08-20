package abstractFactoryPattern;

public class FactoryProducer {
	public static abstractFactory getfactory(String factoryType) {
		if (factoryType != null) {
			if ("shape".equals(factoryType))
				return new shapeFactory();
			else if ("color".equals(factoryType))
				return new colorFactory();
		}
		return null;
	}
}
