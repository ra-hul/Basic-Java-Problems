public class CountFromInteger {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";

        System.out.println("I am a SQA Engineer");

   String[] words = input.split("\\s+");
   int wordCount = words.length;

   String replaceSpaces = input.replace(" ", "");
   int charCount = replaceSpaces.length();

   int vowel = 0;
   int consonant = 0;
   replaceSpaces = replaceSpaces.toLowerCase();

   for (int i = 0; i<replaceSpaces.length(); i++){
       char c = replaceSpaces.charAt(i);

       if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
           vowel++;
       } else if (c >= 'a' && c<= 'z') {
           consonant++;

       }

   }

        System.out.println("Words: "+wordCount);
        System.out.println("Chars: "+charCount);
        System.out.println("Vowels: "+vowel);
        System.out.println("Consonant: "+consonant);
}

}

