class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet <Integer> dbs=new HashSet<>();

        for(int i:nums1){
            dbs.add(i);
        }
HashSet <Integer> klu=new HashSet<>();
         for(int i:nums2){
         if(dbs.contains(i)){
            klu.add(i);
         }

        }


        int arr[]=new int[klu.size()];
        int k=0;
        for(int i:klu){
            arr[k++]=i;
        }
        return arr;

    }

}