package Array;

public class binarySearch {

    public static int binarySearch(int[] numbers, int key) {
            int start= 0, end = numbers.length - 1;
            while (start <= end){
                int mid  = (start + end)/2;
                if (numbers[mid] == key) {
                    return mid;
                } else if (numbers[mid] < key) {
                    start = mid +1;
                }
                else {
                end = mid - 1;
                }
            }
                return -1;
            }

    public static void main(String[] args) {
        int numbers[] = {2,5,7,9,12,14,16,20};
        int key = 32;
        System.out.println("the index of the key is : " + binarySearch(numbers,key));

    }
    }




