package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Student extends Person {

    private int registrationCode;
    
    public Student(){
    }
    
    public Student(int registrationCode, String fullName){
        super(fullName);
        this.registrationCode = registrationCode; 
    }

    public int getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(int registrationCode) {
        this.registrationCode = registrationCode;
    }
}
