package lesson2Pair9Workshop2;

public class Day2Proje2 {

	public static void main(String[] args) {     
		
			int toplam = 0;
			int superSayi = 0;  
			
			for(int i = 2; superSayi<5; i++){   
				
				for(int j=1; j<i; j++){   
					
					if(i%j==0){                 
						toplam +=j;             
					}                 
				}             
				if(toplam==i)      
				{         
					superSayi++;               
					System.out.println(i);           
				}  
				toplam=0;                  
			}                   
	}

}
