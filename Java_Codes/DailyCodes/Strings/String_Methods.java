class String_Methods{
	public static void main(String args[]){
		String str1 = "Ganesha";
		String str2 = " Thalare";

		//public String Concat(String)      -   this is used to concate two string and return the new String store in heap
		System.out.println(str1.concat(str2));

		//public int length() -  this method return the integer value - number of charator present in string
		System.out.println(str1.length());
		
		//public chat charAt(int) - this method retun the charctor which is present on the index number
		System.out.println(str1.charAt(2));

		//public int compareTo(String) -  if string are equal then return 0 or return differance 
		System.out.println(str1.compareTo("ganesh")); 

		//public int compareToIgnoreCase(String) -  if equal return 0 
		//A negative value if the calling string is lexicographically less than the argument.
		//A positive value if the calling string is lexicographically greater than the argument. 
		System.out.println(str1.compareToIgnoreCase("Ganesh"));

		
		//public string replace(char,char) 
		String str3 = str1.replace('a','s');
		System.out.println(str3);


		//public int indexOf(int) 
		System.out.println(str1.indexOf(3));

	}
}
