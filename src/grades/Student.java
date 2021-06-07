package grades;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int gradeCounter = 0;
        for(int x = 0; x < grades.size(); x ++){
            int grade = grades.get(x);
            gradeCounter += grade;
        }
        return (gradeCounter / grades.size());
    }

//    public static void main(String[] args) {
//        Student s1 = new Student("David");
//        s1.addGrade(100);
//        s1.addGrade(100);
//        s1.addGrade(0);
//        System.out.println(s1.getGradeAverage());
//    }
}

