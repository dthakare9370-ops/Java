class StringBufferDemo1{
	public static void main(String args[]){
		// String buffer always write a new keyword there is no scp area it can always store on the heap area
		// it always used methods of Stringbuffer class we canot used + operator to concate the string 
		StringBuffer str1 = new StringBuffer("ganu"); //heap
		//System.out.println(str1);
		StringBuffer str2 = new StringBuffer("thakare"); //heap

		//str1  = str1+str2; //Error :  bad operand types for binary operator '+'

		//str1 = str1.concate(str2); // Error : Cannot find Symbol 
		
		str1 = str1.append(str2);
		System.out.println(str1);

	}
}
