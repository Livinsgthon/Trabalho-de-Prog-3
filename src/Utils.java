import java.io.IOException;
import java.util.ArrayList;

public class Utils {
    
    public static void printMenuOptions(){
        System.out.printf("\n\tMENU\n"
                    + "1 - Cadastro de períodos \n"
                    + "2 - Cadastro de docentes  \n"
                    + "3 - Cadastro de disciplinas \n"
                    + "4 - Cadastro de estudantes \n"
                    + "5 - Matrícula de estudantes em disciplinas \n"
                    + "6 - Cadastro de atividades de disciplina \n"
                    + "7 - Avaliação de atividade por parte de estudante \n"
                    + "8 - Sair do programa \n"
                    + "Entre com a sua opcao: ");
    }
    public static void cleanConsole() throws InterruptedException, IOException{
//        if (System.getProperty("os.name").contains("Windows"))
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//        else
//            Runtime.getRuntime().exec("clear");
//    	System.out.println("\n\n\n\n");
    	
    }
    
    public static Discipline findDiscipline(String code, String period, ArrayList<Discipline> disciplines){
        for(int i=0; i < disciplines.size();i++){
            if(disciplines.get(i).getDisciplineReference().equals(code+"-"+period) ){
                return disciplines.get(i);

            }
        }
    
        return null;
    }
    public static Student findStudent(int code, ArrayList<Student> students){
        for(int i=0; i < students.size();i++){
            if(students.get(i).getStudentReference() == code ){
                return students.get(i);

            }

        }
    
        return null;
    }

}
