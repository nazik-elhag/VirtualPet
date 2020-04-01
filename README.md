# VirtualPet
VirtualPet project:

Development of a console application by a team that practices agile methodology, utilizes test driven design, and values clean code
Appropriate use of Git and access to your application on GitHub
Useful player instructions in the form of a README.md file
An interactive user interface
A player can enter the game, play as long as they’d like, and leave the game when they want
Player’s choice of organic or robotic pets
Ability for players to admit pets into the shelter or adopt them
Ability for players to see a list of all pets in the shelter
Ability for players to see the current status of pets, such as hunger, boredom, and health
Ability for players to interact with one pet or multiple pets, such as feed, play, and take to doctor
As players interact with pets, the pet’s status changes
REMOVE? As time ticks by, the pet's status changes
REMOVE? Players are responsible for cleaning cages
Virtual Pets, Inc. would also like the following, although it is not required:

A visual representation of the pet’s status
Give pets a personality and uniqueness, such as a favorite food, in which they respond accordingly when fed
Increase the number of statuses, activities, pets, etc.

Task1:
Create a Console Application with appropriate tests.
Create a VirtualPet class.
Start with these JUnit tests.
the test:
public class ApplicationTest {

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

        int expected = underTest.getHunger;

        assertEquals(expected, 10);
    }
}


Add additional properties (thirst, boredom, etc)
Don't forget to add tests!
Inside Application.java, prompt the user for a pet name, create an instance of that pet, assign the specified name, and then display the pet's name to the user (use the appropriate getter to retrieve the name) before exiting the application.
When invoking the Tick method on your VirtualPet, it should update itself as if some time has passed (increase Hunger and Boredom, for example.)
Make this JUnit test pass to get started.

public class TickExampleTest {

    @Test
    public void shouldTick() {
        VirtualPet pet = new VirtualPet("Kendrick");

        int initialHunger = pet.getHunger();
        pet.tick();
        int hungerAfterTick = pet.getHunger();

        assertEquals(initialHunger + 10, hungerAfterTick);
    }
}

Add methods to your VirtualPet that feed, play, etc your pet.
Write the appropriate tests to ensure that the pet's properties are updating correctly.
Ensure that your pet can never have a negative value for hunger, boredom, etc.


Task2:

Deliverables
All prior functionality, plus:

Don't forget to add tests!

Useful player instructions in the form of a README.md file

Create a VirtualPetShelter class that will be used to manage multiple pets

Ability to intake many pets into the VirtualPetShelter
Ability for players to see a list of all pets in the shelter, for example with name, species and age
Ability for players to interact with one pet or multiple pets, such as feed, play, and take to doctor
Ability for players to see the current status of all pets in a table (see example below for inspiration)
| Name     | Health | Fatigue |
| -------- | ------ | ------- |
| Sam   | 43     | 22      |
| Joe | 63     | 34      |


Task3:

Deliverables

Support for 4 types of pets: Organic Cats, Organic Dogs, Robotic Cats, Robotic Dogs.
Robots require oil and maintenance.
Organic cats and dogs require cage & litter box cleaning.
Walking organic pets decreases the rate at which they soil their cages/litter boxes.
Walking robotic pets increases their need for oil and maintenance.
