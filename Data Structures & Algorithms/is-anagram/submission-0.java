class Solution {
    public boolean isAnagram(String s, String t) {
        //HashMap best solution
        HashMap<Character,Integer>string1= new HashMap<>();
        HashMap<Character,Integer>string2= new HashMap<>();

        for(int i=0;i<s.length();i++){
                   string1.put(s.charAt(i),string1.getOrDefault(s.charAt(i),0)+1);

        }
        for(int i=0;i<t.length();i++){
                   string2.put(t.charAt(i),string2.getOrDefault(t.charAt(i),0)+1);

        }
        if(string1.equals(string2)){
            return true;
        }
        return false;

    }
}
