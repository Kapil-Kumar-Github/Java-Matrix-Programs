public class Upper_Triangular_Matrix {

    public static void main(String [] args){
        int a[][] = { {1,2,3}, {4,5,6}, {7,8,9} };
        System.out.println("Matrix be ");

        for(int i = 0; i<a.length ; i++){

            for(int j = 0; j<a[0].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println() ;
        }

        System.out.println("Upper triangular matrix be ");

        for(int i= a.length-1 ; i>=0; i--){

            for(int j = i-1; j>=0 ; j--){
                //System.out.println(a[i][j] + " ");
                a[i][j] = 0;
            }


        }

        for(int i= 0; i<a.length ; i++){

            for(int j = 0 ; j<a[0].length ; j++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println() ;
        }
    }
}
