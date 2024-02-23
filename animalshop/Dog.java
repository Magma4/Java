package animalshop;

public class Dog {
        private String name;
        private String breed;
        private String barkNoise = "Woof";
        private double weight;

        public Dog(String name, String breed, double weight){
            this.name = name;
            this.breed = breed;
            this.weight = weight;
        }

        public Dog(String name, String breed, String barknoise, double weight){
            this.name = name;
            this.breed = breed;
            this.barkNoise = barknoise;
            this.weight = weight;
        }

        
    
}
