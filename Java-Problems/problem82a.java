
public class problem82a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_arr[] = { 20, 30, 67, 34, 40 };
		
		int max_value = num_arr[0];
		
		if (max_value <= num_arr[num_arr.length - 1]) {
			max_value = num_arr[num_arr.length - 1];
		}
		if (max_value <  (num_arr[num_arr.length /2])) {
			max_value = num_arr[num_arr.length /2] ;
		}

		System.out.println(max_value);
	}

}
