class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>>map= new HashMap<>();

        //sort each string
        for(int i=0;i<strs.length;i++){
            char[] chars= strs[i].toCharArray();
            Arrays.sort(chars);
            String wordKey=new String(chars);

            if(!map.containsKey(wordKey)){
                List<String> list= new ArrayList<>();
                list.add(strs[i]);
                map.put(wordKey,list);
            }else{
                map.get(wordKey).add(strs[i]);
            }


        }
        List<List<String>> result= new ArrayList<>();
        for(List<String> s: map.values()){
            result.add(s);
        }
        return result;
        
        
    }
}
