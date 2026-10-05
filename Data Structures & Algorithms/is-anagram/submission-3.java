class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        //frequency array
        int[] freq= new int[26];
        char[] firstString=s.toCharArray();
        char[] secondString=t.toCharArray();

        for(int i=0;i<firstString.length;i++){
            freq[firstString[i]-'a']++;
            freq[secondString[i]-'a']--;

        }

        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;

    }
}
