import java.util.ArrayList;


public class Activity {
    private String name;
    private boolean synchronous;
    private String discipline;
    private int activityNumber;
    private ArrayList<Evaluation> studentsEvaluation = new ArrayList<Evaluation>();


    public Activity(String name, String discipline, boolean synchronous) {
        this.name = name;
        this.synchronous = synchronous;
        this.discipline = discipline;
    }

    public Activity(String name, String discipline) {
        this(name, discipline, false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSynchronous() {
        return synchronous;
    }

    public void setSynchronous(boolean synchronous) {
        this.synchronous = synchronous;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String dicipline) {
        this.discipline = dicipline;
    }

    public int getActivityNumber() {
        return activityNumber;
    }

    public void setActivityNumber(int activityNumber) {
        this.activityNumber = activityNumber;
    }

    public void printActivity() {
    	System.out.println("\nNome: "+this.name);
    	System.out.println("Disciplina: "+this.discipline);
    	System.out.println("Eh sincrona?: "+this.isSynchronous());
    	if(this.studentsEvaluation.size()>0) {
    		System.out.println("Nota de avaliacao da atividade dada pelos estudantes: ");
    		this.studentsEvaluation.forEach(evaluation->
    			System.out.println("    " +evaluation.getGrade())
    		);
    		
    	}
    }
    public ArrayList<Evaluation> getStudentsEvaluation() {
        return this.studentsEvaluation;
    }

    public void setSudentsEvaluation(Evaluation studentEvaluation) {
        this.studentsEvaluation.add(studentEvaluation);
    }
}
