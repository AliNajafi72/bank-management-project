package service;

import service.login.LoginService;

public class Router {
    public static void processRoutes() {
    // Login
    LoginService loginService = new LoginService();
    loginService.index();
    // Panel
    }
}
