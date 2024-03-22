import java.util.*;
class ForEach{

	public static void main(String[] args) {
		
		int arr=[1,2,3,4,5,6,7];

		int indx=0;
		for (int j : indx ) {
			if (indx++ ==arr) {
				System.out.print(j)
				
			}
			
		}

		for(int i: arr)
		{
			System.out.print(i+" ")
		}

		List<String> arr1= Arrays.asList("abc","bcd","abcd");

		forEach((ele)->System.out.print(ele));



	}
}