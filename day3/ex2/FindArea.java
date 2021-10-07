package com.hsbc.geometry;


public class FindArea {

	public static void main(String[] args) {
		
		System.out.println("Area of Circle:");
		Circle cr = new Circle();
		GeometryUI.printArea(cr, 5);
		System.out.println("Area of Sphere:");
		Sphere sp = new Sphere();
		GeometryUI.printArea(sp, 6);
	}
}
