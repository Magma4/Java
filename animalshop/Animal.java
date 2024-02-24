package animalshop;

public class Animal {
    private String name;
    private String breed;
    private String colour;

    public Animal(String name, String breed, String colour){
        this.name = name;
        this.breed = breed;
        this.colour = colour;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
}