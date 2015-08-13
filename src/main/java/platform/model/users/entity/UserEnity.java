package platform.model.users.entity;

import java.io.Serializable;

/**
 * Created by dylanyang on 8/13/15.
 */
public class UserEnity implements Serializable{

    private static final long serialVersionUID = 6616000394022003716L;

    private int id;
    private String name;
    private String passwd;
    private int age;

    public UserEnity() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEnity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                '}';
    }
}
