
public class Run_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie batman=new Movie("Batman",Movie.NEW_RELEASE);
		Rental rental=new Rental(batman,3);
		Customer customer=new Customer("John");
		customer.addRental(rental);
		System.out.println(customer.statement());
		
	}

}
