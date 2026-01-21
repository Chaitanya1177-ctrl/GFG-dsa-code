class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        HashMap<String,ArrayList<String>>ss=new HashMap<>();
        for(String word:arr){
            char []ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            ss.putIfAbsent(key, new ArrayList<>());
            ss.get(key).add(word);
        }
        return new ArrayList<>(ss.values());
        
    }
}
