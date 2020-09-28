public class Period {
    private int year;
    private char semester;

    public Period(){
    }

    public Period(int year, char semester ){
        this.semester = semester;
        this.year = year;
    }

    public char getSemester() {
        return semester;
    }
    public void setSemester(char semester) {
        this.semester = semester;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getPeriodReference() {
        return Integer.toString(year) +"/" +semester;
    }	
    public void printPeriod(){
    	System.out.println("\nAno: "+this.year);
    	System.out.println("Semestre: "+this.semester);
    }
}
