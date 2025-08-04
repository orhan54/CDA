package training.afpa.metier.exosCours;

import training.afpa.utility.InputAndDisplay;

import java.util.Arrays;

/**
 * @author jboebion
 */
public class Exo4_4_FindTo2dArray {
	
	public static void start() {
		
		int [][] arr = {

				{ 3, 2, 1, 7 },
				{ 9, 110, 5, 4 },
				{ 6, 0, 13, 17 },
				{ 7, 21, 14, 15 } 
		};
		
		int iMax, jMax;
		
		iMax = 0;
		jMax = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for (int j=0; j < arr[i].length; j++) {
				if (arr[i][j] > arr[iMax][jMax]) {
					iMax = i;
					jMax = j;
				}
			}
		}
		
		InputAndDisplay.message(Arrays.deepToString(arr),0);
		InputAndDisplay.message("Le plus grand élément est " + arr[iMax][jMax],0);
		InputAndDisplay.message("il se trouve aux indices " + iMax + "-" + jMax,0);
	}

}
