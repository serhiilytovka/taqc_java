package hw2.task2;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private String name;
    private Date birthDate;

    public Person(){}

    public Person(String name, Date birthYear){
        this.name = name;
        this.birthDate = birthYear;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBirthDate(String dateStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.birthDate = formatter.parse(dateStr);
    }

    public String getName(){
        return this.name;
    }

    public Date getBirthDate(){
        return this.birthDate;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public Integer age(Date birthDate){
        int birthYear;
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthDate);
        birthYear = calendar.get(Calendar.YEAR);
        return todayYear - birthYear;
    }

    public void input() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type name of person:");
        setName(sc.nextLine());
        System.out.println("Type a date of birth in format 'dd-MM-yyyy': ");
        setBirthDate(sc.nextLine());

    }

    public void output(){
        System.out.println("Name is " + getName());
        System.out.println("Age is " + age(getBirthDate()));
    }



    public static void main(String ... args) throws ParseException {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        person1.output();

        person2.input();
        person2.output();

        person3.input();
        person3.output();

        person4.input();
        person4.output();

        person5.input();
        person5.output();
    }
}
