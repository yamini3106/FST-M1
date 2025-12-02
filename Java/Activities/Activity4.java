package examples;

public class Activity4 {
	public static void main(String[] args)
	{
		int[] array={ 9, 3, 7, 1, 6, 2, 8, 5, 4 };
		  System.out.println("Array BEFORE sorting:");
		  printArray(array);
		  insertionSort(array);
		  System.out.println("Array AFTER sorting:");
		  printArray(array);
		 
		 
	}
	public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
        	 int X = array[i];
        	 int j = i - 1;
        	 while (j >= 0 && array[j] > X) {
                 array[j + 1] = array[j];
                 j--;
             }
        	 array[j + 1] = X;
        }
}
	public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
}

