import java.util.Scanner;

public class BabiesHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] heights = new int[10];

        System.out.println("Enter the heights of 10 babies in cm: ");

        for (int i = 0; i < 10 ; i++){
            heights[i] = scanner.nextInt();
        }

        int firstLowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int i = 0; i <10 ; i++){
            if (heights[i] < firstLowest){
                secondLowest = firstLowest;
                firstLowest= heights[i];

            } else if (heights[i] < firstLowest && heights[i] != firstLowest ) {
                secondLowest = heights[i];

            }

        }

        System.out.println("The Two lowest heights are: ");
        System.out.println("First Lowest: "+ firstLowest);
        System.out.println("Second Lowest: "+ secondLowest);

        scanner.close();
    }
    }

