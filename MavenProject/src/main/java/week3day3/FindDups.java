package week3day3;

import java.util.Arrays;

public class FindDups {

	
	public static void main(String[] args) {
		
		int duparr[]=PrintDuplicates.num_list;
		
		Arrays.sort(duparr);
		for (int i = 0; i < duparr.length - 1; i++) {
            if (duparr[i] == duparr[i + 1]) {
                // To avoid printing the same duplicate multiple times
                if (i == 0 || duparr[i] != duparr[i - 1]) {
                    System.out.print(duparr[i] + " ");

	}

}

		}
	}
	
}
