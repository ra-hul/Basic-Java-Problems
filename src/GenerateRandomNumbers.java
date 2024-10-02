import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
                int [] randomNumbers = new int [10];

        Random random = new Random();

        for ( int i = 0; i < randomNumbers.length; i++ ){
            randomNumbers[i] = random.nextInt(100) + 1;
        }

        System.out.println("Generated random numbers: ");
        for ( int number : randomNumbers){
            System.out.print(number+ " ");
        }
        System.out.println();

        int max = randomNumbers[0];
        int min = randomNumbers[0];

        for (int i = 0; i <randomNumbers.length; i++){
            if (randomNumbers[i] > max){
                max = randomNumbers[i];
            }
            if (randomNumbers[i] < min){
                min = randomNumbers[i];

            }

        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: "+ min );
    }
}
