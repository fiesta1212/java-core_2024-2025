package lr2;

public class Example2 {
    public static void main(String[] args) {
       int[][] nums = new int[5][6];
       int k = 0;
       for (int i =0; i < 5; i++){
           if (i % 2 == 0){ // Слева направо
               for (int j = 0; j < 6; j++){
                   nums[i][j] = k;
                   k++;
               }
           }
           else { // Справа налево
               for (int j = 6-1; j >= 0; j--){
                   nums[i][j] = k;
                   k++;
               }
           }
       }
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 6; j++) {
               System.out.println(nums[i][j] + " ");
           }
           System.out.println();
       }
    }
}
