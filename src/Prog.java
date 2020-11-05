import java.io.*;
import java.nio.file.Paths;
import java.util.*;
public class Prog {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Birth b3= new Birth(9,3,1998);
        Birth b1= new Birth(2,1,2000);
        Birth b2= new Birth(9,2,2004);
        Birth b4= new Birth(9,4,2001);
        Birth b5= new Birth(9,5,1999);
        Birth b6= new Birth(9,6,2003);
        Student s1= new Student("yossi1",b1);
        Student s11= new Student("yossi11",b1);
        Student s2= new Student("yossi2",b2);
        Student s3= new Student("yossi3",b3);
        Student s4= new Student("yossi4",b4);
        Student s5= new Student("yossi5",b5);
        Student s6= new Student("yossi6",b6);
        School school= new School();
        school.addStudent(s1,0);
        school.addStudent(s11,0);
        school.addStudent(s2,1);
        school.addStudent(s3,2);
        school.addStudent(s4,3);
        school.addStudent(s5,4);
        school.addStudent(s6,5);

    }


    public static Node<Student>[] q3(School school){
        Node<Student>[] return_arr= new Node[12];


        return return_arr;
    }


}