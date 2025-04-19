import java.util.Scanner;
import java.util.Random;

class Players {
    int start = 0;
    int posi = 0;
    String name;

    int posi_change(int i, Scanner sc) {
        int[] bef_posi = {61, 21, 19, 43, 62, 36, 8, 28, 54, 66, 50, 47, 37, 52, 63, 97, 58, 74};
        int[] aft_posi = {99, 82, 38, 77, 96, 57, 26, 53, 88, 87, 91, 4, 7, 11, 17, 27, 40, 35};
        int m, n;
        int j, k;
        int temp;
        int snake = 0;
        int ladder = 0;
        int no_chance = 0;
        int dice_number;

        Random rand = new Random();

        temp = posi;

        dice_number = random_number();

        System.out.print("\n" + name + ": roll the dice by pressing the 0 and enter key\t");
        k = sc.nextInt();

        System.out.println("After the rolling of dice the number is:");
        System.out.println("***");
        System.out.println("*" + dice_number + "*");
        System.out.println("***");

        posi = posi + dice_number;

        if (posi > 100) {
            posi = temp;
            no_chance = 1;
        }

        for (m = 0; m < 11; m++) {
            if (posi == bef_posi[m]) {
                posi = aft_posi[m];
                System.out.println("Congratulations! " + name + ", you got a ladder.");
                i--;
                System.out.println("Play one more time.");
                ladder = 1;
                break;
            }
        }

        if (ladder != 1) {
            for (n = m; n < 18; n++) {
                if (posi == bef_posi[n]) {
                    posi = aft_posi[n];
                    System.out.println("Oops! " + name + ", you got swallowed.");
                    snake = 1;
                    break;
                }
            }
        }

        if (snake != 1 && ladder != 1 && no_chance != 1 && dice_number == 6) {
            System.out.println("play one more time.");
            i--;
        }

        return i;
    }

    static int random_number() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}

public class SnakeLadderGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        int endlimit = 0;
        int i, k;
        int change_i;

        System.out.println("Enter the no. of players:");
        limit = sc.nextInt();

        Players[] person = new Players[limit];
        for (i = 0; i < limit; i++) {
            person[i] = new Players();
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            person[i].name = sc.next();
        }

        while (endlimit != 1) {
            for (i = 0; i < limit; i++) {
                if (person[i].start != 1) {
                    int dice = Players.random_number();

                    System.out.print("\n" + person[i].name + ": roll the dice by pressing the 0 and enter key\t");
                    k = sc.nextInt();

                    System.out.println("After the rolling of dice the number is:");
                    System.out.println("***");
                    System.out.println("*" + dice + "*");
                    System.out.println("***");

                    if (dice == 1) {
                        person[i].posi = 1;
                        person[i].start = 1;
                        System.out.println("Play one more time.");
                        i--;
                    }
                } else if (person[i].posi > 0) {
                    change_i = person[i].posi_change(i, sc);
                    if (person[i].posi == 100) {
                        endlimit = 1;
                        break;
                    }
                    i = change_i;
                }

                for (int j = 0; j < limit; j++) {
                    System.out.println("Position of " + person[j].name + " is " + person[j].posi);
                }
            }
        }

        System.out.println("\n" + person[i].name + " is the winner of the game.");
    }
}