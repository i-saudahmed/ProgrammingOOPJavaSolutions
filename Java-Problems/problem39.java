import java.util.Iterator;

public class problem39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (k != i && k != j && i != j) {
						System.out.println(i + "" + j + "" + k + " ");
						count++;
					}

				}
			}
		}
		System.out.printf("\ntotal count is %d", count);
	}

}

//int amount = 0 ;
//for(int i=1 ; i<=4 ; i++ ) {
//	for(int j = 1 ; j<=4 ; j++) {
//		for(int k =1 ; k<=4;k++) {
//			if(i!= k && k!=j && i!=j) {
//				amount++;
//				System.out.println(i + " " + j + " "+ k);
//			}
//		}
//	}
//}
//System.out.println(amount);