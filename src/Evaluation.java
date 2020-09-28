public class Evaluation {
    private Student student;
    private Discipline discipline;
    private double grade;

    public Evaluation(Student student,Discipline discipline,double grade){
        this.setDiscipline(discipline);
        this.setStudent(student);
        this.setGrade(grade);
    }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
}
