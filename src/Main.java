public class Main {
    public static void main(String[] args) {

        Programmer programmer=new Programmer("Oliver",30);
        Driver driver=new Driver("Anton",40);
        Builder builder=new Builder("John",40);

        System.out.println(programmer.toString());
        System.out.println(driver.toString());
        System.out.println(builder.toString());
        programmer.working();
        driver.working();
        builder.working();



    }
}