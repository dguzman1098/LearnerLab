package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd(){
        //given
        Person person1 = new Person(1, "Diego");
        Person person2 = new Person(2, "Lionel");
        Person person3 = new Person(3, "Cristiano");

        //when
        People.addPerson(person1);
        People.addPerson(person2);
        People.addPerson(person3);
        int actual = People.count();

        //then
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testRemove() {
        //given
        People.removeAll();
        Person person1 = new Person(1, "Diego");
        Person person2 = new Person(2, "Lionel");
        Person person3 = new Person(3, "Cristiano");
        People.addPerson(person1);
        People.addPerson(person2);
        People.addPerson(person3);

        //when
        People.removePerson(person1);
        int actual = People.count();

        //then
        Assert.assertEquals(2 ,actual);

    }

    @Test
    public void testFindById(){
        //given
        People.removeAll();
        Person person1 = new Person(1, "Diego");
        Person person2 = new Person(2, "Lionel");
        Person person3 = new Person(3, "Cristiano");

        //when
        People.addPerson(person1);
        People.addPerson(person2);
        People.addPerson(person3);
        People.findById(2);
    }
}
