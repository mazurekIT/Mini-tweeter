package pl.coderslab.dto;

public class LoginDto {
    private String login;
    private String password;


    //---------------------------------------------------------------------------
    //---GETTERY i SETTERY
    //---------------------------------------------------------------------------


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
