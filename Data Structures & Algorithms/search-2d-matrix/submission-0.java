class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int[] row : matrix){
            boolean res = search(row, target);
            if(res) return true;
        }

        return false;
    }

    public boolean search(int[] row, int target){
        for(int i : row){
            if(i == target) return true;
        }

        return false;
    }
}
