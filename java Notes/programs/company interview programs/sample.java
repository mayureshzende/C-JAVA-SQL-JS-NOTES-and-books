	// package company;
	import java.util.*;


	public class sample
	{
		public static void main(String[] args){

			Student s1 = new Student(1, " mayur ");
			new Student();
			// s1.setId(1);
			// s1.setName("mayur");

			System.out.println(s1);
			System.out.println("\r ma")	;
			 
			 int ch =97;
			 System.out.println((char)ch);		
		}
	}



	class Student {
		static int stat =1;
		private int id;
		private String name;


		Student(){
			stat++;
		}

		Student(int id, String name){
			// this(id);
			this.id = id; 
			this.name = name ;

		}


		public String toString(){
			return "id is "+ this.id + "name is = " + this.name+  "static si "+ stat ;
		}
 
		public void setId(int id){
			this.id = id; 
		}

		public int getId(){
			return this.id;
		}


		public void setName(String name){
			this.name = name ;
		}

		public String getName(){
			return this.name;
		}


		public String show(){
			return " id is - " + this.id + " name is - " + this.name; 
				}
	}