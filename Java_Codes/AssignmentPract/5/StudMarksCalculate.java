import java.util.*;

class StudemarksCalculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter Five Subject Marks : ");
        int math = sc.nextInt();
	int english = sc.nextInt();
	int java = sc.nextInt();
	int cpp = sc.nextInt();
	int php = sc.nextInt();
	int marks = 0;

	if(((math>=35 && english>=35) && (java>=35 && cpp>=35)) && (php>=35)){
		marks = math+english+java+cpp+php;
	}
	int index =0;
	if(marks>450){
		index= 1;
	}else if(marks>350){
		index = 2;
	}else if(marks>175){
		index = 3;
	}

        switch (index) {
            case 1:
                System.out.println("First Class !");
                break;
            case 2:
                System.out.println("Second Class !");
                break;
	    case 3:
		System.out.println("Pass");
		break;
            default:
                System.out.println("Fail ");
        }
    }
}

