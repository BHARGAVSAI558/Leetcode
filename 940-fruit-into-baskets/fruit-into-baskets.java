class Solution {
    public int totalFruit(int[] fruits) {
      
      int l=0;
      int max=1;
HashMap <Integer,Integer> dbs=new HashMap<>();

      for(int i=0;i<fruits.length;i++)
      {

        int f1=fruits[i];

    dbs.put(f1,dbs.getOrDefault(f1,0)+1);

        while(dbs.size()>2)
        {
            int f2=fruits[l];

            dbs.put(f2,dbs.get(f2)-1);

            if(dbs.get(f2)==0){
                dbs.remove(f2);
            }
            l++;
        }
       
           max= Math.max(max,i-l+1);
        
      }

      return max;

    }
}