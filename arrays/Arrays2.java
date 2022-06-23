package arrays;

public class Arrays2 {

	
	public static void main(String[] args) {
		
		String[] array = new String[5];
		array[0] = "rama";
		array[2] = "syama";
		array[3] = "dama";
		array[4] = "hari";
		array[1] = "Narayana";
		
		for(int i = 0; i< array.length ; i++){
			System.out.println(i + ". "+ array[i]);
		}
	}

}
