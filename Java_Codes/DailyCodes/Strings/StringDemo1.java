class StringDemo1{
	public static void main(String args[]){
		String str1 = "hello"; //Store in SCP 
		String str2 = new String("hello"); //Creat New Object (Heap)
		String str3 = "hello"; //poind first Store hello String in SPC
		String str4 = new String("hello"); //Creat new Object 

		System.out.println(System.identityHashCode(str1)); 
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));  
		System.out.println(System.identityHashCode(str4));

		System.out.println(str1 == str3); //true
		System.out.println(str2 == str4); //false


		char a[] = {'A','B','C','D'};
		String str5 = new String(a); // allow

		System.out.println(a);

		//String str6 = a;  error
		 

		int b[] = {10,20,30};
		System.out.println(b);

		Integer c[] = {10,20,30};
		System.out.println(c);

	}
}
