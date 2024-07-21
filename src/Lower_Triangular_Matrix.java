public class Lower_Triangular_Matrix {
    public static void main(String [] args){


        int a[][] = { {1,2,3} , {4,5,6} , {7,8,9}} ;


        System.out.println("Matrix be ") ;

        for(int i = 0; i<a.length ; i++){

            for(int j = 0; j<a[0].length ; j++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println() ;
        }

        System.out.println("Lower triangular matrix be ");

        for(int i = 0; i<a.length ; i++){

            for(int j = i+1 ; j< a[0].length ; j++){
                a[i][j] = 0 ;
                //System.out.print(a[i][j] + " ") ;
            }
            for(int j = 0; j<a[0].length ; j++){
                System.out.print(a[i][j]+ " ") ;
            }
            System.out.println() ;
        }
    }
}
