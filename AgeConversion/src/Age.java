import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int months = year *12;
        int weeks = 84 * year;
        int days = year * 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println("You are " + year + " years old.");

        System.out.println("You have spent" + months+ " months " + weeks + " + weeks,\n" + days +
        " + hours, + " + hours + " minutes, " + minutes + " seconds, " + seconds + " being alive." );
    }
}
