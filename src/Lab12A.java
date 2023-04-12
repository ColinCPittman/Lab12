import java.util.Scanner;
class Lab12A {
    public static void main(String[] args) {
        int legs = getLegsFromUser();
        boolean rolls = getRollFromUser();
        String mat = getMaterialFromUser();
        Chair chair1 = new Chair(legs,rolls,mat);
        printChairDescription(chair1);
        System.out.println("\nThis program is going to change that.");
        chair1.numOfLegs = 4;
        chair1.rolling = false;
        chair1.material = "wood";
        printChairDescription(chair1);

    }

    private static void printChairDescription(Chair c1) {
        if (c1.rolling) {
            System.out.println("\nYour chair has " + c1.numOfLegs + " legs, is rolling, and is made of " + c1.material + ".");
        }
        else {
            System.out.println("\nYour chair has " + c1.numOfLegs + " legs, is not rolling, and is made of " + c1.material + ".");
        }
    }

    public static String getMaterialFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your chair made of: ");
        return sc.nextLine();

    }
    public static boolean getRollFromUser() {
        Scanner sc = new Scanner(System.in);
        boolean roll;
        while (true) {
            try {
                System.out.print("Is your chair rolling (true/false): ");
                roll = sc.nextBoolean();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid Input, please enter true or false. Please try again.");
                sc.nextLine();
            }
        }
        return roll;
    }
    public static int getLegsFromUser() {
        Scanner sc = new Scanner(System.in);
        int legs;
        do {
            try {
                System.out.print("How many legs does your chair have: ");
                legs = Integer.parseInt(sc.nextLine());
                if (legs <= 0) {
                    System.out.println("Chairs must have at least 1 leg. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a positive integer (maximum value of 2,147,483,647). Please try again.");
                legs = -1;
            }
        } while (legs < 0);
        return legs;
    }
}
