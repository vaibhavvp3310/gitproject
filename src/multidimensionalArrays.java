import java.util.Arrays;

public class multidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{2,5,1},{10,15,7}, {4,3,6}};
		int temp = array[0][0];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(array[i][j] < temp) {
					temp = array[i][j];
					
			}
		}
	}
		System.out.println(temp);
		
		int[] index = findIndex(array,temp);
		System.out.println("Index of " + temp + ": [" + index[0] + ", " + index[1] + "]");
		int r = index[1];
		for(int k=0; k<3; k++) {
			if(array[k][r]>temp) {
				temp = array[k][r];
			}
		}
		System.out.println(temp);
	}
	
	public static int[] findIndex(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[]{i, j}; // Return the index as a 2-element array
                }
            }
        }
        return null; // Return null if the target is not found
    }
}

