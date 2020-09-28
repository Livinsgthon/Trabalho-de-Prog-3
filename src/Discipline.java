import java.util.ArrayList;

public class Discipline {

    private String code;
    private String name;
    private String period;
    private String responsableTeacher;
    private ArrayList<Activity> activities = new ArrayList<Activity>();
    private ArrayList<Student> students = new ArrayList<Student>();

  

    public  Discipline(String code, String name, String period, String responsableTeacher){
        this.code = code;
        this.name = name;
        this.period = period;
        this.responsableTeacher = responsableTeacher;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getResponsableTeacher() {
        return responsableTeacher;
    }

    public void setResponsableTeacher(String responsableTeacher) {
        this.responsableTeacher = responsableTeacher;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivity(Activity newActivity) {
        this.activities.add(newActivity);
    }
 
    public void enrollStudent(Student student){
        this.students.add(student);
    }
    public ArrayList<Student> getEnrolledStudents(){
        return this.students;
    }
    public String getDisciplineReference(){
        return this.code+"-"+this.period;
    }
    public void printDiscipline(){
    	System.out.println("\nCodigo: "+this.code);
    	System.out.println("Nome: "+this.name);
    	System.out.println("Periodo: "+this.period);
    	System.out.println("Professor responsavel: "+this.responsableTeacher);
    	
    	if(students.size()>0 ) {
    		System.out.println("Estudantes matriculados: ");
    		students.forEach(student ->
    			System.out.println("    "+student.getStudentReference())
    		);
    	}
    	
    	if(activities.size()>0) {
    		System.out.println("Atividades cadastradas: ");
    		activities.forEach(activity ->
    			System.out.println("    "+activity.getName() + "\n    "+activity.getActivityNumber())
    		);
    		
    	}
    	
    	
    }

}
