package com.leo.lintcode.simple;

/**
 * Created by ChangSheng on 2016/9/30 11:25.
 */
public class NumIslands {

    public int numIslands(boolean[][] grid){
        int result = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == false){
                    continue;
                }else if (grid[i][j] == true){
                    cleanNum(i,j,grid);
                    result++;
                }
            }
        }
        return result;
    }

    private void cleanNum(int i, int j, boolean[][] grid) {
        if (grid[i][j] == true) {
            grid[i][j] = false;
            if (i >= 1) cleanNum(i-1,j,grid);
            if (j >= 1) cleanNum(i,j-1,grid);
            if (i+1 < grid.length) cleanNum(i+1,j,grid);
            if (j+1 < grid[i].length) cleanNum(i,j+1,grid);
        }
    }

    public static void main(String[] args) {
        boolean[][] grid = {
                {true, true, false, false, false},
                {false, true, false, false, true},
                {false, false, false, true, true},
                {false, false, false, false, false},
                {false, false, false, false, true}
        };
        System.out.println(new NumIslands().numIslands(grid));
    }
}
