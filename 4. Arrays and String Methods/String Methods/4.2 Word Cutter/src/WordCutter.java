public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    /* Code the cutInHalf method that returns the first half of the word input. */
    public static String cutInHalf(String word){
        int length = word.length();
        int divisor = length/2;
        return word.substring(0, divisor);
    }
}