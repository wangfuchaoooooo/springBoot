package cn.com.gree.entity;

import java.io.Serializable;

public class Student implements Serializable{

    private static final long serialVersionUID = 2120869894112984147L;

    private int id;
    private String name;
    private String sumScore;
    private String avgScore;
    private int age;

    public Student() {
    }

    public Student(int id, String name, String sumScore, String avgScore, int age) {
        this.id = id;
        this.name = name;
        this.sumScore = sumScore;
        this.avgScore = avgScore;
        this.age = age;
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

    public String getSumScore() {
        return sumScore;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sumScore='" + sumScore + '\'' +
                ", avgScore='" + avgScore + '\'' +
                ", age=" + age +
                '}';
    }
}
