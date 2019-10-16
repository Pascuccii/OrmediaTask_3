public class ClassA {
    private String name;
    private int valueA;

    public ClassA() { }

    public ClassA(String name, int intValueA) {
        this.valueA = intValueA;
        this.name = name;
    }

    public int getValueA() {
        return valueA;
    }

    public void setValueA(int intValueA) {
        this.valueA = intValueA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
