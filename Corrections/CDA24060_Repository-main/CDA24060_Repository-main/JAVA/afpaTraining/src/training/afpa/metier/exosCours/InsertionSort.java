package training.afpa.metier.exosCours;

/**
 * @author jboebion
 */
public class InsertionSort {
	
	public static void start() {
		
		int index;
		int[] arrayInt = {5, 2, 4, 1, 8, 4};
		 
		System.out.println(java.util.Arrays.toString(arrayInt));
		
		for(int i=1; i<arrayInt.length; i++) {
			index = arrayInt[i];
			int j = i-1;
			
			while (j >= 0 && arrayInt[j] > index) {
				arrayInt[j+1] = arrayInt[j];
				j--;
			}
			
			arrayInt[j+1] = index;
		}
		
		System.out.println(java.util.Arrays.toString(arrayInt));
	}
}
