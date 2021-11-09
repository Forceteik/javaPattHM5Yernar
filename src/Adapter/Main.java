package Adapter;

public class Main {
    public static void main(String[] args) {
        Database database = new AdapterJavaDB();

        database.insert();
        database.update();
        database.remove();
        database.select();
    }
}
