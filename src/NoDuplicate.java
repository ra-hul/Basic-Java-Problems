import java.util.Arrays;

public class NoDuplicate {
    public static void main(String[] args) {
                int[] num = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
        System.out.println(Arrays.toString(num));

        System.out.println("Non Duplicate Numbers ");

        for ( int i =0; i< num.length; i++ ){
            int countofNumbers = 0;


            for (int j = 0; j< num.length; j++){
                if (num[i]  == num[j]){
                    countofNumbers++;

                }
            }
            if (countofNumbers == 1){
                System.out.print(num[i]+ " ");

            }
        }
    }
}
