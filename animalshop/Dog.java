package animalshop;

public class Dog extends Animal {
        private String barkNoise = "Woof";
        private double weight;
        private String breed;

        public Dog(String name, String breed, String colour, double weight){
            super(name, colour);
            this.breed = breed;
            this.weight = weight;
        }

        public Dog(String name, String breed, String barknoise, String colour, double weight){
            super(name, colour);
            this.barkNoise = barknoise;
            this.breed = breed;
            this.weight = weight;
        }
        
        public String getBreed(){
            return breed;
        }

        public void setBreed(String breed){
            this.breed = breed;
        }

        public String getBarknoise() {
            return barkNoise;
            
        }

        public void setBarknoise(String barknoise){
            this.barkNoise = barknoise;
        }

        public double getWeight(){
            return weight;
        }

        public void setWeight(double weight){
            this.weight = weight;
        }
    
}
