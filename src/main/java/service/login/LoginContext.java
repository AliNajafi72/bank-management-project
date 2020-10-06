package service.login;

public class LoginContext {
    private LoginStrategy loginStrategy;

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    public void executeVerification(String username, String password){
        loginStrategy.verify(username, password);
    }
}
