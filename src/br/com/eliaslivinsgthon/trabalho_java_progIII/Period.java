package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Period {
    private int year;
    private String semester;

    public Period(){
    }

    public Period(int year, String semester ){
        this.semester = semester;
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getPeriod() {
        return Integer.toString(year) +"/" +semester;
    }	
}
