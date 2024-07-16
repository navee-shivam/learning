package com;

import java.util.Scanner;

public class CircleSquare {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();

		((Shape) circle).drawShape();
		((Shape) square).drawShape();
		((Shape) rectangle).drawShape();

		System.out.println();

		ShapeFactory factory = new ShapeFactory();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			String type = in.next();
			factory.drawShape(type);
		}
	}

}

class Shape {
	public void drawShape() {
		System.out.println("Drawing a Shape");
	}
}

/*
 * Create the Circle, Square, Rectangle and ShapeFactory class.
 */

class Circle extends Shape {
	Circle() {
		System.out.println("Drawing a Circle");
	}

	@Override
	public void drawShape() {
		// System.out.println("Drawing a Circle");
	}
}

class Square extends Shape {

	Square() {
		System.out.println("Drawing a Square");
	}

	@Override
	public void drawShape() {
		// System.out.println("Drawing a Square");
	}
}

class Rectangle extends Shape {

	Rectangle() {
		System.out.println("Drawing a Rectangle");
	}

	@Override
	public void drawShape() {
		// System.out.println("Drawing a Rectangle");
	}
}

class ShapeFactory {
	public Shape drawShape(String ShapeType) {

		if (ShapeType == null) {
			return null;
		}

		if (ShapeType.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (ShapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (ShapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else {
			System.out.println("Drawing " + ShapeType + " is not supported");
		}
		return null;
	}
}
