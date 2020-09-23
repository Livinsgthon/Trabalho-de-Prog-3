package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Activity {
    private String name;
    private boolean synchronous;
    private String discipline;
    private int activityNumber;


    public Activity(){
    }

    public Activity(String name, boolean synchronous, String discipline){
        this.name=name;
        this.synchronous=synchronous;
        this.discipline = discipline;
    }

    Activity(String name, boolean synchronous, String discipline, int activityNumber){
        this(name,synchronous,discipline);
        this.activityNumber = activityNumber;
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
}
