public class Driver extends Person{
    public Driver(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Drive");
    }
}
