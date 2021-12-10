package Question1;

import Question1.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class StudentMain {
    public static void main(String[] args) throws ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2011-01-01");
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2015-02-02");
        Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse("2017-03-03");
        Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-04-04");
        Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2015-05-05");
        Student student1 = new Student(001,"Johnn", 3.9,date1);
        Student student2 = new Student(002,"Kelly", 3.2,date2);
        Student student3 = new Student(003,"Mercy", 3.5,date3);
        Student student4 = new Student(004,"Abobo", 3.7,date4);
        Student student5 = new Student(005,"Media", 3.1,date5);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //ascending order by 'name'
        System.out.println("Ascending order by 'name':");
        System.out.println("---------------------------");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        for (Student student: studentList) {
            System.out.printf("Name: " + student.getName() + "    GPA: " + student.getGpa() + "   DateOfBirth: " +"%tF%n" , student.getDateOfBirth());
        }

        System.out.println();
        System.out.println();

        //descending order by 'gpa'
        System.out.println("---------------------------");
        System.out.println("descending order by 'gpa'");
        System.out.println("---------------------------");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getGpa().compareTo(s1.getGpa());
            }
        });

        //simplify
        Collections.sort(studentList,(s1,s2) -> s2.getGpa().compareTo(s1.getGpa()));

        for (Student student: studentList) {
            System.out.printf("Name: " + student.getName() + "    GPA: " + student.getGpa() + "   DateOfBirth: " +"%tF%n" , student.getDateOfBirth());
        }

        System.out.println();
        System.out.println();

        //ascending order of 'dateOfBirth'
        System.out.println("---------------------------");
        System.out.println("ascending order of 'dateOfBirth'");
        System.out.println("---------------------------");
        Collections.sort(studentList, (s1, s2) -> s1.getDateOfBirth().compareTo(s2.getDateOfBirth()));

        for (Student student: studentList) {
            System.out.printf("Name: " + student.getName() + "    GPA: " + student.getGpa() + "   DateOfBirth: " +"%tF%n" , student.getDateOfBirth());
        }

    }
}
