class StringBuffer_Method{
	public static void main(String args[]){
		StringBuffer str1 = new StringBuffer("ganu");
		StringBuffer str2 = new StringBuffer("Thakare");

		// public void ensureCapacity();
                // str1.ensureCapacity(30);
                // System.out.println(str1.capacity());
		
		//public StringBuffer append(obj);
		System.out.println(str1.append(str2));

		//public int capacity();
		System.out.println(str1.capacity());

		
		//public char charAt(int index);
		System.out.println(str1.charAt(1));

		//int length();
		System.out.println(str1.length());

		//void setLength(int);
		//str1.setLength(30);
		//System.out.println(str1.length());
		

		//public StringBuffer delete(int,int);
		System.out.println(str1.delete(4,10));

		//public StringBuffer deleteCharAt(int);
		System.out.println(str1.deleteCharAt(4));

		//StringBuffer replace(int, int, String);
		System.out.println(str1.replace(0,2,"hi"));

		//public String substring(int);
		System.out.println(str1.substring(1));

		str1 = new StringBuffer("Ganu");
		
		//public String substring(int, int);
		System.out.println(str1.substring(1,3));

		/*
		  public StringBuffer insert(int, char[], int, int);
 		  public StringBuffer insert(int, java.lang.Object);
  		  public StringBuffer insert(int, java.lang.String);
  		  public StringBuffer insert(int, char[]);
  	          public SringBuffer insert(int, java.lang.CharSequence);
		*/

		//System.out.println(str1.insert(4,"thakare"));
		System.out.println(str1.insert(4,str2));


		//public StringBuffer reverse();
		StringBuffer str3 = new StringBuffer("Ganu");
		System.out.println(str3.reverse());

		
		//public String toString();
		String s = str1.toString();
		System.out.println(s);

		//int indexOf(String str)
		System.out.println(str1.indexOf("T"));

		str1.append("T");
		//int lastIndexOf(String str)
                System.out.println(str1);
		System.out.println(str1.lastIndexOf("T"));


	}
}
