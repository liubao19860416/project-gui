package org.lxh.useradmin1.vo;

import java.util.Date;

public class User {
    private int id;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private String name;
    private String sex;
    private Date birthday;

    @Override
    public String toString() {
        return "��ţ�" + this.id + "������" + this.name + "���Ա�" + this.sex
                + "�����գ�" + this.birthday;
    }

}
