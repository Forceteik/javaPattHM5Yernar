package Bridge;

public class BMCSoldier extends Toy{

    protected BMCSoldier(Engineer engineer) {
        super(engineer);
    }

    @Override
    public void engineerToy() {
        System.out.println("BMW bike unit in progress...");
        engineer.doToy();
    }
}
