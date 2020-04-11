
public class VirtualPet {
 
	protected String petName;
	protected int getHunger;
	protected int energy;
	protected int thirst;
	protected int boredom;

	VirtualPet(String petName)
	{
		this.petName = petName;
		this.getHunger = 10;
		this.energy=100;
		this.thirst=0;
		this.boredom=85;
	}
	public String getName() {
		return petName;
	}

	public int getHunger(){
		return this.getHunger;
	}
	public void tick() {
		this.getHunger +=10;
		this.energy--;
	}

}
