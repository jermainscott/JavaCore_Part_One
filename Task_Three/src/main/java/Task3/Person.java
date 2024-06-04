package Task3;


/* Task 3 - Change identities
There is a class Person that has two fields: name and age. Your task is to implement
 the method changeIdentities.
It should swap all information (age and name) between two persons p1 and p2.


It is known that objects p1 and p2 can't be null. */



public class Person {
    String name;
    int age;

}


class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName = p1.name;
        int tempAge = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = tempName;
        p2.age = tempAge;

    }



    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Alan Touring";
        person1.age = 25;

        Person person2 = new Person();
        person2.name = "Albert Einstein ";
        person2.age = 45;


        System.out.println("Before Swap:");
        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);

        // Swap identities
        changeIdentities(person1, person2);

        System.out.println("After Swap:");
        System.out.println("Person 1: " + person1.name + ", " + person1.age);
        System.out.println("Person 2: " + person2.name + ", " + person2.age);
    }



}
