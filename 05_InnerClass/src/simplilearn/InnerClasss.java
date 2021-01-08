package simplilearn;

public class InnerClasss {

	public static void main(String[] args) {

		AnonymousClass instance = new AnonymousClass() {
			
			@Override
			public void display() {
				System.out.println("anonymous inner class!");
				
			}
		};
		
		instance.display();
	}
	}


