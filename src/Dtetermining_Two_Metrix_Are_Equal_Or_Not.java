public class Dtetermining_Two_Metrix_Are_Equal_Or_Not {

    static   boolean check_Equal_Metrix(int arr1[][] , int arr2[][]){
        boolean m = true  ;
        if( arr1.length != arr2.length || arr1[0].length != arr2[0].length){
            System.out.println("Unequal metrix ") ;
            m =false  ;
        }
        else{

            for(int i = 0; i<arr1.length ; i++){

                for(int j=0; j<arr2[0].length;j++){
                    if(arr1[i][j] == arr2[i][j]){
                        m= true ;
                    }
                    else{
                        m= false ;
                        return m ;


                    }

                }
            }
        }

        return m ;

    }

    public static void main(String [] args){

        int a[][] = { {1,2,3},{4,5,6},{7,8,9} } ;

        int b [][] = { {1,2,3},{4,5,68},{7,8,9} } ;

        //System.out.println(a[0].length) ;

       if(check_Equal_Metrix(a,b) == false) {
           System.out.println("Unequal matrix ");
       }
       else{
           System.out.println("Equal matrix ");
       }


    }
}
