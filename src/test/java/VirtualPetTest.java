import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
	@Test
	public void shouldBeAbleToCreatePet() {
	    VirtualPet pet = new VirtualPet();
	}

	@Test
	public void petShouldHaveName() {
	    VirtualPet underTest = new VirtualPet("Jeff");

	    String expected = underTest.getName();

	    assertEquals(expected, "Jeff");
	}

	@Test
	public void shouldHaveDefaultHunger() {
	    VirtualPet underTest = new VirtualPet("Steve");

	    int expected = underTest.getHunger();

	    assertEquals(expected, 0);
	}
	@Test
	public void shouldTick() {
		   VirtualPet underTest = new VirtualPet("Kendrick");

		   int initialHunger = underTest.getHunger();
		   underTest.tick();
		   int hungerAfterTick = underTest.getHunger();

		   assertEquals(initialHunger + 10, hungerAfterTick);
		   
		}
	@Test
	public void shouldPlay() {
		VirtualPet pet=new VirtualPet();
		int boredom=pet.getBoredom();
		pet.play();
		int boreomAfterPlay=pet.getBoredom();
		assertEquals(boredom-10, boreomAfterPlay);
		
	}
	@Test
	public void shouldFeed() {
		VirtualPet pet=new VirtualPet("sam");
		int hunger=pet.getHunger();
		int thirst=pet.getThirst();
		pet.feed();
		int hungerAfterPlay=pet.getHunger();
		int thirstAfterPlay=pet.getThirst();
		assertEquals(hunger-10,hungerAfterPlay);
		assertEquals(thirst-10,thirstAfterPlay);
		
	}
	
	}


