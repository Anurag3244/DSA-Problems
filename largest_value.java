package Array;

public class largest_value {

    public static int largestNum(int number[]){
        int largest  = Integer.MIN_VALUE;
        int smallest  = Integer.MAX_VALUE;
        for (int i = 0; i<number.length; i++){
            if (largest < number[i]){
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 9, 12, 45, 32, 1 , 34};
        System.out.println(largestNum(numbers));
    }
}
