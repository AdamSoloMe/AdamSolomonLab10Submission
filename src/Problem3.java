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

public class Problem3 {


    public static void main(String args[]) {
        int counter = 0;
        long [][] tri = new long[110][110];
        for (int i = 0; i < 110; i++) {
            for (int j = 0; j < i; j++) {
                if (j == i || j == 0) {
                    tri[i][j] = 1;
                    if (tri[i][j] % 7 != 0){//this checks if each of the entries in the 2D are not divisble by 7 and creates a counter to keep track of these entries
                        counter++;
                    }
                    if (tri[i][j] > 0) {
                        System.out.print(tri[i][j] + " ");
                    }
                } else {
                    tri[i][j] = tri[i - 1][j - 1] + tri[i - 1][j];
                    if (tri[i][j] > 0) {
                        System.out.print(tri[i][j] + " ");
                        if (tri[i][j] % 7 != 0)
                            counter++;
                    }
                }
            }
            System.out.println("");
        }
        //the Answer for 109 rows of the pascal's triangle should be 2496 however I was having trouble with the biggest long numbers going negative so it prints 2761 instead
        //which is wrong
        System.out.println(counter);//this Prints out the total entries which are not divisible by 7 within the entire pascal's Triangle array 
    }
}




    


