package animalshop;
import animalshop.Dog;

public class AnimalTester {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Ace", "Beagle", 45.6);
        Dog Dog2 = new Dog("bailey", "Boerboel", "arf-arf", 80.2 );

        System.out.println("Dog name : " + Dog1.getName() );
        System.out.println("Dog breed :" + Dog1.getBreed());
        System.out.println("Bark noise ");
        Dog1.bark();
        System.out.println("Dog weight " + Dog1.getWeight());

        System.out.println("Dog name :" + Dog2.getName());
        System.out.println("Dog breed :" + Dog2.getBreed());
        System.out.println("Dog bark :");
        Dog2.bark();
        System.out.println("Dog weight : " + Dog2.getWeight());
    }


}
