package practice;

public class ArrayReview {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int result = 0;
        for(int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }
}
