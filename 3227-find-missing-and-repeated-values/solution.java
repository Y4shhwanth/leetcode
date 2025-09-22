class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int n = grid.length;
        int[] arr = new int[n*n + 1];

        // Counting frequency of integers
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[grid[i][j]]++;
            }
        }

        int repeated = -1,missing=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] == 2)
                repeated = i;
            else if(arr[i]==0)
                missing = i;
        }


        return new int[]{repeated,missing};

    }
}
