class BinarySearch {
  public static void main(String[] args) {
  	int arr[]={3,5,9,14,22,29,37,44,48,59,63,79,81,100};
  	for(int i=1;i<=100;i++) {
  	  if(binarySearch(arr,i)) {
  	  	System.out.println("Number " + i + " present");
  	  }
  	}
  }

  static boolean binarySearch(int[] arr, int n) {
  	int start = 0;
  	int end = arr.length-1;
  	int mid = 0;
  	while(start <= end) {
  		mid = (end+start)/2;
  		if(n == arr[mid]) { return true;}	
  		if(n < arr[mid]) {
  			end = mid - 1;
  		}else {
  			start=mid + 1;
  		}
  	}
  	return false;
  }
}








