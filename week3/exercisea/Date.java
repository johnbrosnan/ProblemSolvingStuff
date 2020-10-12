package week3.exercisea;

public class Date {
    private int day;
    private int month;
    private int year; //attributes

    public Date() { //no-arg constructor
        /*this.day = 1;
        this.month = 1;
        this.year = 1900;*/
        setDay(1);
        setMonth(1);
        setYear(1900);
    }

    public Date(int day, int month, int year) {
        /*this.day = day;
        this.month = month;
        this.year = year;*/
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() { //an accessor method
        return day;
    }

    public int getMonth() { //an accessor method
        return month;
    }

    public int getYear() { //an accessor method
        return year;
    }

    public void setDay(int day) { //a mutator method
        //can put test code here
        this.day = day;
    }

    public void setMonth(int month) { //a mutator method
        this.month = month;
    }

    public void setYear(int year) { //a mutator method
        this.year = year;
    }

    public String toString() { //overrides the toString() from Object
        return getDay() + "-" + getMonth() + "-" + getYear();
    }

}
