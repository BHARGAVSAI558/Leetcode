class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }

        String cleaned = str.toString();
        String reversed = str.reverse().toString();

        return cleaned.equals(reversed);
    }
}