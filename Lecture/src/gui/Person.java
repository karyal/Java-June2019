/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Broadway
 */
public class Person {
    int id;
    String gender;
    int reading;
    int playing;
    String age_group;
    String address;

    public Person() {
        this.id = 0;
        this.gender = "";
        this.reading = -1;
        this.playing = -1;
        this.age_group = "";
        this.address = "";
    }
    
    public Person(int id, String gender, int reading, int playing, String age_group, String address) {
        this.id = id;
        this.gender = gender;
        this.reading = reading;
        this.playing = playing;
        this.age_group = age_group;
        this.address = address;
    }
    
    public Person(Person p) {
        this.id = p.id;
        this.gender = p.gender;
        this.reading = p.reading;
        this.playing = p.playing;
        this.age_group = p.age_group;
        this.address = p.address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }

    public int getPlaying() {
        return playing;
    }

    public void setPlaying(int playing) {
        this.playing = playing;
    }

    public String getAge_group() {
        return age_group;
    }

    public void setAge_group(String age_group) {
        this.age_group = age_group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", gender=" + gender + ", reading=" + reading + ", playing=" + playing + ", age_group=" + age_group + ", address=" + address + '}';
    }
}
