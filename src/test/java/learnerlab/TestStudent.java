package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    @Test
    public void testImplementation(){
        //Given
        Learner student = new Student(1,"Diego");

        //When
        Assert.assertTrue(student instanceof Learner); //expected true
    }

    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(1,"Diego");

        //When
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //given
        Student student = new Student(1, "Guzman");

        //When
        student.learn(2);
        double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(2, actual, 0.1);

    }






}
