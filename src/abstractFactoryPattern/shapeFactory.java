package abstractFactoryPattern;

public class shapeFactory implements abstractFactory{

	@Override
	public color getcolor(String co) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public shape getshap(String sh) {
		if ("changfangxing".equals(sh)) {
			return new changfangxinag();
		}
		if ("yuanxing".equals(sh)) {
			return new yuanxing();
		}
		if ("zhengfangxing".equals(sh)) {
			return new zhengfangxing();
		}
		return null;
	}
}
