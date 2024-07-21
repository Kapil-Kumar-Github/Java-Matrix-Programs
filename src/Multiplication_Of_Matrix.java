import java.util.Scanner;
public class Multiplication_Of_Matrix {
    static void matrix_Creation(int  arr[][] ,int r , int c ){

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                Scanner sc = new Scanner(System.in) ;
                System.out.println("Enter the element in array of " +i+" row and "+j+" column");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    // Matrix multilplication function
static int row_1 ,col_1 ,row_2,col_2;
    static void multiplication(int arr1[][] ,int arr2[][], int row_1, int col_1 , int row_2, int col_2 , int c[][]){
        if(col_1 != row_2){
            System.out.println("You can not multiply matrix") ;
        }
        else{
            for(int i = 0 ; i<row_1 ; i++){

                for(int j = 0; j<col_2; j++){
                      c[i][j] = 0;
                    for(int z = 0; z<col_1; z++) {

                        c[i][j] = c[i][j] + arr1[i][z] * arr2[z][j] ;
                    }



                }



            }

            for(int i = 0; i<row_1; i++){
                for(int j = 0; j<col_2; j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println() ;

            }
        }
    }

    public static void main(String [] args){
       Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter row of first matrix be ") ;
        int row_a = sc.nextInt() ;
        System.out.println("Enter column of first matrix ") ;
        int col_a = sc.nextInt() ;

        int a[][]= new int[row_a][col_a] ;
        matrix_Creation(a , row_a ,col_a) ;

        System.out.println("Enter row of second matrix") ;
        int row_b = sc.nextInt() ;
        System.out.println("Enter column of second matrix ");
        int col_b = sc.nextInt() ;
        int b[][] = new int[row_b][col_b] ;
        matrix_Creation(b,row_b,col_b) ;



        System.out.println("Your first input matrix be ") ;

        for(int i = 0; i<row_a; i++){
            for(int j = 0; j<col_a ; j++){
                System.out.print(a[i][j] + " ") ;
            }
            System.out.println() ;
        }
        System.out.println("Your second input matrix be ") ;

        for(int i = 0; i<row_b; i++){
            for(int j = 0; j<col_b ; j++){
                System.out.print(b[i][j] + " ") ;
            }
            System.out.println() ;
        }

        System.out.println("Multiplication of both matrix be ") ;

        int c[][] = new int[row_a][col_b] ;

        multiplication(a,b,row_a,col_a,row_b,col_b,c) ;










        }
}
