public class VirtualPet {

	private String petName;
	private int hunger;
	private int thirst;
	private int boredom;
	private int energy;

	public VirtualPet() {
	}

	public VirtualPet(String petName) {
		this.petName = petName;
		this.hunger = 0;
		this.energy=100;
		this.thirst=0;
		this.boredom=0;
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
	
	public int getEnergy() {
		return energy;
	}

	public void tick() {
		hunger += 10;
		boredom += 10;
		thirst += 10;
		this.energy--;

	}

	
	public void play() {
			if (boredom <0)
			boredom=0;
			else {
				boredom-=10;
			}
			if(this.energy>=50 )
				this.energy -= 20;
			else
				System.out.println("bet desn't have energy for playing");

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

