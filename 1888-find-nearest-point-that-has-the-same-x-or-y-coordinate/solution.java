class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {

        int min = 10001;
        int pos = -1;

        for(int i=0; i<points.length; i++){
            if(points[i][0]==x||points[i][1]==y){
                int val = Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                if(val<min){
                    min = val;
                    pos = i;
                }
            }
        }
        return pos;
        
    }
}
