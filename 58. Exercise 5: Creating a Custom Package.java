//* Java Exercise 5: Creating a Custom Package

/*

 You have to create a package named com.codewithharry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions

*/

package com.codewithharry.shape;
import java.util.Scanner;

class Rectangle{
   int length;
   int breadth;	
	public int area(int l, int b){
	this.length = l;
	this.breadth = b;
	return l*b;	
	}
	public int perimeter(int l, int b){
	this.length = l;
	this.breadth = b;
	return 2*(l+b);
	}
}
class Square{
    int side;
	public int area(int s){
		this.side = s;
		return s*s;
	}
	public int perimeter(int s){
		this.side = s;
		return 4*s;
	}
}
class Circle{
    int radius;
	public double area(int r){
	this.radius = r;
	return Math.PI * r * r;
	}
	public double circumference(int r){
	this.radius = r;
	return 2 * Math.PI * r ;
	}
}
class Cylinder extends Circle{
   int height;
	public double volume(int r, int h){
	this.radius = r;
	this.height = h;
	return Math.PI * r * r * h;
	}
	public double surfaceArea(int r, int h){
	this.radius = r;
	this.height = h;
	return 2 * Math.PI * r * h + 2 * Math.PI * r * r;	
	}
}
class Sphere extends Circle{
	public double volume(int r){
	this.radius = r;
	return 4 * (Math.PI * r * r * r)/3;
	}
	public double surfaceArea(int r){
	this.radius = r;
	return 4 * Math.PI * r * r;
	}
}
public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth for rectangle: ");

		int a = sc.nextInt();
		int b = sc.nextInt();

		Rectangle rec = new Rectangle();
		System.out.println("The area for the given rectangle is: "+rec.area(a,b));
		System.out.println("The perimeter for the given rectangle is: "+rec.perimeter(a,b));
		System.out.println();

		Square s = new Square();
		System.out.println("Enter the side of a square: ");
		int side = sc.nextInt();
		System.out.println("The area of square is: "+s.area(side));
		System.out.println("The perimeter of square is: "+s.perimeter(side)); 
		System.out.println();

		Circle cir = new Circle();
		System.out.println("Enter the radius of a circle: ");
		int radi = sc.nextInt();
		System.out.println("The area of circle is: " + cir.area(radi));
		System.out.println("The circumference of circle is: " + cir.circumference(radi));
		System.out.println();

		Cylinder cyl = new Cylinder();
		System.out.println("Enter the height for cylinder: ");
		int height = sc.nextInt();
		System.out.println("The volume of cylinder is: " + cyl.volume(radi,height));
		System.out.println("The surface area of cylinder is: " + cyl.surfaceArea(radi,height));
		System.out.println();
        
		Sphere sph = new Sphere();
		System.out.println("The volume of sphere is: " + sph.volume(radi));
		System.out.println("The surface area of sphere is: " + sph.surfaceArea(radi));
	}
}


