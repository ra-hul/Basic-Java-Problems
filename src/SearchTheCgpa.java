import java.util.Scanner;

public class SearchTheCgpa {
    public static void main(String[] args) {
                double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        bubbleSort(cgpa);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your CGPA to search:");
        double targetCGPA = scanner.nextDouble();

        boolean found = binarySearch(cgpa,targetCGPA);

        if (found){
            System.out.println("CGPA " + targetCGPA + " is present in the array");
        } else {
            System.out.println("CGPA " + targetCGPA + " is not preset in the array");
            System.out.println("Try to find again....");
        }


        }


      public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

        public static boolean binarySearch(double[] arr, double target){
        int left = 0;
        int right = arr.length -1;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                return true;

            }
            if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;

        }


    }

