public class Sum_Of_Each_Row_And_Column {
    public static void main(String [] args){

        int [][] a = { {1,2,3}, {4,5,6}, {7,8,9} } ;

        System.out.println("Our array be ") ;
        int col_sum = 0 ;
        for(int i = 0; i<a.length ; i++){
            int row_sum = 0;


            for(int j = 0; j<a[0].length ; j++){
                row_sum = row_sum + a[i][j] ;
                //col_sum = col_sum + a[j][i] ;
                System.out.print(a[i][j] + " ");
            }
            System.out.println("Sum be " + row_sum);
            System.out.println() ;
        }

        for(int i =0 ;i<a.length ; i++){
            col_sum = 0 ;
            for(int j = 0; j<a[0].length; j++){
                col_sum = col_sum + a[j][i];

            }
            System.out.println("sum of elements of column "+(i+1) + " be " + col_sum );
        }
    }
}
