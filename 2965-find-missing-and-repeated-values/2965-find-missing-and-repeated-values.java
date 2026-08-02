class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int i,j;
        int n = grid.length;
        int a[] = new int[(n*n)+1];
        int b[]= new int[2];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[grid[i][j]]++;
            }
        }
        for(i=1;i<(n*n)+1;i++){
        if(a[i]==2){
            b[0]=i;
        }
        if(a[i]==0){
            b[1]=i;
        }
        }   
        return b;

    }
}