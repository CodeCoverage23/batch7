package com.pradeep.collection;

import java.util.ArrayList;
public class ConcurrentModification {

	public static void main(String[] args) {

		ArrayList<String> list= new ArrayList<>();
		list.add("ganesh");
		list.add("swapnil");
		list.add("akshay");
		list.add("sarthak");
//		for(String elem:list) {
//			if(elem.equals("swapnil")) {
//				
//				list.remove(elem);
//			}
//			System.out.println(elem);
//		}
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).equals("swapnil")){
				
				list.remove(list.get(i));
			}
			
			
		}
//		System.out.println(list);
//		
//		
////		
//		Collections.sort(list);
//		System.out.println(list);
		
	}

}
