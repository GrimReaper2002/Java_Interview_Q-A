import java.util.*;

class ArrayListExample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList arr = new ArrayList();
		//Appending new elements at end of list
		for(int i =0;i<n;i++){
			arr.add(sc.nextInt());
		}
		
		//displaying ArrayList
		System.out.println(arr);
		
		//removing element at index 3
		arr.remove(3);
		
		//sorting ArrayList
		Collections.sort(arr);
		
		//size of array
		n = arr.size();
		//printing elements one by one
		for(int i=0;i<n;i++){
			System.out.print(arr.get(i)+" ");
		}
		
	}
}