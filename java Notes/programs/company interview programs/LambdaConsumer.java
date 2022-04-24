// package com.lambda.consumer 

import java.util.function.*;

class Movie {
	String name ;
	Movie(String name ){
		this.name = name ;
	}
}

class LambdaConsumer {
	public static void main(String[] args ){


		Consumer<Movie> c1 = m -> System.out.println(m.name + "is ready");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " is already released ");
		Consumer<Movie> c3= m -> System.out.println(m.name +  " stored in database ");
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);

		Movie s = new Movie("ram eama");
		cc.accept(s);

	}
}