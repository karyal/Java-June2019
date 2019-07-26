
package login;

public class Login {
    String login_name;
    String login_password;

    public Login() {
        this.login_name = "";
        this.login_password = "";
    }
    public Login(String login_name, String login_password) {
        this.login_name = login_name;
        this.login_password = login_password;
    }
    public Login(Login l) {
        this.login_name = l.login_name;
        this.login_password = l.login_password;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getLogin_password() {
        return login_password;
    }

    public void setLogin_password(String login_password) {
        this.login_password = login_password;
    }

    @Override
    public String toString() {
        return "Login{" + "login_name=" + login_name + ", login_password=" + login_password + '}';
    }
}
