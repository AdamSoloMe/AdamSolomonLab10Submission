//this is my solution for problem 3
/**
 *
 * Solve problem 03:
 * We can easily verify that none of the entries in the first seven rows of Pascal's triangle are divisible by 7:

 	 	 	 	 	 	 1
 	 	 	 	 	 1	 	 1
 	 	 	 	 1	 	 2	 	 1
 	 	 	 1	 	 3	 	 3	 	 1
 	 	 1	 	 4	 	 6	 	 4	 	 1
 	 1	 	 5	 	10	 	10	 	 5	 	 1
1	 	 6	 	15	 	20	 	15	 	 6	 	 1
However, if we check the first one hundred rows, we will find that only 2361 of the 5050 entries are not divisible by 7.

Find the number of entries which are not divisible by 7 in the first one billion (109) rows of Pascal's triangle.
* 
 */



import java.math.BigInteger;

public class PascalTriangle {

    public static BigInteger calculateFactorial(int n) {
        BigInteger PascalNumber = BigInteger.ONE;
        for (int i=1; n>1;n--){ 
         PascalNumber= PascalNumber.multiply(BigInteger.valueOf(n));
    }

    return  PascalNumber;
}


    public static BigInteger PascalTriangleMethod(int n,int r) {
        return calculateFactorial(n).divide(calculateFactorial(n-r).multiply(calculateFactorial(r)));



    public static void main(String args[]) {
        System.out.println();
        int n,i,j;

        n=109;
        int count = 0;
        for(i = 0; i <= n; i++) {
            for(j = 0; j <= n-i; j++){
                System.out.print(" ");
            }
            for( j = 0; j <= i; j++){


                System.out.print(" "+PascalTriangleMethod(i, j));
                if(!(PascalTriangleMethod(i, j).mod(BigInteger.valueOf(7))).equals(BigInteger.ZERO)){
                    count++;
                }


            }
            System.out.println();



        }
      //the Answer for 109 rows of the pascal's triangle should be 2496 however I keep getting 2526 so it prints that number instead
        //which is wrong
       
        System.out.println("the number of entries which are not divisivle by 7 is "+count+"\n");


    }
}
       
    




    


