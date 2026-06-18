class StringReverse2{
	public static void main(String args[]){
		String str1 = "Ganesh";

		System.out.println(str1);

		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
	}
}

