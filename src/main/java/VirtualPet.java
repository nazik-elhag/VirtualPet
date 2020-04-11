
public class VirtualPet {

	private String petName;
	private int hunger = 0;
	private int thirst = 0;
	private int boredom = 0;

	public VirtualPet() {
	}

	public VirtualPet(String petName) {
		this.petName = petName;
	}

	public String getName() {
		return petName;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	public void tick() {
		hunger += 10;
		boredom += 10;
		thirst += 10;

	}

	public void play() {
			if (boredom <0)
			boredom=0;
			else {
				boredom-=10;
			}

	}
	public void feed() {
		if(hunger<0) {
			hunger=0;
		}
		else {
		hunger-=10;
		}
		if(thirst<0) {
			thirst=0;
		}
		else {
		thirst-=10;
		}
	}

}
