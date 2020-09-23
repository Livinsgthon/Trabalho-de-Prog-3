package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Discipline {

    private String code;
    private String name;
    private String period;
    private String responsableTeacher;

    public Discipline(){
    }

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
}
