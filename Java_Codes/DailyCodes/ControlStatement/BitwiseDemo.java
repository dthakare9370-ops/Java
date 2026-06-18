class BitwiseDemo{
	public static void main(String args[]){
		int a = -10;
		int b = 2;

		System.out.println("Bitwise or : "+(a|b));
		System.out.println("Bitwise And : "+(a&b));
		System.out.println("Bitwise Negation : "+(~b));
		System.out.println("Bitwise Xor : "+(a^b));
		System.out.println("Bitwise Left shift : "+(a<<b));
		System.out.println("Bitwise Right Shift : "+(a>>b));
		System.out.println("Bitwise unsing Right shift : "+(a>>>b));
	}
}
