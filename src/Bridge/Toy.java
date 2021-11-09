package Bridge;

public abstract class Toy {
    protected Engineer engineer;

    protected Toy(Engineer engineer) {
        this.engineer = engineer;
    }

    public abstract void engineerToy();
}
