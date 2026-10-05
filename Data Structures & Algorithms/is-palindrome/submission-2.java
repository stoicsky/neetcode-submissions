class Solution {
    public boolean isPalindrome(String s) {
        //optimal solution we will make it in only O(N) TC and space O(1)
        int l=0;
        int r=s.length()-1;

        while(l<r){

            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }

            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }else{
                l++;
                r--;
            }
        }
        return true;
    }
}
