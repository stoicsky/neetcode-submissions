class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();

        //Comparable and comparator are mainly used for defiining ordering of objects not for int and char.
        //For primitive arrays like char[] or int[], Arrays.sort() directly sorts the primitve values 
        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;


    }
}
