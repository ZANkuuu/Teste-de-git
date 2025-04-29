import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbleSort = {3, 6, 1, 8, 354, 234, 0, 14, 35, 0, 324, 2, 999, 7};

        System.out.println(Arrays.toString(bubbleSort));

        for(int i = 0; i < bubbleSort.length-1; i++){

            for(int j = 0; j < bubbleSort.length-1; j++){

                if(bubbleSort[j] > bubbleSort[j+1]){

                    int temp = bubbleSort[j+1];
                    bubbleSort[j+1] = bubbleSort[j];
                    bubbleSort[j] = temp;

                }
            }
        }

        System.out.println(Arrays.toString(bubbleSort));
    }
}
