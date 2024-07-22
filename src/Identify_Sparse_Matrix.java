public class Identify_Sparse_Matrix {
    static boolean check_Sparse_Matrix(int [][]arr){
        int non_zero_count = 0;
        int zero_count = 0;
        boolean sparse = true ;

        for(int i = 0; i<arr.length ; i++){

            for(int j = 0; j<arr[0].length ; j++){

                if(arr[i][j] == 0){
                    zero_count++ ;
                }
                else{
                    non_zero_count++ ;
                }
            }

        }
        if(zero_count < non_zero_count){
            return false ;

        }
        return true ;
    }




    public static void main(String[] args) {
        int [][]a = { {1,2,0} , {4,90,0} , {0,0,9} } ;

        System.out.println("Matrix be ") ;
        for(int i = 0; i<a.length ; i++){
            for(int j = 0; j<a[0].length  ; j++){
                System.out.print(a[i][j] + " ") ;
            }
            System.out.println() ;
        }

        if(check_Sparse_Matrix(a) == true) {
            System.out.println("Sparse Matrix ");
        }
        else{
            System.out.println("Not sparse matrix ") ;
        }

            }

    }




