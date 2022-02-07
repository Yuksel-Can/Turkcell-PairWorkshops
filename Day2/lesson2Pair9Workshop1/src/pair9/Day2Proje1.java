package pair9;

public class Day2Proje1 {
	
	public static void main(String[] args) {
		
        int c=0;
        for(int i=2;i<=1000;i++) {
            for(int j=2;j<=i;j++) {
                if(i%j==0) {
                    c+=1;
                }
            }
            if(c<=1) {
                System.out.println(i);
            }
            c=0;
        }
    }
}
