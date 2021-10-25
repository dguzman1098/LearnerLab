package learnerlab;

public class Instructor extends Person implements Teacher {

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        System.out.println(learner.getTotalStudyTime());
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner learner : learners) {
            //evenly splits the numberOfHours by length of learners array
            double numberOfHoursPerLearner = numberOfHours / learners.length;
            //students learn a split for the numberOfHours of the lecture
            learner.learn(numberOfHoursPerLearner);

        }
    }


    public static void main(String[] args) {

        //testing methods in main
        Learner[] learners = new Learner[2];
        learners[0] = new Student(0, "batman");
        learners[1] = new Student(1, "spiderman");

        Instructor instructor = new Instructor(500, "Obama");

        //instructor.lecture(learners, 3);
        instructor.teach(learners[0], 2); //outputs 2 because instructor taught for 2 hours
        System.out.println(learners[1].getTotalStudyTime()); //output 0 because this student hasnt learned anything


    }


}
