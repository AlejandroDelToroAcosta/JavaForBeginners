public class GetShortestWord
{
    //code the method getShortestWord that accepts two words and returns the shortest one
    public static String getShortestWord(String word1, String word2){
        int length1 = word1.length();
        int length2 = word2.length();
        if (length2 > length1){
            return word1;
        }else {
            return word2;
        }

    }
}