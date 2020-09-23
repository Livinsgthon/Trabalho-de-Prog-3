package br.com.eliaslivinsgthon.trabalho_java_progIII;

public class Teacher  extends Person{

    private String login;
    private String webPage;

    public Teacher(){
    }
    
    public Teacher(String login, String fullName){
        super(fullName);
        this.login= login;
    }

    public Teacher(String login, String fullName, String webPage) {
        this(login,fullName);
        this.webPage = webPage;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }


}
