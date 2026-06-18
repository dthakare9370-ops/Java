class IfElseDemo1 {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = true;

        System.out.println("Start Code");

        if(x = y) {  // This is an assignment, not a comparison!
            System.out.println("In If");
        } else {
            System.out.println("In Else");
        }

        System.out.println("End Code");
    }
}

