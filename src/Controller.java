
import jdk.nashorn.internal.runtime.Logging;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Apple
 */
public class Controller {

    static MainMenu menu = new MainMenu();
    static Members members = new Members();
    static Teams teams = new Teams();
    static Reports reports = new Reports();
    static Students students = new Students();
    static Login login = new Login();
    static AssignMemberToTeam assign = new AssignMemberToTeam();

    public static void main(String[] args) {
        initialize();

    }

    public static void initialize() {
        login.setVisible(true);
    }

    public static void goToMenu() {
        teams.setVisible(false);
        reports.setVisible(false);
        members.setVisible(false);
        menu.setVisible(true);
        students.setVisible(false);
        login.setVisible(false);
        assign.setVisible(false);
    }

    public static void goToMembers() {
        menu.setVisible(false);
        members.setVisible(true);
        students.setVisible(false);
        assign.setVisible(false);
        teams.setVisible(false);
        reports.setVisible(false);
        members.reload();      
    }
    
    public static void gotoAssign() {
        assign.setVisible(true);
        menu.setVisible(false);
        teams.setVisible(false);
        reports.setVisible(false);
        members.setVisible(false);
        students.setVisible(false);
        login.setVisible(false);
        assign.reload();
    }

    public static void goToTeams() {
        menu.setVisible(false);
        teams.setVisible(true);
        members.setVisible(false);
        students.setVisible(false);
        assign.setVisible(false);
        reports.setVisible(false);
        teams.reload();
    }

    public static void goToReports() {
        menu.setVisible(false);
        reports.setVisible(true);
        assign.setVisible(false);
        members.setVisible(false);
        teams.setVisible(false);
        students.setVisible(false);
        reports.reload();
    }

    public static void goToStudents() {
        menu.setVisible(false);
        students.setVisible(true);
        members.setVisible(false);
        teams.setVisible(false);
        assign.setVisible(false);
        reports.setVisible(false);
        students.reload();
    }
}
