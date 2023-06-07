import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>numbers=new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10));


        System.out.println("1)Первый элемент Linked List'а "+numbers.getFirst());
        System.out.println("2)Последний элемент Linked List'а "+numbers.getLast());
        System.out.println("3)Linked list тизмеде белгилууу бир элемент бар же жок.Жооп: "+numbers.contains(1));

        LinkedList<Integer> numbers1 = new LinkedList<>(numbers);
        System.out.println("4)Linked list тизмени массивдердин тизмесине которуу "+numbers1);



        System.out.println("5)2 Linked list тизмесин салыштыруу ");
//        for(int i=0;i< numbers.size();i++){
//            for(int j=i+1;j< numbers1.size();j++){
//                System.out.println(numbers.get(i).compareTo(numbers1.get(i)));
//            }
//        }
        System.out.println("6)Linked List бош же жок.Жооп: "+numbers.isEmpty());
        Collections.swap(numbers,0,9);
        System.out.println("7)Linked list тизмедеги элементти алмаштыруу "+numbers);


        Student student=new Student();
        Student student1=new Student("Akylai",4);
        Student student2=new Student("Myrzagul",5);
        Student student3=new Student("Erbol",3);
        Student student4=new Student("Kamilla",4);
        Student student5=new Student("Damir",3);
        Student student6=new Student("Valentina",5);
        Student student7=new Student("Tereza",3);
        ArrayList<Student> students=new ArrayList<>(List.of(student1,student2,student3,student4,student5,student6,student7));




        System.out.println(students);
        System.out.println("-------------------------------------------------------------------");
        StudentManagementClass studentManagementClass=new StudentManagementClass();
        System.out.println("Adding a new student");
        studentManagementClass.addStudent(students,new Student("Azamat",3));
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Display all students after adding");
        studentManagementClass.displayStudents(students);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sort students by name");
        studentManagementClass.sortByNames(students);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Sort grades");
        studentManagementClass.sortByGrades(students);

    }
}