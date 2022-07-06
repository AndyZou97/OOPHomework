public class SeperateDuplicates
{
   public static void main(String[] args)
   {

      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));

   }

   public static String seperateDuplicatesChars(String str)
   {
      String result = "";
      for(int i = 0; i < str.length() - 1; i ++){
         if(str.charAt(i) == str.charAt(i + 1)){
            result += str.charAt(i) + "-";
         }
         else{
            result += str.charAt(i);
         }
      }
      result += str.charAt(str.length() - 1);
      return result;

   }
}