public class Example {
    public static void BubbleSort(int arr[], int n ){
        int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					//swap
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
            if (swapped == false)
        break;
        } 
       
    }

        public static void printArray(int arr[], int size)
        {
            int i;
            for (i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            System.out.println();
            }
        }
    
    

    public static void main(String args[])
    {
        int arr[] = { 1,8,3,7,5,9 };
        int n = arr.length;
        BubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    
        
        
    }
}
   
 
    
    
        


    

