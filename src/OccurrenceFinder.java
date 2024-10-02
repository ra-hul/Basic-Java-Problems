import java.util.HashMap;
import java.util.Map;

public class OccurrenceFinder {
    public static void main(String[] args) {
                System.out.println("I Live in Dhaka");

        String input = "I Live in Dhaka";

        input = input.toLowerCase().replace(" ", "");

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i =0; i < input.length(); i++){
            char c = input.charAt(i);


            if (countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            } else {
                countMap.put(c, 1);
            }

        }

        for (Map.Entry<Character,Integer> entry: countMap.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());

        }
    }
}
