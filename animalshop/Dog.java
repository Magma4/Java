package animalshop;

public class Dog extends Animal {
        private String barkNoise = "Woof";
        private double weight;
        private String name;

        public Dog(String name, String breed, double weight, String colour){
            super(breed, colour);
            this.name = name;
            this.weight = weight;
        }

        public Dog(String name, String breed, String barknoise, double weight, String colour){
            super(breed, colour);
            this.barkNoise = barknoise;
            this.name = name;
            this.weight = weight;
        }
        
        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
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

        public void bark(){
            System.out.println(barkNoise);
        }

        public void bark(String barkNoise){
            System.out.println(barkNoise);
        }
    
}
