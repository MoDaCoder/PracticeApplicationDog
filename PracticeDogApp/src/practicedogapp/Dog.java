package practicedogapp;

public class Dog implements IntAnimal {
    String name = "Chubbs";
    int age;
    public Dog() {
        super();
    }

    public Dog(String name, int age) {
        super();
        this.name = name; // Didn't actually use this constructor in this Java Tutorial
        this.age = age;
    }

    public String sayHowDoYouDo(String name) {
        return " moocow" + " & " + name;
    }

    public static void main(String[] args) {
//        Cat myCat = new Cat();//TODO create a Cat class
        Dog myDog = new Dog(); //Holding new instance of Class method Dog in variable myDog
        for (int count = 1; count < 2; count++) {
            System.out.println(count +
                               myDog.sayHowDoYouDo("Ollie")); //myDog.sayHi() is used so the main method would have access to the sayHi() method since myDog is global.
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
