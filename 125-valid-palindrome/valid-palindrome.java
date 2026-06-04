class Solution {
    public boolean isPalindrome(String s) {

      
   StringBuilder k=new StringBuilder();

       for(char c:s.toCharArray()){

        if(Character.isLetterOrDigit(c)){
            k.append(Character.toLowerCase(c));
        }
       }
    String s1=k.toString();
    String s2=k.reverse().toString();

    return s1.equals(s2);
     

       }
}