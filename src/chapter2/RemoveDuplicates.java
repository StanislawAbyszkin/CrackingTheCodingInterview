package chapter2;

import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(2);
		
		System.out.println("Original list " + list);	
		System.out.println(removeDuplicatesWithoutBuffer(list));
	}
	
	public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list){
		int[] buffer = new int[256];
		for(int i =0; i < list.size(); i++)
		{
			if(buffer[ list.get(i)] != 0)
				list.remove(i);
			else
				buffer[ list.get(i)]++;
		}
		
		return list;
	}
	
	public static LinkedList<Integer> removeDuplicatesWithoutBuffer(LinkedList<Integer> list)
	{
		for(int i = 0; i < list.size(); i++)
		{
			for(int j = i+1; j < list.size(); j++)
			{
				if(list.get(i) == list.get(j)) list.remove(j);
			}
		}
		
		return list;
	}

}
