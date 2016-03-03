package chapter2;

import java.util.LinkedList;

public class SumList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(9);
		list1.add(9);
		list1.add(9);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(9);
		list2.add(9);
		list2.add(9);

		System.out.println(list1);
		System.out.println(list2);
		System.out.println(addNumbers(list1, list2));
	}

	public static LinkedList<Integer> addNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> tempList = new LinkedList<>();
		LinkedList<Integer> listToReturn = new LinkedList<>();
		int oneInMemory = 0;
		for (int i = list1.size()-1; i >= 0; i--) {
			int currentValue = oneInMemory == 1 ?  (list1.get(i) + list2.get(i) + 1)%10 : (list1.get(i) + list2.get(i))%10;
			oneInMemory = 0;
			int addToNextNode = (list1.get(i) + list2.get(i) + 1)/10;
			
			if(addToNextNode != 0)
				oneInMemory = 1;
			tempList.add(currentValue);
		}
		
		if(oneInMemory != 0 )
			tempList.add(oneInMemory);
		

		for(int i = tempList.size() - 1; i >= 0  ; i--)
		{
			listToReturn.add(tempList.removeLast());
		}
		
		return listToReturn;
	}
}
