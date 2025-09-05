package Array;

public class max_Sum_subArray {

    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;

    public void MaxSumSubArray(int numbers[]) {

    for(int i = 0; i<numbers.length; i++){
        System.out.println("Possible sum of sub arrays from index " + numbers[i] + " are : ");
        for (int j = i; j< numbers.length;j++){
            currSum = 0;
            for (int k = i; k <= j; k++){
                currSum += numbers[k];
            }
            System.out.println(currSum);
            if (maxSum < currSum){
                maxSum = currSum;
            }
        }

    }

        System.out.println("Maximum sum in all sub array is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-3,-1,6,8,-6};
        max_Sum_subArray sb = new max_Sum_subArray();
        sb.MaxSumSubArray(numbers);
    }
}
