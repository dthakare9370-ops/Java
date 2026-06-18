class IfElseLadderDemo1 {
    public static void main(String[] args) {
        int courseId = 3;
        if(courseId == 1) {
            System.out.println("Java Course");
            System.out.println("Includes : Java, DSA, DBMS, OS");
        } else if(courseId == 2) {
            System.out.println("Python Course");
            System.out.println("Includes : Python, IOT, ML, AI");
        } else if(courseId == 3) {
            System.out.println("Bootcamp Course");
            System.out.println("Includes : C, CPP, DSA");
        } else if(courseId == 4) {
            System.out.println("Flutter Course");
            System.out.println("Includes : Dart, Flutter");
        } else if(courseId == 5) {
            System.out.println("WebDev Course");
            System.out.println("Includes : HTML, CSS, JS, React");
        } else if(courseId == 6) {
            System.out.println("Backend Course");
            System.out.println("Includes : Adv Java, Springboot");
        } else {
            System.out.println("Invalid Course Id");
        }
    }
}

