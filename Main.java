import java.util.ArrayList;
import java.util.List;
public class Main {
        public static void main(String[] args) {
            Teacher Ahmad = new Teacher(1,"Ahmad",500);
            Teacher Calvin = new Teacher(2,"Calvin",700);
            Teacher Nolan = new Teacher(3,"Nolan",700);
            List<Teacher> teacherList = new ArrayList<>();

            teacherList.add(Ahmad);
            teacherList.add(Calvin);
            teacherList.add(Nolan);


            Student James = new Student(1,"James",4);
            Student Dominik = new Student(2,"Dominik",7);
            Student Charles = new Student(3,"Charles",9);
            List<Student> studentList = new ArrayList<>();

            studentList.add(James);
            studentList.add(Dominik);
            studentList.add(Charles);

            Schools kewlSchool = new Schools(teacherList,studentList);

            Teacher Mr_E = new Teacher(6,"Mr.E", 800);

            kewlSchool.addTeacher(Mr_E);


            James.payFees(1000);
            Dominik.payFees(4000);
            System.out.println(kewlSchool.getTotalMoneyEarned());

            System.out.println("-- School Pay Salary --");
            Ahmad.receiveSalary(Ahmad.getSalary());
            System.out.println("kewlSchool has spent money towards " + Ahmad.getName() +"'s salary and now has $" + kewlSchool.getTotalMoneyEarned());

            Nolan.receiveSalary(Nolan.getSalary());
            System.out.println("kewlSchool has spent money towards " + Nolan.getName() + "'s salary and now has $" + kewlSchool.getTotalMoneyEarned());


            System.out.println(Dominik);
            Calvin.receiveSalary(Calvin.getSalary());
            System.out.println(Calvin);


        }
    }

