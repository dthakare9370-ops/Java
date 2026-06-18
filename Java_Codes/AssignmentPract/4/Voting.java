import java.util.*;
class Voting{        
	public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Age : - ");
                int age = sc.nextInt();

                
		if(age>=18){
                        System.out.println(age + "Valide For Voting");
                }else{
                 	System.out.println("Invalide Age ");       
                }
        }
}
