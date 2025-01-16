class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if (matrix.length == 0) {
            return result;
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int columnStart = 0;
        int columnEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
           //Traverse left to right           
            for (int i = columnStart; i <= columnEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
            //Traverse Top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(matrix[i][columnEnd]);
            }
            columnEnd--;
            //Traverse right to left
            if (rowStart <= rowEnd) {
                for (int i = columnEnd; i >= columnStart; i--) {
                    result.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            //Traverse bottom to top
            if (columnStart <= columnEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(matrix[i][columnStart]);
                }
            }
            columnStart++;
        }
        return result;
    }
}