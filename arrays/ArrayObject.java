package arrays;

class Student {
	int rollNo;
	String name;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
}

public class ArrayObject {

	public static void main(String[] args) {
		Student[] array = new Student[3];
		array[0] = new Student(1, "Rama");
		array[1] = new Student(2, "shama");
		array[2] = new Student(3, "Hari");
		try {
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i].rollNo + " " + array[i].name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
