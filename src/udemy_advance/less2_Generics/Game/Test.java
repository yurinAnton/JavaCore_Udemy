package udemy_advance.less2_Generics.Game;

public class Test {
    public static void main(String[] args) {

        Schoolar sc1 = new Schoolar("Ivan", 13);
        Schoolar sc2 = new Schoolar("Sergey", 14);
        Schoolar sc3 = new Schoolar("Nikolay", 12);
        Schoolar sc4 = new Schoolar("Sveta", 13);

        Student st1 = new Student("Alena", 19);
        Student st2 = new Student("Bob", 18);

        Employee em1 = new Employee("Mike", 25);
        Employee em2 = new Employee("Anna", 32);

        Team<Schoolar> schoolTeam = new Team<>("SchoolDragons");
        schoolTeam.addParticipant(sc1);
        schoolTeam.addParticipant(sc2);
//        schoolTeam.addParticipant(st1);
//        schoolTeam.addParticipant(em2);

        Team<Student> studentTeam = new Team<>("StudentBulls");
        studentTeam.addParticipant(st1);
        studentTeam.addParticipant(st2);

        Team<Employee> employeeTeam = new Team<>("Workers");
        employeeTeam.addParticipant(em1);
        employeeTeam.addParticipant(em2);

//        Team<String> team1 = new Team<>("Team1");

        Team<Schoolar> schoolTeam2 = new Team<>("SchoolBrains");
        schoolTeam.addParticipant(sc3);
        schoolTeam.addParticipant(sc4);

        schoolTeam.playWith(schoolTeam2);

    }
}
