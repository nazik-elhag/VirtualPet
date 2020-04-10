import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class VirtualPetTest {

    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("cat1");
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

        int expected = underTest.getHunger;

        assertEquals(expected, 10);
    }

    @Test
    public void shouldTick() {
        VirtualPet pet = new VirtualPet("Kendrick");

        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();

        assertEquals(initialHunger + 10, hungerAfterTick);
    }
}

