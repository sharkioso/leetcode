class Solution {
    public double myPow(double x, int n) {
        int remX = x;
        for (int i = 0; i < abs(n); i++) {
            remX = remX * x;
        }
        if (n>0){
            return x;
        }
        else{
            return 1/x;
        }
    }
}
