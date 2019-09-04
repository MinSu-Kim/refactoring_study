package refactoring_study.replace_constructor_with_factory_method;

public class ShapeFactoryProvider {
	
	public static Shape createShape(ShapeType typeCode, int startX, int startY, int endX, int endY) {
		switch(typeCode) {
		case LINE:
			return ShapeLine.create(startX, startY, endX, endY);
		case RECTANGLE:
			return ShapeRectangle.create(startX, startY, endX, endY);
		case OVAL:
			return ShapeOval.create(startX, startY, endX, endY);
		case TRIANGLE:
			return ShapeTriangle.create(startX, startY, endX, endY);
		default:
			return null;
		}
		
	}
}
