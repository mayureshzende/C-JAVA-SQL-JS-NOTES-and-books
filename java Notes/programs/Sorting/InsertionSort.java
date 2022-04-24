package Ds.Algo.Sorting;

public class InsertionSort {
	
public static void main(String[] args) {
	
	
	int[] arr = { 35, 20, -15, 7, 55, 10, -22 };
	System.out.println(arr.length);

	for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) //here we start with the second element assuming first is already sorted 
	{
		int newElement = arr[firstUnsortedIndex];//storing  the second element in the variable 

		int i=firstUnsortedIndex; // i starts with the second element and it compares the sorted partition from right to left

//		for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) // here we check the condition with the sorted element and the selected element
//		{
//			arr[i] = arr[i-1]; //assign the greater element to the cuurent element position i.e i = firstUnsortedindex
//		}
		while (i > 0 && arr[i - 1] > newElement) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[i] = newElement;
	}		
	for (int i : arr) {
		System.out.println(i);
	}
}
}
