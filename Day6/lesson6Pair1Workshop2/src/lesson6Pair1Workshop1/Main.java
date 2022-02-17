package lesson6Pair1Workshop1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
  
    	//ArrayList icin Kullanilabilir metodlar : add(value), add(index,value), remove(), remove(index), size(), toString();
    	//Arraylist available methods 			 : add(value), add(index,value), remove(), remove(index), size(), toString();
    	MyArrayList2 arrayList = new MyArrayList2();
    	
    	arrayList.add(5);
    	System.out.println(arrayList);
    	arrayList.add(7);
    	arrayList.add(9);
    	arrayList.add(11);
    	System.out.println(arrayList);
    	arrayList.add(13);
    	System.out.println(arrayList);
    	arrayList.add(15);
    	System.out.println(arrayList);

    	arrayList.add(17);
    	arrayList.add(19);
    	System.out.println(arrayList);
    	arrayList.add(21);
    	arrayList.add(23);
    	System.out.println(arrayList);
    	arrayList.add(25);
    	arrayList.add(27);
    	System.out.println(arrayList);
    	arrayList.add(7, 10);
    	System.out.println(arrayList);
    	arrayList.add(7, 10);
    	System.out.println(arrayList);
    	arrayList.add(7, 10);
    	System.out.println(arrayList);
    	arrayList.add(7, 110);
    	System.out.println(arrayList);
    	arrayList.remove();
    	System.out.println(arrayList);
    	arrayList.remove(14);
    	System.out.println(arrayList);
    	
    }

}
