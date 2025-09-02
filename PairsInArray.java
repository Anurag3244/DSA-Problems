package Array;

public class PairsInArray {
        public static void printpairs(int arr[]){
            for (int i = 0; i < arr.length; i++){  //method for finding all possible pairs
                int current = arr[i];
                for (int j = i+1; j< arr.length; j++){
                    System.out.print("("+current + "," + arr[j]+")");
                }

                System.out.println();

            }

        }

    public static void main(String[] args) {
        int arr[] = {2,4,5,7,9};

        printpairs(arr);
    }
}
