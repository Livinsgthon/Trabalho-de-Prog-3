package br.com.eliaslivinsgthon.trabalho_java_progIII;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        
        int option = 0;
        ArrayList<Period> arrayPeriod = new ArrayList();
        ArrayList<Discipline> arrayDiscipline = new ArrayList();
        ArrayList<Activity> arrayActivity = new ArrayList();
        ArrayList<Student> arrayStudent = new ArrayList();
        ArrayList<Teacher> arrayTeacher = new ArrayList();
        ArrayList<Registration> arrayRegistration = new ArrayList();
        
        
        do{
            System.out.println("\n\tMENU\n");
            System.out.println("1 - Cadastro de períodos");
            System.out.println("2 - Cadastro de docentes");
            System.out.println("3 - Cadastro de disciplinas");
            System.out.println("4 - Cadastro de estudantes");
            System.out.println("5 - Matrícula de estudantes em disciplinas");
            System.out.println("6 - Cadastro de atividades de disciplina");
            System.out.println("7 - Avaliação de atividade por parte de estudante");
            System.out.println("8 - Sair do programa\n");

            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            input.nextLine();
            int j = 0;
            
            switch (option){
                case 1 :
                    Period newPeriod = new Period();
                    if(arrayPeriod.size() > 0){
                        System.out.println("Período(s) cadastrado(s):");
                        int i = 0;
                        while(i < arrayPeriod.size()){
                            System.out.println(arrayPeriod.get(i).getPeriod());
                            i++;
                        }
                    }
                    System.out.println("Cadastrar novo período (1)");
                    System.out.println("Voltar ao Menu Principal (2)");
                    System.out.printf("Digite a opção: ");
                    j = input.nextInt();
                    input.nextLine();
                    if(j == 1){
                    
                        System.out.printf("\nYear: ");
                        int year = input.nextInt();
                        System.out.printf("Semester: ");
                        String semester = input.next();

                        newPeriod.setYear(year);
                        newPeriod.setSemester(semester);

                        arrayPeriod.add(newPeriod);
                    }

                    break;
                case 2 :
                    Teacher newTeacher = new Teacher();
                    if(arrayTeacher.size() > 0){
                        System.out.println("Professor(es) cadastrado(s):");
                        int i = 0;
                        while(i < arrayTeacher.size()){
                            System.out.println(arrayTeacher.get(i).getFullName() + " - " + arrayTeacher.get(i).getWebPage());
                            i++;
                        }
                    }
                    
                    System.out.println("Cadastrar novo professor(a) (1)");
                    System.out.println("Voltar ao Menu Principal (2)");
                    System.out.printf("Digite a opção: ");
                    j = input.nextInt();
                    input.nextLine();
                    if(j == 1){

                        System.out.printf("\nLogin: ");
                        String login = input.nextLine();
                        System.out.printf("Full Name: ");
                        String fullName = input.nextLine();
                        System.out.printf("Web Page: ");
                        String webPage = input.nextLine();

                        newTeacher.setLogin(login);
                        newTeacher.setFullName(fullName);
                        newTeacher.setWebPage(webPage);

                        arrayTeacher.add(newTeacher);
                    }
                    break;
                case 3 :
                    Discipline newDiscipline = new Discipline();
                    if(arrayDiscipline.size() > 0){
                        System.out.println("Disciplina(s) Cdastrada(s):");
                        int i = 0;
                        while(i < arrayDiscipline.size()){
                            System.out.println(arrayDiscipline.get(i).getCode() + " - " + arrayDiscipline.get(i).getName() +
                                    " - " + arrayDiscipline.get(i).getPeriod() + " - " + arrayDiscipline.get(i).getResponsableTeacher());
                            i++;
                        }
                    }
                    
                    System.out.println("Cadastrar nova disciplina (1)");
                    System.out.println("Voltar ao Menu Principal (2)");
                    System.out.printf("Digite a opção: ");
                    j = input.nextInt();
                    input.nextLine();
                    if(j == 1){

                        System.out.printf("\nCode: ");
                        String disciplineCode = input.nextLine();
                        System.out.printf("Discipline Name: ");
                        String disciplineName = input.nextLine();
                        System.out.printf("Period: ");
                        String disciplinePeriod = input.nextLine();
                        System.out.printf("Responsable Teacher: ");
                        String responsableTeacher = input.nextLine();

                        newDiscipline.setCode(disciplineCode);
                        newDiscipline.setName(disciplineName);
                        newDiscipline.setPeriod(disciplinePeriod);
                        newDiscipline.setResponsableTeacher(responsableTeacher);

                        arrayDiscipline.add(newDiscipline);
                    }
                    break;
                case 4 :
                    Student newStudent = new Student();
                    if(arrayStudent.size() > 0){
                        System.out.println("Aluno(s) cadastrado(s):");
                        int i = 0;
                        while(i < arrayStudent.size()){
                            System.out.println(arrayStudent.get(i).getRegistrationCode() + " - " + arrayStudent.get(i).getFullName());
                        }
                    }
                    
                    System.out.println("Cadastrar novo estudante (1)");
                    System.out.println("Voltar ao Menu Principal (2)");
                    System.out.printf("Digite a opção: ");
                    j = input.nextInt();
                    input.nextLine();
                    if(j == 1){

                        System.out.printf("\nRegistration: ");
                        int registration = input.nextInt();
                        System.out.printf("Full Name: ");
                        String fullNameStudent = input.next();

                        newStudent.setFullName(fullNameStudent);
                        newStudent.setRegistrationCode(registration);

                        arrayStudent.add(newStudent);
                    }   
                    break;
                case 5 :
                    Registration newRegistration = new Registration();
                    if(arrayRegistration.size() > 0){
                        System.out.println("Matrícula(s) na(s) disciplina(s):");
                        int i = 0;
                        while(i < arrayRegistration.size()){
                            System.out.println(arrayRegistration.get(i).getRegistration());
                            i++;
                        }
                    }
                    
                    System.out.println("Cadastrar matrícula (1)");
                    System.out.println("Voltar ao Menu Principal (2)");
                    System.out.printf("Digite a opção: ");
                    j = input.nextInt();
                    input.nextLine();
                    if(j == 1){

                        System.out.printf("\nStudent Registration: ");
                        int studentRegistration = input.nextInt();
                        System.out.printf("Discipline Code: ");
                        String code = input.next();

                        newRegistration.setAluno(studentRegistration);
                        newRegistration.setCode(code);

                        arrayRegistration.add(newRegistration);
                    }
                    break;
                case 6 :
                    break;
                case 7 :
                    break;
                case 8 :
                    break;
            }
        }while(option != 8);
    }
}