import java.util.ArrayList;

public class School {

    private ArrayList<Student> students;


    public School() {
        students = new ArrayList<>();
    }


    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }


    public void removeStudent(Student student) {
        students.remove(student);
    }


    public Student findYoungestStudent() {
        if (students.isEmpty()) return null;

        Student youngest = students.get(0);
        for (Student student : students) {
            if (student.getAge() < youngest.getAge()) {
                youngest = student;
            }
        }
        return youngest;
    }


    public Student findOldestStudent() {
        if (students.isEmpty()) return null;

        Student oldest = students.get(0);
        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }
        return oldest;
    }


    public static void main(String[] args) {
        School school = new School();


        Student student1 = new Student(101, 20, 3.8, 45);
        Student student2 = new Student(102, 18, 3.9, 30);
        Student student3 = new Student(103, 22, 3.5, 60);


        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);


        System.out.println("Youngest Student: " + school.findYoungestStudent());
        System.out.println("Oldest Student: " + school.findOldestStudent());


        school.removeStudent(student2);
        System.out.println("After removing the youngest student:");
        System.out.println("Youngest Student: " + school.findYoungestStudent());
    }
}
