class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int left = 0;
        int right = matrix.length - 1;
        int row = -1;

        while(left <= right){
            
            int middle = (left + right)/2;
            
            int middlel = matrix[middle][0];
            int middler = matrix[middle][matrix[middle].length - 1];

            if(middlel <= target && middler >= target){
                row = middle;
                break;
            } 

            if(middlel > target) right = middle - 1;
            else left = middle + 1;
        }

        if(row == -1) return false;
        left = 0;
        right = matrix[row].length - 1;

        while(left <= right){
            
            int middle = (left + right)/2;

            if(matrix[row][middle] == target) return true;

            if(matrix[row][middle] > target) right = middle - 1;
            else left = middle + 1; 


        }

        return false;
    }
}
