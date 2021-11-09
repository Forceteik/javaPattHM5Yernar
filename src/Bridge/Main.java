package Bridge;

public class Main {
    public static void main(String[]args){
        Toy [] toys = {
                new BMWBike(new BikeEngineer()),
                new BMCSoldier(new SoldierEngineer())
        };

        for(Toy toy: toys){
            toy.engineerToy();
        }
    }
}