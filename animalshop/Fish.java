package animalshop;

public class Fish extends Animal {
    private String waterType;

    public Fish(String breed, String waterType, String colour){
        super(breed, colour);
        this.waterType = waterType;
    }

    public String getWatertype(){
        return waterType;
    }

    public void setWatertype(String waterType){
        this.waterType = waterType;
    }
}
