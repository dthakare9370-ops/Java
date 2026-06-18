class Switch_DoubleDemo{
	public static void main(String args[]){
		double ch = 20.5;
		switch((int)ch){
			case (int)10.5 -> System.out.println("10.5");
			case (int)15.5 -> System.out.println("15.5");
			case (int)20.5 -> System.out.println("20.5");
			case (int)25.5 -> System.out.println("25.5");
			default->System.out.println("Invalide Choice");
		}
	}
}

