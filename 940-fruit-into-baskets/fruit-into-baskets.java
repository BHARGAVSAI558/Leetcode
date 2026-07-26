class Solution {
    public int totalFruit(int[] fruits) {
       int l=0;
       int ans=0;

    HashMap <Integer,Integer > dbs =new HashMap<>();
        // i = right

       for(int i=0;i<fruits.length;i++){
        int f=fruits[i];
        dbs.put(f,dbs.getOrDefault(f,0)+1);

       while(dbs.size()>2){
        int rem =fruits[l];
        dbs.put(rem,dbs.get(rem)-1);

        if(dbs.get(rem)==0){
            dbs.remove(rem);
        }
        l++;
       }

       ans=Math.max(ans,i-l+1);

       }
        
        return ans;
    }
}