package extra;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.familyBusiness();
	

	}

	@Override
	public void familyBusiness() {
		System.out.println("Child will better the business");
		
	}
	


}
