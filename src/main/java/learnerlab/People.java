package learnerlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterator<E> {

    private static List<Person> personList = new ArrayList<>();


    public static void main(String[] args) {

        Person person1 = new Person(1, "Diego");
        Person person2 = new Person(2, "Lionel");
        Person person3 = new Person(3, "Cristiano");

        //adds people to List
        addPerson(person1);
        addPerson(person2);
        addPerson(person3);
        //System.out.println(personList.toString());
        findById(1);
        System.out.println(contains(person1));
        //removePerson(person1);
        //removeById(2);
        //removeAll();
        System.out.println(count());
        toArray();
        System.out.println("-----Iterator-----");
        iterator();
    }

    public static void addPerson(Person person){
        personList.add(person);
    }

    public static void removePerson(Person person){
        personList.remove(person);
    }
    public static void removeById(long id){
        personList.removeIf(person -> person.getId() == id);
    }

    public static void findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                System.out.println("Person found! " + person);
            }
        }
    }

    public static boolean contains(Person person){
        if (personList.isEmpty()){
            System.out.println("List is empty");
        }
        if (personList.contains(person)){
            return true;
        } else{
            return false;
        }
    }

    public static void removeAll(){
        personList.removeAll(personList);
    }

    public static int count(){
        return personList.size();
    }

    public static void toArray(){
        System.out.println(personList);
    }

    public static void iterator(){
        Iterator<Person> itr = personList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
