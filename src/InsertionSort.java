
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {7, 2, 6, 6, 9, 6, 6, 6, 2, 0};

		for(int i = 1; i < arr.length; i++) {
			
			int key = arr[i];
			int k = i - 1;
			while(k >= 0 && key < arr[k]) {
				
				int temp = arr[k];
				arr[k] = arr[k+1];
				arr[k+1] = temp;
				k--;
				//System.out.println(k);
				
				
			}
			
		}
		
		TestClass.arrPrint(arr);
	}

}
