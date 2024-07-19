import java.util.Scanner;
public class Subtraction_Of_Two_Matrix {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the row of matrix ") ;
        int row = sc.nextInt() ;
        System.out.println("Enter the column of your matrix ") ;
        int col = sc.nextInt() ;
        int a [][] = new int[row][col] ;
        int b[][] = new int[row][col] ;
        for(int i = 0; i<row ; i++){

            for(int j = 0; j<col ; j++){
                System.out.print("Enter element of array a of " + i + " row and " + j+ " column ") ;
                a[i][j] = sc.nextInt() ;

            }
            System.out.println();
        }
        System.out.println("Matrix a be ") ;
        for(int i = 0; i<row ; i++){

            for(int j = 0; j<col; j++){
                System.out.print(a[i][j] + " ") ;
            }
            System.out.println();
        }

        for(int i = 0; i<row ; i++){

            for(int j = 0; j<col ; j++){
                System.out.print("Enter the element of b array having row "+ i + " and column  "+ j + " ");
                b[i][j] = sc.nextInt() ;
            }
        }

        System.out.println("Matrix b be ") ;
        for(int i = 0; i<row ; i++){

            for(int j = 0; j<col ; j++){

                System.out.print(b[i][j] + " ") ;
            }
            System.out.println() ;
        }

        System.out.println("Subtraction of matrix a and b be ");


        for(int i = 0 ; i<row ; i++){

            for(int j = 0; j<col ; j++){
                System.out.print(a[i][j] -b[i][j]);

            }
            System.out.println() ;
        }

    }
}
