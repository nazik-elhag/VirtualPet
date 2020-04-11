import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.print("Enter your pet name: ");
		String pet_name = input.nextLine( );
		VirtualPet pet=new VirtualPet(pet_name);
		System.out.print("pet name entered is:"+pet.getName());
		input.close();
	}

}
