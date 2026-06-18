import java.util.*;
class RemarkGrade{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Pointer :- ");
                int pointer = sc.nextInt();

                switch(pointer){
			case 9:
                                System.out.println("O");
                                break;
                        case 8:
                                System.out.println("A+");
                                break;
			case 7:
                                System.out.println("A");
                                break;
			case 6:
                                System.out.println("B+");
                                break;
			case 5:
                                System.out.println("C");
                                break;
			case 4:
                                System.out.println("P");
                                break;
                        default :
                                System.out.println("F");
                }
        }
}
