public class DiscountLaptop {
    public static void main(String[] args) {
          String para = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? ";
        System.out.println(para);

        int laptopPrice = extractDigitFromPara(para, "laptop price is ");
        int mousePrice = extractDigitFromPara(para, "mouse price is ");
        int discountPercentage = 15;

        int totalCost = laptopPrice + mousePrice;

        double discount = totalCost * (discountPercentage / 100.0);

        double finalCost = totalCost - discount;

        System.out.println("Total cost after the discount: "+ finalCost + "tk");

    }

     private static int extractDigitFromPara( String text, String keyword ){
        int index = text.indexOf(keyword);
        if (index != -1){
            index += keyword.length();

            StringBuilder number = new StringBuilder();

            while (index < text.length() && Character.isDigit(text.charAt(index))){
                    number.append(text.charAt(index));
                    index++;
            }
            if (number.length() > 0) {
                return Integer.parseInt(number.toString()); // Convert the number string to an integer
            }

        }
        return 0;
    }
}
