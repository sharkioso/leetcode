class Solution {
    public boolean isPalindrome(int x) {
        int palindromeNumb = 0;
        int remX = x;
        int k = 10;
        while (x > 0) {
            palindromeNumb *= 10;
            palindromeNumb += x % k;
            x = x / 10;
        }
        if (remX == palindromeNumb) {
            return true;
        } else {
            return false;
        }
    }
}