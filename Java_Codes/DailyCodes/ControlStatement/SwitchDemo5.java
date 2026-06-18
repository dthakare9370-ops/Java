class SwitchDemo5 {
    public static void main(String[] args) {
        String cmpName = "Microsoft";
        switch(cmpName) {
            case "Apple"->System.out.println("Steve Jobs");
            case "Microsoft"->System.out.println("Bill Gates");
            case "Tesla"->System.out.println("Elon Musk");
            case "Amazon"->System.out.println("Jeff Bezos");
            default->System.out.println("Trump tatya");
        }
    }
}

