package Bridge;

public class BMWBike extends Toy{
    protected BMWBike(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void engineerToy() {
        System.out.println("BMC soldier unit in progress...");
        engineer.doToy();
    }
}
