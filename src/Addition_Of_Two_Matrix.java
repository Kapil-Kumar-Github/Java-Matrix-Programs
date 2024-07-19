public class Addition_Of_Two_Matrix {
    public static void main(String [] args){
        int row1 = 2 ;
        int col1 = 3 ;
        int a[][] = new int[row1][col1] ;
        a[0][0] = 2 ;
        a[0][1] = 3 ;
        a[0] [2] = 4 ;

        a[1][0] = 5 ;
        a[1][1] = 6 ;
        a[1][2] = 7 ;
        System.out.println("First matrix be ") ;
        for(int i = 0; i<row1 ; i++){

            for(int j = 0; j<col1 ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println() ;
        }

        int row2 = 2 ;
        int col2 = 3 ;

        int b[][] = new int[row2][col2] ;

        b[0][0] = 8 ;
        b[0][1] = 9 ;
        b[0][2] = 10 ;
        b[1][0] = 11 ;
        b[1][1] = 12 ;
        b[1][2] = 13 ;
        System.out.println("Second matrix be ") ;

        for(int i = 0; i<row2 ; i++){

            for(int j = 0; j<col2 ; j++){
                System.out.print(b[i][j] + " ") ;
            }
            System.out.println() ;
        }

        System.out.println("Sum of matrix of a and b be ") ;

        for(int i = 0 ; i<row1 ; i++){

            for(int j=0; j<col1; j++){

                System.out.print(a[i][j]+ b[i][j] + " ");
            }
            System.out.println();
        }

     }
}
