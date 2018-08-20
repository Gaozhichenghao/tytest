package FactoryPattern;

public class factoryImpl {
	public shape getShap(String sh) {
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
