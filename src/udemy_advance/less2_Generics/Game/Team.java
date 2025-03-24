package udemy_advance.less2_Generics.Game;

import java.util.*;



public class Team <T extends Participant> {
    private String name;
    private List<T> part = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T p) {
        part.add(p);
        System.out.println("In team: " + name + " was added new participant: " + p.getName());
    }
    public void playWith(Team<T> team) {
        String winnerName;
        Random rand = new Random();
        int i = rand.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Won team: " + winnerName);
    }

}
