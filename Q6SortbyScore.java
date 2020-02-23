//Q6 rite a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private Double score;
    private Double age;

    public Student(String name, double score, double age){
        this.name = name;
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student: " + name + " Score: " + score + " Age: " + age;
    }

    public double getScore(){return score; }
    public String getName(){ return name;}
}

public class Q6SortbyScore {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vinay", 80, 21));
        studentList.add(new Student("Ankit", 90, 21));
        studentList.add(new Student("Aradhya", 60, 21));
        studentList.add(new Student("Aman", 85, 21));
        studentList.add(new Student("Priyanka", 60, 21));
        studentList.add(new Student("Parul", 88, 21));
        studentList.add(new Student("Taman", 62, 21));

        System.out.println(studentList);

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int comp =0;
                if (s1.getScore() - s2.getScore() == 0){
                    comp = s1.getName().compareTo(s2.getName());
                }
                else if (s1.getScore() - s2.getScore() == -1){
                    comp = -1;
                }
                else {
                    comp = 1;
                }
                return comp;
            }
        });

        System.out.println(studentList);
    }
}
