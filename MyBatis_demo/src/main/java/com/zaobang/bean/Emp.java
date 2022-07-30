package com.zaobang.bean;

public class Emp {
private String eid;
private String eName;
private  int age;
private  String sex;
private  Dept dept;
private int did;

    @Override
    public String toString() {
        return "Emp{" +
                "eid='" + eid + '\'' +
                ", eName='" + eName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", dept=" + dept +
                ", did=" + did +
                '}';
    }

    public Emp(String eid, String eName, int age, String sex, int did) {
        this.eid = eid;
        this.eName = eName;
        this.age = age;
        this.sex = sex;
        this.did = did;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Emp(String eid, String eName, int age, String sex, Dept dept) {
        this.eid = eid;
        this.eName = eName;
        this.age = age;
        this.sex = sex;
        this.dept = dept;
    }

    public Emp() {
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

}
