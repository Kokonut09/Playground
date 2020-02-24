
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {7, 10, 6, 8, 4, 0, 10, 1, 5, 1};
		
		for(int i = 0; i< arr.length; i++ ) {
			for(int k = 0; k< arr.length-1;k++) {
				int temp;
				
				if(arr[k]>arr[k+1]) {
					
					temp = k;
					arr[k] = arr[k+1];
					arr[k+1] = k;
					
				}
				
			}
			
		}
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]+", ");
			
		}
				
		
		
	}

}
