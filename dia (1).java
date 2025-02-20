
 class dia {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length; 

       
        for (int i = 0; i < n; i++) {
            if (i < n - 1 - i) {  
                int temp = matrix[i][n - 1 - i];  
                matrix[i][n - 1 - i] = matrix[n - 1 - i][i];  
                matrix[n - 1 - i][i] = temp;
            }
        }

       
        System.out.println("Matrix after reversing the diagonal:");
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  
        }
    }
}
