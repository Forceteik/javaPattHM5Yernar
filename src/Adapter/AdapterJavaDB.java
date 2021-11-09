package Adapter;

public class AdapterJavaDB extends JavaCode implements Database{
    @Override
    public void insert() {
        saveobject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

    @Override
    public void update() {
        updateObject();
    }
}
