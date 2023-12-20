package chapter8;
   // String
public class TextProcessor {
       public static void main(String[] args) {
           countWords("how many words in this text ?");
           reverseString("HELLO");
           addSpaces("HeyPleaseEnterSpacesBetweenWords");
       }

       private static void addSpaces(String text) {
           StringBuilder modifiedText = new StringBuilder(text);
           // now i can modify string (insert , delete)
           for (int i=0; i<text.length();i++)
           {
               if (i!=0 && Character.isUpperCase(modifiedText.charAt(i)) )
               { modifiedText.insert(i," ");
               i++;}
           }
           System.out.println(modifiedText);
       }

       /**
        * add space before each uppercase letter
        * @param text
        */
       private static void reverseString(String text) {
           String reversedText ="";

           for (int i =text.length()-1;i>=0;i--)
           {
               reversedText+=text.charAt(i);
           }
           System.out.println(reversedText);
       }

       /** split string into array
        * counts words and prints thim
        * @param text full string to be split
        */
       private static void countWords(String text)
       {

          var words = text.split(" "); // =String [] x =text.split(" ");
          // var: dynamic typed detect data type at run time
           // in this case : datatype will be an array of string
          int numberOfWords = words.length;
          String message = String.format("your text contains %d words ",numberOfWords);
             // => message = "your text contains" +numberOfWords + "words";
           System.out.println(message);
           for (int i=0 ; i<numberOfWords;i++)
           {
               System.out.println(words[i]);
           }
       }
   }
