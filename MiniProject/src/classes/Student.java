/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import library.Global;

/**
 *
 * @author Broadway
 */
public class Student {
    String grade;
    char section;
    double m1, m2, m3, m4;
    double total, average;
    String result;
    String division;
    String remarks;

    public Student() {
        this.grade = "";
        this.section = ' ';
        this.m1 = 0;
        this.m2 = 0;
        this.m3 = 0;
        this.m4 = 0;
        this.total = 0;
        this.average = 0;
        this.result = "";
        this.division = "";
        this.remarks = "";
    }
    
    public Student(String grade, char section, double m1, double m2, double m3, double m4, double total, double average, String result, String division, String remarks) {
        this.grade = grade;
        this.section = section;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.total = total;
        this.average = average;
        this.result = result;
        this.division = division;
        this.remarks = remarks;
    }
    public Student(Student s) {
        this.grade = s.grade;
        this.section = s.section;
        this.m1 = s.m1;
        this.m2 = s.m2;
        this.m3 = s.m3;
        this.m4 = s.m4;
        this.total = s.total;
        this.average = s.average;
        this.result = s.result;
        this.division = s.division;
        this.remarks = s.remarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getM3() {
        return m3;
    }

    public void setM3(double m3) {
        this.m3 = m3;
    }

    public double getM4() {
        return m4;
    }

    public void setM4(double m4) {
        this.m4 = m4;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return grade + ", section=" + section + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + ", total=" + total + ", average=" + average + ", result=" + result + ", division=" + division + ", remarks=" + remarks ;
    }
    
    private void calculatTotal(){
        this.total=m1+m2+m3+m4;
    }
    private void calculateAverage(){
        this.average=this.total/Global.MAX_SUBJECTS;
    }
    
}
