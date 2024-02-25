package animalshop;
import animalshop.Dog;
import animalshop.Animal;
import animalshop.Fish;

public class AnimalTester {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Ace", "Beagle", 45.6, "black");
        Dog Dog2 = new Dog("bailey", "Boerboel", "arf-arf", 80.2 , "blue");
        Fish Fish = new Fish("Goldfish", "cold", "red");

        System.out.println("Dog name : " + Dog1.getName() );
        System.out.println("Dog breed :" + Dog1.getBreed());
        System.out.println("Bark noise : ");
        Dog1.bark();
        System.out.println("Dog weight " + Dog1.getWeight());

        System.out.println("Dog name :" + Dog2.getName());
        System.out.println("Dog breed :" + Dog2.getBreed());
        System.out.println("Dog bark :");
        Dog2.bark();
        System.out.println("Dog weight : " + Dog2.getWeight());

        System.out.println("Fish breed :" + Fish.getBreed());
        System.out.println("Water Type :" + Fish.getWatertype());
        System.out.println("Fish colour :" + Fish.getColour());
    }


}
