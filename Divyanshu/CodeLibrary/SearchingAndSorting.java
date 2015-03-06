package CodeLibrary;

public class SearchingAndSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] selectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
    public static int[] doInsertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
    public static int search(int[] input, int key){
    	for(int i =0; i<input.length;i++){
    		if(input[i]==key)
    			return i;
    	}
    	return -1;
    }
}
