

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
    /**
     * a simple sorting algoritem using a sawp 
     * @param arr the array to be sorted
     */
    // Time Complexity:  O(N^2) 
    // Space Complexity:  O(1) 
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
    /**
     * a simple sorting algoritem using insertion
     * @param arr the array to be sorted
     */
    // Time Complexity: O(N^2) 
    // Auxiliary Space: O(1)
    void insertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){//itterate threw the array
            int k = arr[i];
            int j = i - 1;

            // move the eleaments of arr[i-1] that are 
            // greater than the key to a position ahead
            // of their current position
            while (j >= 0 && arr[j] > k){
                arr[j + 1] = arr[j];
                j = j - 1; 
            }
            arr[j + 1] = k;
        }
    }
    /**
     * a simple sorting algoritem that finds the 
     * smallest eleament in an array and swaps it with the first element
     * @param arr the array to be sorted
     */
    // Time Complexity:  O(n^2)
    // Auxiliary Space: O(1)
    void slectionSort(int arr[]){
        int n = arr.length;
        //move the boundary of the unsorted array by 1
        for (int i = 0; i < n - 1; i++){
            //find the min in the unsorted array
            int min = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j]< arr[min])
                    min = j;
            }
            //swap the found min eleament with the first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
    /**
     *  this is a simple algroitem that 
     * merges two arrays to sort them
     * @param arr the array to sort
     * @param l left array index
     * @param m middle arrat index  
     * @param r right array index
     */
    // Time Complexity: O(n log n)
    // Auxiliary Space: O(n)
    void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i = 0; i < n1; ++i )
            L[i] = arr[l + i];

        for(int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        // merge the temp arrays
        // initalise the indexes of the first and second subarrays
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }
    /**
     * a simple program that sorts the two 
     * merged subarrays
     * @param arr the array to be sorted 
     * @param l the left array to merge
     * @param r the right array to merge
     */
    // Time Complexity: O(n log n)
    // Auxiliary Space: O(n)
    void sort(int arr[], int l, int r){
        if(l < r){
            int m = (l + r) / 2;
            
            // sort first and second halves of the arrys
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // merge the sorted halves 
            merge(arr, l, m, r);
        }
    }
    /**
     * a program that moves the array to be pivioted arround
     * @param arr array to be partitioned
     * @param low the lower number
     * @param high the higher number in the array
     * @return the nex index in the array
     */
    int partition(int arr[], int low, int high){
        int piviot = arr[high];
        int i = (low - 1);
        
        for(int j = low; j < high; j++){
            //checking if current element is smaller that the pivot
            if(arr[j] <= piviot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    /**
     * this is the sorting part of quicksort 
     * @param arr array to be sorted
     * @param l starting index
     * @param h ending index
     */
    void sort1(int arr[], int l, int h){
        if(l < h){
            int pi = partition(arr, l, h);

            // recursively sort elements before
            // partioion and after partioion
            sort1(arr, l, pi - 1);
            sort1(arr, pi + 1, h);

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
        
        sortingAlgorithms ob = new sortingAlgorithms();
        int a[] = { 64, 34, 25, 12 };
        int b[] = { 12, 11, 13, 5, 6 };
        int c[] = {64, 25, 12, 22, 11 };
        int d[] = {12, 11, 13, 5, 6, 7 };
        int e[] = {10, 7, 8, 9, 1, 5};

        ob.bubbleSort(a);
        ob.insertionSort(b);
        ob.slectionSort(c);
        ob.sort(d, 0, d.length - 1);
        int n4 = d.length;
        ob.sort1(e, 0, n4 - 1);

        // bubble sort test
      	int n = a.length;
      
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();

        // insertion sort test
        int n1 = b.length;
      
        for (int i = 0; i < n1; ++i)
            System.out.print(b[i] + " ");
        System.out.println();

        // selection sort test
        int n2 = c.length;
      
        for (int i = 0; i < n2; ++i)
            System.out.print(c[i] + " ");
        System.out.println();
        
        // selection sort test
        int n3 = d.length;
      
        for (int i = 0; i < n3; ++i)
            System.out.print(d[i] + " ");
        System.out.println();
        
        // quick sort test
        for (int i = 0; i < n4; ++i)
            System.out.print(d[i] + " ");
        System.out.println();
    }
}
