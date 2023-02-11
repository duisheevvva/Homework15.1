public class Person {
    private final String name;
    private static int age;


    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public void working(){
        System.out.println();
    }

    @Override
    public String toString() {
        return  " name:" + name  +   " age:" + age;
    }
}
