public class sortingAlgorithms {
    /**
     * basic searching algorithm
     * @param arr the arrat to be searched
     * @param N used to itterate threw the array
     * @param x is the key to search for
     * @return the index of the key 
     */
    public static int linearSearch(int arr[], int N, int x){
        for(int i = 0; i < N; i++){
            if(arr[i] == x)
                return i;
        }    
        return -1;
    }
    void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n - 1; j++)
                if(arr[j] > arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void main(String[] args) {
        //test for linear search 
        /*
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        int result = linearSearch(arr, arr.length, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);
        */
        // bubble sort test
        sortingAlgorithms ob = new sortingAlgorithms();
        int a[] = { 64, 34, 25, 12 };
      
        ob.bubbleSort(a);
      
      	int n = a.length;
      
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
