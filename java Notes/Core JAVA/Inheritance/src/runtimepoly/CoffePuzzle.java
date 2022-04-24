package runtimepoly;

import java.io.*;
class Beverage {
	public void prepare() {
		System.out.println("Prepare");
		sugar();
	}
	public void sugar() {
		System.out.println("Beverage:Sugar");
	}
}
class Coffee extends Beverage {
	public void sugar() {
		System.out.println("Coffee:Sugar");
	}
}
public class CoffePuzzle {
	public static void main(String[] args) {
		Beverage obj = new Coffee();
		obj.prepare();
	}
}


















