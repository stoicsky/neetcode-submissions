class Solution {
    public boolean isPalindrome(String s) {
        //Using StringBuilder -- stringBuilder are the best

        //1. first we will clean the string by considering only the alphanumeric

        StringBuilder sb= new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String result=sb.toString().toLowerCase();
        String reverseString=sb.reverse().toString().toLowerCase();

        return result.equals(reverseString);
    }
}
