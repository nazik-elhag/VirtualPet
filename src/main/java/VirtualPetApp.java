import java.util.*;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
		System.out.print("Enter your bet name ");
		String betName=sc.nextLine();
		VirtualPet bet1 = new VirtualPet(betName);
		System.out.println(bet1.getName());

	}

}
