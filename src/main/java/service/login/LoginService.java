package service.login;

import util.ScannerSingleton;

public class LoginService {
    public void index() {
        LoginContext loginContext = new LoginContext();
        System.out.println("1:Client Login:\n2:Employee Login:");
        String userOption = ScannerSingleton.getScannerInstance().nextLine();
        System.out.println("Please enter username:");
        String username = ScannerSingleton.getScannerInstance().nextLine();
        System.out.println("Please enter password:");
        String password = ScannerSingleton.getScannerInstance().nextLine();
        switch (userOption) {
            case "1":
                loginContext.setLoginStrategy(new ClientLogin());
                break;
            case "2":
                loginContext.setLoginStrategy(new EmployeeLogin());
                break;
        }
        loginContext.executeVerification(username,password);
    }
}
