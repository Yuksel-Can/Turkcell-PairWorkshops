package lesson6Pair1Workshop1;

public class MyArrayList {
	
	//first try
	
	public static int[] add(int n, int arr[], int x){
        
        int newArray[] = new int[n + 1];
        for (int i= 0; i < n; i++) {
        	newArray[i] = arr[i];
        }
        newArray[n] = x;
        return newArray;
    }
	
	//[1,2,3,4]		boyut = 4
	//[2,3,4]		boyut = 3
	public static int[] remove(int n, int arr[], int index) {
		int newArray[] = new int[n - 1];
        int i= 0;
        for(int j= 0 ; j < arr.length ; j++) {	//0 1 2 3
        	if(j != index) {
        		newArray[i] = arr[j];
        		i++;
        	}else {
        		continue;
        	}
        }
        return newArray;
	}
	
	public static int size(int arr[]) {
		int count = 0;
		for(int i = 0 ; i < arr.length; i ++) {
			count = i;
		}
		return arr.length;
	}

}
