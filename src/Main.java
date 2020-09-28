import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int option = 0;
        ArrayList<Period> arrayPeriods = new ArrayList<Period>();
        ArrayList<Discipline> arrayDisciplines = new ArrayList<Discipline>();
        ArrayList<Activity> arrayActivities = new ArrayList<Activity>();
        ArrayList<Student> arrayStudents = new ArrayList<Student>();
        ArrayList<Teacher> arrayTeachers = new ArrayList<Teacher>();
        Scanner input = new Scanner(System.in);

        do {
            Utils.printMenuOptions();
            option = input.nextInt();
            input.nextLine();
            Utils.cleanConsole();
            int userDecision = 0;

            switch (option) {
            	//Cadastro de periodos
                case 1:
                    // Lista periodos cadastrados se houver algum
                    if (arrayPeriods.size() > 0) {
                        System.out.println("\n\nPeriodos registrados: ");
                        arrayPeriods.forEach(period -> period.printPeriod());

                    }
                    System.out.printf(
                            "\nRegistrar novo periodo (1)\n" + "Voltar ao menu principal (2)\n" + "Digite sua opcao: ");

                    userDecision = input.nextInt();
                    input.nextLine();
                    if (userDecision == 1) {
                        System.out.printf("\nAno: ");
                        int year = input.nextInt();
                        input.nextLine();

                        System.out.printf("Semestre: ");
                        char semester = input.next().charAt(0);
                        input.nextLine();

                        Period newPeriod = new Period(year, semester);
                        arrayPeriods.add(newPeriod);
                    } else {
                        continue;
                    }
                    break;
                //	Cadastro de professores
                case 2:
                    if (arrayTeachers.size() > 0) {
                        System.out.println("\n\nDocentes cadastrados: ");
                        arrayTeachers.forEach(teacher -> teacher.printTeacher());

                    }
                    System.out.printf("\nRegistrar novo professor (1)\n" + "Voltar ao menu principal (2)\n"
                         				   + "Digite sua opcao: ");
                    userDecision = input.nextInt();
                    input.nextLine();
                    if (userDecision == 1) {

                        System.out.printf("\nLogin: ");
                        String login = input.nextLine();

                        System.out.printf("Nome Completo: ");
                        String fullName = input.nextLine();

                        System.out.printf("Deseja adicionar pagina web?(S/N): ");
                        char response = input.next().charAt(0);
                        input.nextLine();

                        if (response == 'S' || response == 's') {

                            System.out.printf("Pagina Web: ");
                            String webPage = input.nextLine();

                            Teacher newTeacher = new Teacher(login, fullName, webPage);
                            arrayTeachers.add(newTeacher);

                        } else {
                            Teacher newTeacher = new Teacher(login, fullName);
                            arrayTeachers.add(newTeacher);
                        }

                    } else {
                        continue;
                    }
                    break;
                //Cadastros de disciplinas
                case 3:
                    if (arrayDisciplines.size() > 0) {
                        System.out.println("\n\nDisciplinas cadastradas: ");

                        arrayDisciplines.forEach((discipline) -> discipline.printDiscipline());

                    }
                    System.out.printf("\nRegistrar nova disciplina (1)\n" + "Voltar ao menu principal (2)\n"
                            + "Digite sua opcao: ");

                    userDecision = input.nextInt();
                    input.nextLine();
                    if (userDecision == 1) {

                        System.out.printf("\nCodigo:");
                        String code = input.nextLine();

                        System.out.printf("Nome: ");
                        String name = input.nextLine();

                        System.out.printf("Periodo: ");
                        String period = input.nextLine();

                        System.out.printf("Professor responsavel: ");
                        String responsableTeacher = input.nextLine();

                        Discipline newDiscipline = new Discipline(code, name, period, responsableTeacher);
                        arrayDisciplines.add(newDiscipline);
                    } else {
                        continue;
                    }
                    break;
                // Cadastro de estudantes
                case 4:
                    if (arrayStudents.size() > 0) {
                        System.out.println("\n\nEstudantes cadastrados: ");
                        arrayStudents.forEach(student -> student.printStudent());

                    }
                    System.out.printf("\nRegistrar novo estudante (1)\n" + "Voltar ao menu principal (2)\n"
                            + "Digite sua opcao: ");
                    userDecision = input.nextInt();
                    input.nextLine();
                    if (userDecision == 1) {

                        System.out.printf("\nMatricula: ");
                        int code = input.nextInt();
                        input.nextLine();

                        System.out.printf("Nome completo: ");
                        String fullName = input.nextLine();

                        Student newStudent = new Student(code, fullName);
                        arrayStudents.add(newStudent);
                    } else {
                        continue;
                    }
                    break;
                // Matricula estudante em disciplina
                case 5:

                    System.out.printf("\nMatricular estudante (1)\n" + "Voltar ao menu principal (2)\n"
                    + "Digite sua opcao: ");
                    
                    userDecision = input.nextInt();
                    input.nextLine();
                    if (userDecision == 1) {

                        System.out.printf("\nCodigo de matricula do estudante: ");
                        int studentCode = input.nextInt();
                        input.nextLine();

                        System.out.printf("Codigo da disciplina: ");
                        String disciplineCode = input.nextLine();

                        System.out.printf("Periodo da disciplina: ");
                        String disciplinePeriod = input.nextLine();


                        Discipline discipline = Utils.findDiscipline(disciplineCode, disciplinePeriod, arrayDisciplines);
                        if (discipline == null)
                                System.out.println("disciplina nao encontrada");
                        else {
                           Student student = Utils.findStudent(studentCode, arrayStudents);
                           if(student != null){
                               discipline.enrollStudent(student);
                           }
                        }
                        
                    } else {
                        continue;
                    }

                    break;
                // Cadastra atividades
                case 6:
                    if (arrayActivities.size() > 0) {
                        System.out.println("\n\nAtividades cadastradas: ");
                        arrayActivities.forEach(activity -> activity.printActivity());
                    }

                    System.out.println("\nCadastrar nova atividade(1)\n" + "Voltar ao menu principal (2)\n"
                            + "Digite sua opcao: ");
                    userDecision = input.nextInt();
                    input.nextLine();
                    if (userDecision == 1) {

                        System.out.printf("\nNome da atividade: ");
                        String name = input.nextLine();

                        System.out.printf("Codigo da disciplina: ");
                        String disciplineCode = input.nextLine();

                        System.out.printf("Periodo da disciplina: ");
                        String disciplinePeriod = input.nextLine();

                        System.out.println("Eh sincrona? (S/N): ");
                        char synchronous = input.next().charAt(0);
                        input.nextLine();

                        if (synchronous == 'S' || synchronous == 's') {

                            Activity newActivity = new Activity(name, disciplineCode, true);
                            Discipline discipline = Utils.findDiscipline(disciplineCode,disciplinePeriod,arrayDisciplines);
                            if (discipline == null)
                                System.out.println("disciplina nao encontrada");
                            else {
                                discipline.setActivity(newActivity);
                                newActivity.setActivityNumber(discipline.getActivities().size() + 1);
                            }

                            arrayActivities.add(newActivity);
                        } else {
                            Activity newActivity = new Activity(name, disciplineCode);
                            Discipline discipline = Utils.findDiscipline(disciplineCode,disciplinePeriod, arrayDisciplines);
                            if (discipline == null)
                                System.out.println("disciplina nao encontrada");
                            else {
                                discipline.setActivity(newActivity);
                                newActivity.setActivityNumber(discipline.getActivities().size());
                            }
                            arrayActivities.add(newActivity);
                        }

                    } else {
                        continue;
                    }
                    break;
                //Avalia atividades
                case 7:
                System.out.printf("\nAvaliar atividade (1)\n" + "Voltar ao menu principal (2)\n"
                + "Digite sua opcao: ");
                
                userDecision = input.nextInt();
                input.nextLine();
                if (userDecision == 1) {

                    System.out.printf("\nCodigo de matricula do estudante: ");
                    int studentCode = input.nextInt();
                    input.nextLine();

                    System.out.printf("Codigo da disciplina: ");
                    String disciplineCode = input.nextLine();

                    System.out.printf("Periodo da disciplina: ");
                    String disciplinePeriod = input.nextLine();

                    System.out.printf("\nNumero da atividade: ");
                    int activityNumber = input.nextInt();
                    input.nextLine();

                    System.out.printf("\nNota para a atividade: ");
                    int activityGrade = input.nextInt();
                    input.nextLine();

                    Discipline discipline = Utils.findDiscipline(disciplineCode, disciplinePeriod, arrayDisciplines);
                    if (discipline == null)
                            System.out.println("disciplina nao encontrada");
                    else {
                       Student student = Utils.findStudent(studentCode, arrayStudents);
                       if(student != null){
                           Evaluation evaluation = new Evaluation(student,discipline, activityGrade);
                           discipline.getActivities().get(activityNumber-1).setSudentsEvaluation(evaluation);
                           System.out.println("sucesso ao avaliar atividade: ");
                       }
                    }
                    
                } else {
                    continue;
                }

                    break;
                //Sai do programa
                case 8:
                    System.out.println("\nAte logo !");
                    break;
                default:
                    Utils.cleanConsole();
                    break;
            }

        } while (option != 8);
        input.close();
    }
}
