class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for (boolean[] row : visited) {
            java.util.Arrays.fill(row, false);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && visited[i][j] ==false){
                    islands++;
                    dfs(i,j,visited,grid,n,m);
                }
            }
        }
        return islands;
    }
    public void dfs(int i,int j,boolean[][] visited,char[][] grid, int n,int m){
        if(i<0||j<0||i>=n||j>=m||visited[i][j]||grid[i][j] !='1'){
            return;
        }
        visited[i][j] = true;
        dfs(i+1,j,visited,grid,n,m);//top
        dfs(i-1,j,visited,grid,n,m);//bottom
        dfs(i,j+1,visited,grid,n,m);//right
        dfs(i,j-1,visited,grid,n,m);//left
    }
}