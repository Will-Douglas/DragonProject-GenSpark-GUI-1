import java.util.Scanner;

public class DragonGame {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        int PlayerChoice = Integer.valueOf(UserInput.nextLine());

        if (PlayerChoice == 1) {
            System.out.println("You approach the cave. . .");
            System.out.println("It is dark and spooky. . .");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and. . .");
            System.out.println("Devours in one bite!");
        } else if (PlayerChoice == 2) {
            System.out.println("You approach the cave. . .");
            System.out.println("It is dark and spooky. . .");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and. . .");
            System.out.println("Makes a joke about a dragon guarding treasure from Humans!");
        }
        else {
            System.out.println("Invalid Choice!!");
        }
    }
}