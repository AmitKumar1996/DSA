package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamAPI {

	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<>();
		
	//	3, 2, 2, 3, 7, 3, 5
		
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(5);
		
	List<Integer> max = list.stream().sorted().collect(Collectors.toList());
	
	System.out.println(max.get(5));
		
		// TODO Auto-generated method stub

	}

}
