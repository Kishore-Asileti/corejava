package Enum_Status;

public class Order {

    int id;
    Status status;

    Order(int id, Status status) {
        this.id = id;
        this.status = status;
    }

    void display() {
        System.out.println("Order " + id + " is " + status);
    }

}
