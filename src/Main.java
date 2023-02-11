import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer();
        Programmer.setAge(20);
        System.out.println("Name:" + programmer.getName());
        System.out.println("Age:" + Programmer.getAge());
        programmer.working();
        System.out.println();
        Driver driver = new Driver();
        Driver.setAge(45);
        System.out.println("Name:" + driver.getName());
        System.out.println("Age:" + Driver.getAge());
        driver.working();
        System.out.println();
        Builder builder = new Builder();
        Builder.setAge(35);
        System.out.println("Name"+builder.getName());
        System.out.println("Age:"+Builder.getAge());
        builder.working();




    }

}
