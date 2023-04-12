import java.util.Scanner;

public class Lab12B {
    public static void main(String[] args) {
        System.out.print("You are about to create a dog.\nHow old is the dog: ");
        int age = getAgeIntFromUser();
        System.out.print("How much does the dog weigh: ");
        double weight = getWeightDoubleFromUser();
        System.out.print("What is the dog's name: ");
        String name = getStringFromUser();
        System.out.print("What color is the dog: ");
        String color = getStringFromUser();
        System.out.print("What breed is the dog: ");
        String breed = getStringFromUser();
        Dog dog1 = new Dog(name,age,weight,color,breed);
        System.out.println(); // to match spacing of example
        printDogDescription(dog1);
        dog1.bark();
        System.out.print(dog1.getName() + " is hungry, how much should he eat: "); //the program example output used "he eat" but there is no gender attribute to be able to qualify the gender in this statement, using a gender-neutral pronoun here would be better however I must try to appease the autograder.
        dog1.eat(getWeightDoubleFromUser());
        System.out.print(dog1.getName() + " isn't a very good name. What should they be renamed to: ");
        dog1.rename(getStringFromUser());
        printDogDescription(dog1);
    }

    private static void printDogDescription(Dog dog1) {
        System.out.println(dog1.getName() + " is a " + dog1.getAge() + " year old " + dog1.getFurColor() + " " + dog1.getBreed() + " that weighs " + dog1.getWeight() + " lbs.\n");
    }

    public static String getStringFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static double getWeightDoubleFromUser() {
        Scanner sc = new Scanner(System.in);
        double x;
        do {
            try {
                x = Double.parseDouble(sc.nextLine());
                if (x <= 0) {
                    System.out.print("The weight cannot be less than or equal to zero.\nPlease try again: ");
                }
            }
            catch (Exception e) {
                System.out.print("Error: Invalid input. Please enter a valid double (eg. 3.5).\nPlease try again: ");
                x = -1.0;
            }
        } while (x < 0);
        return x;
    }

    public static int getAgeIntFromUser() {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            try {
                x = Integer.parseInt(sc.nextLine());
                if (x <= 0) {
                    System.out.print("The age of the dog can't be negative.\nPlease try again: ");
                }
            } catch (Exception e) {
                System.out.print("Error: Invalid input. Please enter a positive integer (maximum value of 2,147,483,647).\nPlease try again: ");
                x = -1;
            }
        } while (x < 0);
        return x;
    }
}
