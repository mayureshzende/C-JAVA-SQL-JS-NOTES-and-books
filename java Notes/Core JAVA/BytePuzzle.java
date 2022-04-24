class BytePuzzle {
  public static void main(String[] args) {
  	byte b1 = (byte)130; //-128 to 127
  	byte b2 = (byte)155;
  	byte b3 = (byte)300;
  	byte b4 = (byte)1000;
  	System.out.println(b1);//-126 
  	System.out.println(b2);//-101
  	System.out.println(b3);// 44
  	System.out.println(b4);//-24
  	for(byte b=0; b < 128; b++) {
  		System.out.println(b);//infinite loop
  	}
  }
}
//Formula: -128 + (n-128)=> n-256
// -- Reapply till number comes in the range


