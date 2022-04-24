//Array of Object type:We can store any types of element in this
import java.util.Arrays;
class UniversalArray {
  public static void main(String[] args) {
  	//In Java, object of child class can be assigned to parent
  	//reference
  	Object[] arr = new Object[4];
  	arr[0] = 1;//int->Integer->Object
  	arr[1] ="PGA";//String->Object
  	arr[2] = 8.7f;//float->Float->Object
  	arr[3] = new Student(11,"fred",80);//Student->Object
  	System.out.println(Arrays.toString(arr));
  }
}



