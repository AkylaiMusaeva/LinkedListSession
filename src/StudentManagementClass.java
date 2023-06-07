import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManagementClass {
    Scanner scanner=new Scanner(System.in);
    int num;
    public void addStudent(List<Student>students,Student student) {
        for (int i = 0; i < students.size(); i++) {
            students.set(0,student);
        }
        System.out.println(students);
    }
    public void displayStudents(List<Student>students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    public void sortByNames(List<Student> students) {
        students.sort(byNames);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void sortByGrades(List<Student> students) {
        System.out.println("""
                    1-sort by ascending
                    2-sort by descending""");
        switch(num=scanner.nextInt()){
            case 1:
                students.sort(byGrades);
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
                break;
            case 2:
                students.sort(byGrades1);
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
                break;
        }


    }
    public Comparator<Student>byNames=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public Comparator<Student>byGrades=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getGrades()-o2.getGrades();
        }
    };

    public Comparator<Student>byGrades1=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getGrades()-o1.getGrades();
        }
    };
}
