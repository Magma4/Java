package classesandobjects;

public class Chicken {
    
    private String name = "Fluffy";

    {
        System.out.println("Setting the field");
    }

    public Chicken(){
        name = "Duke";
        System.out.println("I am a constrictor!! and we are setting the name field");
    };

    public void Chicken(){

    }

    public static void main(String[] args) {
        Chicken Chich = new Chicken();
        System.out.println(Chich.name);
    }

}
