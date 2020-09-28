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
  
    public int getStudentReference(){
        return this.registrationCode;
    }
    public void printStudent(){
    	System.out.println("\nMatricula: " +this.registrationCode);
    	System.out.println("Nome Completo: " +this.getFullName());
    }
}
