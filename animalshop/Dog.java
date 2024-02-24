package animalshop;

public class Dog extends Animal {
        private String barkNoise = "Woof";
        private double weight;

        public Dog(String name, String breed, String colour, double weight){
            super(name, breed, colour);
            this.weight = weight;
        }

        public Dog(String name, String breed, String barknoise, String colour, double weight){
            super(name, breed, colour);
            this.barkNoise = barknoise;
            this.weight = weight;
        }
        
    
}
