
package oop;

public class Student {
   //user defined data type | blue-print
   //class varilable | global variable | 
   //instance variable | member fields | (properties)
   int id;
   String name;
   String grade;
   int marks1;
   int marks2;
   int total;
   int average;
   String result;
   //constructors
   //setters
   //getters

   public Student() {
        this.id = 0;
        this.name = "";
        this.grade = "";
        this.marks1 = 0;
        this.marks2 = 0;
        this.total = 0;
        this.average = 0;
        this.result = "";
    }
    public Student(int id, String name, String grade, int marks1, int marks2) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.total = 0;
        this.average = 0;
        this.result = "";
    }
   public Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.grade = s.grade;
        this.marks1 = s.marks1;
        this.marks2 = s.marks2;
        this.total = s.total;
        this.average = s.average;
        this.result = s.result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", grade=" + grade + ", marks1=" + marks1 + ", marks2=" + marks2 + ", total=" + total + ", average=" + average + ", result=" + result + '}';
    }
    
    //Methods
    public void calculateTotal(){
        this.total=(this.marks1+this.marks2);
    }
    public void calculateAverage(){
        this.average=this.total/2;
    }
    public void calculateResult(){
        if(this.marks1>=40 && this.marks2>40){
            this.result="PASS";
        }
        else{
            this.result="FAIL";
        }
    }
}