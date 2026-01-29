class Solution {
    public String reverseWords(String s) {
        // Code here
        ArrayList<String>re=new ArrayList<>();
        String []ss=s.split("\\.");
        for(String l:ss){
            if(!l.isEmpty()){
                re.add(l);
            }
        }
        
        
        
        Collections.reverse(re);
        return String.join(".",re);
    }
}
