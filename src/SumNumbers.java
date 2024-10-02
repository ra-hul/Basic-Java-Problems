import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number or type q to quit");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")){
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sum += number;

            }catch (NumberFormatException e){
                System.out.println("Invalid , please enter another number: ");

            }
            System.out.println("This sum is: "+ sum);

        }
    }
}
