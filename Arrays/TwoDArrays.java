package Arrays;

public class TwoDArrays {
    public static void main(String args[]) {

        int[][] A = new int[2][5];
        int[][] B = { { 1, 2, 3, 4, 5 }, { 3, 6, 1, 4, 5 } };
        
    //    for(int i=0;i<B.length;i++){

    //        for (int j = 0; j < B[0].length; j++) {
    //            System.out.println(B[i][j]);
    //         }
    //     }
            for(int x[]:B)
            {
            for(int y:x)
            {
                System.out.println(y);
            }
        }

    }
}
