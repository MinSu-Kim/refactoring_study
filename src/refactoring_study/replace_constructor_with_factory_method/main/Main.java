package refactoring_study.replace_constructor_with_factory_method.main;

import java.util.Arrays;
import java.util.List;

import refactoring_study.replace_constructor_with_factory_method.Shape;
import refactoring_study.replace_constructor_with_factory_method.ShapeFactoryProvider;
import refactoring_study.replace_constructor_with_factory_method.ShapeType;

public class Main {
	public static void main(String[] args) {
		
		List<Shape> shapes = Arrays.asList(
	            ShapeFactoryProvider.createShape(ShapeType.LINE, 0, 0, 100, 200),
	            ShapeFactoryProvider.createShape(ShapeType.RECTANGLE, 10, 20, 30, 40),
	            ShapeFactoryProvider.createShape(ShapeType.OVAL, 100, 200, 300, 400),
	            ShapeFactoryProvider.createShape(ShapeType.TRIANGLE, 100, 200, 300, 400)
	            );

		for(Shape s:shapes){
			s.draw();
		}
	}
}
