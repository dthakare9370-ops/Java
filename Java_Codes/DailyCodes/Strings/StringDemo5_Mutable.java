class StringDemo5_Mutable{
	public static void main(String args[]){
		/*String str1= "ganu";
		//String str2 = "thakare";
		System.out.println(str1 + "thakare");
		System.out.println(str1);
		*/


		/* String str1 = "ganu";
		System.out.println(System.identityHashCode(str1));

		String str2 = new String("ganu");
		System.out.println(System.identityHashCode(str2));

		String str3 = "ganu";
		System.out.println(System.identityHashCode(str3));
		*/

		String str2 = "ganuthakare";
		String str1 = "ganu";
		System.out.println(System.identityHashCode(str1));

		str1 = str1+"thakare";
		System.out.println(System.identityHashCode(str1));

		//str1=str1.intern();
		//System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
