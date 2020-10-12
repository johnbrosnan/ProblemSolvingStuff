package week4.exercisea;

public class TestStudent {

    public static void main(String[] args) {

        Student student1 = new Student("Tim","Computing",new String[]{"Maths","Java","Web Dev"});
        Student student2 = new Student("ita","Social Care",new String[]{"Intro to Social Care","Psychology"});

        Student allStudents[] = {student1,student2};

        System.out.println("Calling static method getCount() to determine the " +
                "number of students in the college\n\nTotal students in college: " +
                Student.getCount());

        System.out.println("Displaying the state of the " + Student.getCount() + "Student objects at this point\n\n");

        for(int i=0;i<Student.getCount();i++) {
            System.out.println("Student " + (i+1) + "\n\n" +
                    allStudents[i]);
        }

        Student.setCollege("MTU");

        System.out.println("Displaying the state of the " + Student.getCount() + "Student objects at this point\n\n");

        for(int i=0;i<Student.getCount();i++) {
            System.out.println("Student " + (i+1) + "\n\n" +
                    allStudents[i]);
        }







    }
}
