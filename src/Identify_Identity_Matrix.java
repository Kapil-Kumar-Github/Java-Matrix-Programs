import java.util.Scanner;
public class Identify_Identity_Matrix {
   static  boolean check_identity_matrix(int arr[][] , int size){
        boolean m = true  ;
        for (int i = 0; i < size; i++) {
            int element = arr[0][0] ;
            for (int j = 0; j < size; j++) {

                if (i == j) {

                    if(arr[i][j] !=element){
                        m = false ;

                    }

                }
                else{
                    if(arr[i][j] !=0){
                        m =  false ;

                    }
                }
            }
        }
        return m ;

    }


    public static void main(String [] args){

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of your identity matrix  ");
        int size = sc.nextInt() ;
        int a[][] = new int[size][size] ;

        for(int i = 0; i<size ; i++){

            for(int j = 0; j<size ; j++){
                System.out.print("Enter the element of matrix of " + i+ " row "+ j + " column ") ;
                a[i][j] = sc.nextInt() ;


            }
        }

        System.out.println("Your input matrix be ") ;

        for(int i = 0; i<size ; i++){
            for(int j = 0; j<size ; j++){
                System.out.print(a[i][j] + " ") ;
            }
            System.out.println() ;
        }
        if(check_identity_matrix(a , size)== true ){
            System.out.println("Identity matrix");
        }
        else{
            System.out.println("Not identity matrix ") ;
        }



    }
}
