
public class MyArrayList {

	int arr[] = null;
	int length = 10;		//default boyut
	int place = 0;		//current place
	
	public MyArrayList() {
		this.arr = new int[length];
	}
	
	public MyArrayList(int length) {
		this.length = length;
		this.arr = new int[length];
	}
	
	public void add(int data) {
		if(place == length) {
			System.out.println("Kapasite asimi oldu, kapasite = " + length);
			this.length = ((length*3)/2 + 1);
			System.out.println("Yeni kapasite = " + length);
			int[] newArr = new int[length];
			for(int i=0; i<place;i++) {
				newArr[i] = arr[i];
			}
			this.arr=newArr;
			
		}
		arr[place] = data;
		place++;
		System.out.println(data +" degeri Listeye eklendi");
	}
	
	public void add(int index, int data) {
		if(index > (place-1)) {
			System.out.println("deger bellek taþmasý yaþandý, Araya ekleme basarisiz");
		}
		for(int i=place;i>index;i--) {
			arr[i] = arr[i-1];
		}
		arr[index] = data;
		place++;

		System.out.println(data +" degeri Listede " + (index+1) + ". siraya eklendi");
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb  = new StringBuilder();
		sb.append("[");
		for(int i = 0; i< place; i++) {
			sb.append(arr[i]).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();

	}
}
