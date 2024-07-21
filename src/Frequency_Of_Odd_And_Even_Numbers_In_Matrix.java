public class Frequency_Of_Odd_And_Even_Numbers_In_Matrix {
    public static void main(String [] args){

        int [][] a  = { {1,2,3},{4,5,6},{7,8,9} } ;

        System.out.println("Matrix be ") ;
        int even = 0;
        int odd = 0 ;

        for (int[] ints : a) {

            for (int j = 0; j < a[0].length; j++) {

                System.out.print(ints[j] + " ");
                if (ints[j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println();
        }
        System.out.println("Even numbers in matrix be " + even);
        System.out.println("Odd numbers in matrix be " + odd) ;
    }
}
