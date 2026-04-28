package Person;

class Indian extends Person implements EatTask, SleepTask {

    Indian(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
