import java.util.LinkedList;

public class ReverseLinkedListPractice {

	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<>();
		lList.add(1);
		lList.add(2);
		lList.add(3);
		System.out.println(lList);
		
		LinkedList<Integer> lList2 = new LinkedList<>();
		lList.descendingIterator().forEachRemaining(lList2::add);
		
		System.out.println(lList2);

	}

}
