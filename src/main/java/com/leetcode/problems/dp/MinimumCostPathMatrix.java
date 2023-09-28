package com.leetcode.problems.dp;

public class MinimumCostPathMatrix {
    private static final int r=4,c=5;
    private static int minimumCost(int[][] matrix,int i, int j){
        if(i == r-1 && j == c-1)
            return matrix[i][j];
        if(i == r-1)
            return matrix[i][j] + minimumCost(matrix, i,j+1);
        if(j == c-1)
            return matrix[i][j] + minimumCost(matrix, i+1, j);

        return matrix[i][j] + Math.min(minimumCost(matrix, i+1, j),
                minimumCost(matrix, i, j+1));

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {3,2,12,15,10},
                {6,19,7,11,17},
                {8,5,12,32,21},
                {3,20,2,9,7},
        };

        System.out.println(minimumCost(matrix,0,0));
    }
}
