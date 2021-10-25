package learnerlab;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(1, "Mr.Floss");

        //when
        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(1, "Mr.Floss");

        //when
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(1, "Mr.Floss");
        Student student = new Student(6, "Diego");


        //when
        instructor.teach(student, 3); // when instructor teaches student for 3 hours
        double actual = student.getTotalStudyTime();
        //expected 3 because instructor.teach numberOfHours parameter is 3
        Assert.assertEquals(3, actual, 0.1);

    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(1, "Mr.Floss");
        Learner[] learners = new Learner[2];
        learners[0] = new Student(0, "batman");
        learners[1] = new Student(1, "spiderman");

        //when
        instructor.lecture(learners, 4); //teaching two students for 4 hours
        double actual = learners[0].getTotalStudyTime();
        Assert.assertEquals(2, actual, 0.1);

    }

}
