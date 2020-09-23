package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Registration{
    private int aluno;
    private String code;
    
    public Registration(){
    }
    
    public Registration(int aluno, String code){
        this.aluno = aluno;
        this.code = code;
    }
    
    public int getAluno(){
        return aluno;
    }
    
    public void setAluno(int aluno){
        this.aluno = aluno;
    }
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getRegistration() {
        return Integer.toString(aluno) + "-" + code;
    }   
}
