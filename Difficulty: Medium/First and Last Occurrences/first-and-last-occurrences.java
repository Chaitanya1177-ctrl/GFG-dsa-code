// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        
        ArrayList<Integer>re=new ArrayList<>();
        int f=-1;
        int l=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(f==-1){
                    f=i;
                }l=i;
            }
            
          
        }
        re.add(f);
        re.add(l);
        return re;
    }
}
