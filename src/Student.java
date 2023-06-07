import java.util.Comparator;
import java.util.List;

public class Student {
    /**Project аталышы: Student management system
     Description:
     Сизге Студенттерди башкаруу системасын иштеп чыгуу милдети жүктөлгөн,
     ал студенттердин тизмесин алардын аты-жөнү жана группасы боюнча сактап жана иреттей алат.
     Система студенттерди кошуу, студенттердин тизмесин көрсөтүү жана
     колдонуучунун тандоосу боюнча Comparable же Comparator жардамы менен тизмени
     сорттоо үчүн функцияларды камсыз кылышы керек.
     Талаптар:
     Төмөнкү атрибуттары бар Студент классын түзүңүз: аты  жана баасы.
     Студенттердин аттары боюнча (өсүү тартибинде) салыштыруу үчүн Студенттик класста Салыштырылуучу интерфейсти ишке киргизиңиз.
     Студенттердин тизмесин сактоо үчүн ArrayList<Student> түзүңүз.
     StudentManagementSystem классында төмөнкү ыкмаларды ишке ашырыңыз:
     addStudent(Student student): Тизмеге студентти кошот.
     displayStudents(): Студенттердин тизмесин көрсөтөт.
     sortByNames(): Collections.sort() жана Салыштырылуучу интерфейстин жардамы менен студенттердин тизмесин алардын аттарынын негизинде иреттейт.
     sortByGrades(): Collections.sort() жана ыңгайлаштырылган Comparator ишке ашыруу аркылуу окуучулардын тизмесин алардын бааларынын негизинде иреттейт.
     SortByGrades() методу менен окуучуларды бааларынын негизинде салыштыруу үчүн Comparator интерфейсин ишке ашырыңыз (кемүүчү тартипте).*/
    private String name;
    private int grades;

    public Student(){

    }
    public Student(String name, int grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
    public void sortByName(List<Student>students){
        students.sort(byName);
        for(int i=0;i< students.size();i++){
            System.out.println(students.get(i));
        }
    }
    public Comparator<Student>byName=new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

}

