package week4.exercisea;

import java.util.Arrays;

public class Student {
    private String name;
    private int id;
    private static String college = "Institute of technology, tralee";
    private String department;
    private String modules[];
    private static int count = 0;

    public Student(String name,String department,String modules[]) {
        setName(name);
        setId();
        setDepartment(department);
        setModules(modules);

    }

    public void setModules(String[] modules) {
        this.modules = modules;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private void setId() {
        count++;
        this.id = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static String getCollege() {
        return college;
    }

    public String getDepartment() {
        return department;
    }

    public String[] getModules() {
        return modules;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return  "\nname: " + getName() +
                "\nid: " + getId() +
                "\ndepartment: " + getDepartment()  +
                "\nmodules: " + Arrays.toString(getModules()) +
                "\ncollege: " + getCollege();
    }
}
