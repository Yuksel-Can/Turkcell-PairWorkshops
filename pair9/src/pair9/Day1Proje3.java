package pair9;

public class Day1Proje3 {
	
	public static void main(String[] args) {      
			
		int sum = 0;
		int sum2 = 0;
		boolean flag = false;
		
		for(int i = 2; flag == false; i++){
			
			for (int j = 1; j < i; j++) {
				
				if (i % j == 0) {	
					sum += j;			
				}
			}
			if(sum == 1 || sum == i) {
				continue;				
			}
			for(int x = 1; x< sum; x++ ) {	
				if(sum % x == 0) {
					sum2 += x;
				}
				
			}
			if(sum2 == i) {
				flag = true;
				System.out.println(i + " ve " + sum);
			}
			
			sum2=0;
			sum = 0;
		}
	}

}
