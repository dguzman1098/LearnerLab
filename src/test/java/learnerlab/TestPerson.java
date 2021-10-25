package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //given
        Person person;
        int id = 0;
        String name = "diego";

        //when
        person = new Person(id, name);
        Assert.assertNotNull(person);
    }

    @Test
    public void testSetName(){
        //given
        Person person;
        int id = 0;
        person = new Person(id, null);

        //when
        person.setName("Superman");
        String actual = person.getName();
        Assert.assertEquals("Superman", actual);
    }



}
