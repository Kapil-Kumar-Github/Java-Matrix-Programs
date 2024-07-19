import java.util.Scanner;
public class Creation_Of_Matrix {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in) ;
        System.out.println("Enter the row of your matrix ");
        int row = sc.nextInt();
        System.out.println("Enter column of your matrix ") ;
        int column = sc.nextInt();

        int a[][] = new int[row][column] ;
        //Scanner sc = new Scanner(System.in) ;

        for(int i = 0 ; i<row ; i++){

            for(int j = 0; j< column ; j++){
                System.out.println("Please fill matrix element of " + i + " row and " + j + " column");
                int element = sc.nextInt();
                a[i][j] = element ;
            }
        }

        System.out.println("Your matrix be ") ;

        for(int i = 0; i<row ; i++){

            for(int j = 0; j<column ; j++){

                System.out.print(a[i][j]+ " ") ;
            }
            System.out.println() ;
        }

    }
}
