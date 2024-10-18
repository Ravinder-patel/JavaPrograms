package CollectionsPrograms;

import java.util.*;

import org.testng.annotations.Test;

public class CollectionPrograms {
	/* 1. WAP to find the length of an Array or size of an array */

	@Test
	public void lengthofArray() {

		List<Integer> arrayList = new ArrayList();

		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);

		arrayList.addAll(asList);
		arrayList.addAll(Arrays.asList(2, 3, 4, 5));

		System.out.println(arrayList);
		System.out.println("Size is : " + arrayList.size());

	}

	/* 2. WAP to print the elements present in an Array using for loop */

	@Test
	public void elementsofArrayListUsingForLoop() {

		List<Integer> arrayList = new ArrayList();

		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);

		arrayList.addAll(asList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));

		}
		System.out.println("Size is : " + arrayList.size());

	}
	/* 3. WAP to print the elements present in an Array using for each loop */

	@Test
	public void elementsofArrayListUsingForEach() {

		List<Integer> arrayList = new ArrayList();

		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);

		arrayList.addAll(asList);

		for (Integer integer : asList) {
			System.out.println(integer);
		}
		System.out.println("Size is : " + arrayList.size());

	}

	@Test
	public void elementsofArrayListUsingWhileLoop() {

		List<Integer> arrayList = new ArrayList();

		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);

		arrayList.addAll(asList);

		Iterator<Integer> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

	/* 4. WAP to find the average of the elements in a given Array */
	@Test
	public void averageofArrayList() {

		List<Integer> arrayList = new ArrayList();

		List<Integer> asList = Arrays.asList(10, 2, 30, 40, 50);

		arrayList.addAll(asList);
		int size = arrayList.size();

		int addElements = 0;
		for (Integer integer : asList) {

			addElements += integer;
		}

		int average = addElements / size;
		System.out.println("Average of elemnts is: " + average);

	}

	/* 5. WAP to copy one Array elements to another Array in the reverse order */
	@Test
	public void addElementsIntoAnotherArrayList() {

		List<Integer> arrayList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		List<Integer> b = new ArrayList();

		for (int i = arrayList.size() - 1; i >= 0; i--) {

			b.add(arrayList.get(i));
		}
		System.out.println("Before inserting into another arrayList ");
		System.out.println(arrayList);
		System.out.println("After revesing into another arraylist");
		System.out.println(b);

	}

	/* 6. WAP to merge two Array elements */

	@Test
	public void mergeTwoArrayLists() {

		List<Integer> aList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		List<Integer> bList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("Elements  in first arrayList ");
		System.out.println(aList);
		System.out.println("Elements  in second arrayList");
		System.out.println(bList);

		aList.addAll(bList);
		System.out.println("After merging two arrayList");
		System.out.println(aList);

	}

	/*
	 * 7. WAP to find whether the given element is present in an Array or not
	 * (Linear Search)
	 */
	@Test
	public void searchElementInArrayList() {

		List<Integer> aList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("Enter an integer Elements");
		int element = new Scanner(System.in).nextInt();
		if (aList.contains(element)) {
			System.out.println("given element '" + element + "' is present in ArrayList");
		} else {
			System.out.println("given element '" + element + "' is not present in ArrayList");

		}

	}

	/* 8. WAP to perform the left Shift in an Array */
	@Test
	public void leftShiftOfArrayList() {

		List<Integer> aList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));

		System.out.println("Before shifting element to last");
		System.out.println(aList);

		Integer first = aList.getFirst();
		aList.removeFirst();
		aList.addLast(first);

		System.out.println("After shifting element to last");
		System.out.println(aList);

	}

	/*
	 * 9. WAP to perform the left shift in an Array n number of times (n is user
	 * specified value)
	 */
	@Test
	public void numberOfleftShiftsOfArrayList() {

		List<Integer> aList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("Before left shifting the elements");
		System.out.println(aList);

		System.out.println("Enter left shifts");
		int shifts = new Scanner(System.in).nextInt();
		for (int i = 0; i < shifts; i++) {
			Integer first = aList.getFirst();
			aList.removeFirst();
			aList.addLast(first);
		}
		System.out.println("After left shifting the elements");
		System.out.println(aList);

	}

	/* 10. WAP to perform the Right Shift in an Array */
	@Test
	public void rightShiftOfArrayList() {

		List<Integer> aList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("Before right shifting the element");
		System.out.println(aList);

		Integer last = aList.getLast();
		aList.removeFirst();
		aList.addFirst(last);

		System.out.println("After right shifting the element");
		System.out.println(aList);

	}

	/*
	 * 11. WAP to perform the Right shift in an Array n number of times (n is user
	 * specified value)
	 */
	@Test
	public void numberOfRightShiftsOfArrayList() {
		List<Integer> aList = new ArrayList(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println("Before right shifting the elements");
		System.out.println(aList);

		System.out.println("Enter right shifts");
		int shifts = new Scanner(System.in).nextInt();
		for (int i = 0; i < shifts; i++) {
			Integer last = aList.getLast();
			aList.removeLast();
			aList.addLast(last);
		}
		System.out.println("After right shifting the elements");
		System.out.println(aList);

	}

	// *12. WAP to remove the duplicate elements from a given Array*/
	@Test
	public void removeDuplicateFromArrayList() {
		List<Integer> aList = new ArrayList(Arrays.asList(10, 10, 30, 30, 10));
		System.out.println("Before removing duplicates");
		System.out.println(aList);

		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(aList); // removes duplicates while added to HashSet

		aList.clear(); // clear the arrayList or removeAll
		System.out.println(aList);

		aList.addAll(set1);
		System.out.println("After removing duplicates");
		System.out.println(aList);

	}

	/* 13. WAP to print the duplicate elements present in a given Array */
	@Test
	public void printDuplicateInArrayList() {
		List<Integer> aList = new ArrayList(Arrays.asList(5, 10, 10, 30, 30, 10, 10, 5));
		System.out.println("Duplicates");
		System.out.println(aList);

		Set<Integer> set1 = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < aList.size(); i++) {
			if (set1.add(aList.get(i))) {

			} else {
				count++;
			}
			if (count > 1) {

				System.out.println(aList.get(i) + ": Is duplicate");
			}
		}
		System.out.println(set1);

	}

	/*
	 * 14. WAP to find the frequency or occurrence of an element in a given Array
	 * (How many times an element is repeated in a given array)
	 */

	@Test
	public void frequencyOfElementInArrayList() {

		String s = "india";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			}
		}
		System.out.println(map);

		for (Map.Entry<Character, Integer> pair : map.entrySet()) {
			System.out.println(pair);

		}
	}

	@Test
	public void frequencyOfElementInArrayList2() {
		List<Integer> aList = new ArrayList(Arrays.asList(5, 10, 10, 30, 30, 10, 5));
		System.out.println("Duplicates");
		System.out.println(aList);

		Set<Integer> set1 = new HashSet<Integer>();

		set1.addAll(aList);

		for (Integer integer : set1) {
			int frequency = Collections.frequency(aList, integer);
			System.out.println(integer + ": is present :" + frequency);
		}

	}

	/* 15. WAP to print the maximum frequency element in a given Array */
	@Test
	public void maximumfrequencyOfElementInArrayList() {
		List<Integer> aList = new ArrayList(Arrays.asList(5, 10, 10, 30, 30, 10, 5));

	}

}
