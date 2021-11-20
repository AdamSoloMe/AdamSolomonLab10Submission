
public class Problem3 {


    public static void main(String args[]) {
        int counter = 0;
        long [][] tri = new long[110][110];
        for (int i = 0; i < 110; i++) {
            for (int j = 0; j < i; j++) {
                if (j == i || j == 0) {
                    tri[i][j] = 1;
                    if (tri[i][j] % 7 != 0){
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
        System.out.println(counter);
    }
}




    


