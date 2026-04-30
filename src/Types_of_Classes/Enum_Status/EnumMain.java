package Types_of_Classes.Enum_Status;

public class EnumMain {

    public static void main(String[] args) {
        Order o = new Order(101, Status.SUCCESS);
        o.display();
    }
}
