
public class insertionSort {

	 public static void onlineinsertionsort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	        for (int g = 0; g<n;g++) {
				 System.out.println(arr[g]);
			 }
	    }
	 
	 public static void lectinsertionsort(int arr[])
	 {
		 int n = arr.length;
		 int temp;
		 
		 for(int i = 1; i<n;i++) {
			 for(int j = i;j>0;j--) {
				 if(arr[j]< arr[j-1]) {
					 temp = arr[j];
				 	 arr[j] = arr[j-1];
				 	 arr[j-1] = temp;
				 }
				 else {
					 break;
				 }
			 }
		 }
		 
		 for (int g = 0; g<n;g++) {
			 System.out.println(arr[g]);
		 }
	 }
	
	
	public static void main(String[] args) {
		lectinsertionsort(dumdum);
		onlineinsertionsort(dumdum);
	}

}
