package simplilearn;

public class Student {
	int id;
	String name;
	
	// define parameterized constructor
	Student(int i, String n) {
		id = i;
		name = n;
	}
	
	void getDetails() {
		System.out.println(id + "\t\t" + name);
	}

}
