public class SecondHighestCgpa {
    public static void main(String[] args) {

//        Problem 1:
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double highest = Double.MIN_VALUE;
        double secondHighest = Double.MIN_VALUE;

        for(double score : cgpa){
            if(score > highest){
                secondHighest = highest;
                highest = score;

            } else if (score > secondHighest && score !=highest) {
                secondHighest = score;

            }
        }

        if (secondHighest != Double.MIN_VALUE){
            System.out.println("The second highest CGPA is: " + secondHighest);
        }
    }

}




