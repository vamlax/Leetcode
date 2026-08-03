class Solution {
    public double myPow(double x, int n) {
        double expo=0;
        double i=1;
        double d = (double) n; 
        
        if(n>0){
            expo=Math.pow(x,d);
            
        }
        if(n==0){
            return 1;
        }

        else{
            expo=1/Math.pow(x,-d);
        }
        return expo;
    }
}