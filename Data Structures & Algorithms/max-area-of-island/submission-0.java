class Solution {

    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {

        int maxarea = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                count =0;
                if(!visited[i][j] && grid[i][j] == 1){
                    dfs(grid,visited,i,j,n,m);
                    maxarea = Math.max(count,maxarea);
                }
            }
        }

        return maxarea;

        
    }

    public void dfs(int[][] grid,boolean[][] visited,int i,int j, int n, int m){

        if(i<0 || i>=n || j<0 || j>=m || visited[i][j] || grid[i][j] !=1){
            return;
        }

        visited[i][j] = true;
        count ++;

        dfs(grid,visited,i-1,j,n,m);
        dfs(grid,visited,i+1,j,n,m);
        dfs(grid,visited,i,j+1,n,m);
        dfs(grid,visited,i,j-1,n,m);

    }
}
