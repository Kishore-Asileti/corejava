package ObjectClassMethods.hashcode;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode() called for " + name);
        return name.hashCode() + age;
        // if there is email field then we add ==> "+ age + email.hashCode();" <==
        //name.hashcode() method converts string name into into integer and we are adding age integer
        //so all the fields are converted into integer and sent to server as hashcode
        //while sending data in http methods in browser all the data is converted into hascode and sent to server

    }

}
