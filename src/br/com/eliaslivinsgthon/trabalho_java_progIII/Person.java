package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Person {

    private String fullName;

    public Person(){
    }

    public Person(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}