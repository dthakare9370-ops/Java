import java.util.*;
class Calculater{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("*** Menu ***");
		System.out.println("\n1.Addition Enter(+)\n2.Subtraction(-)\n3.Division(/)\n4.Multiplication\n5.Modulus\nEnter Your Choice :- ");

                String op = sc.next();

		System.out.println("Enter First Number :- ");
		int no1 = sc.nextInt();
		System.out.println("Enter Second Number :- ");
		int no2 = sc.nextInt();

                switch(op){
                        case "+":
                                System.out.println("Addition is :- "+(no1+no2));
                                break;
			case "-":                                                                                            System.out.println("Subtraction is :- "+(no1-no2));                                              break;
			case "*":                                                                                            System.out.println("Multiplication is :- "+(no1*no2));                                              break;
			case "/":                                                                                            System.out.println("Division is :- "+(no1/no2));                                              break;
														     case "%":
														     		System.out.println("Mod is :- "+(no1%no2));
																break;
                        default :
                                System.out.println("Invalide Operation !!");
                }
        }
}
