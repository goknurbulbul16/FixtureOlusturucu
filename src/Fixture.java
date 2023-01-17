
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Fixture {


    private String home;
    private String away;

    public Fixture(String home, String away) {
        this.home = home;
        this.away = away;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    @Override
    public boolean equals(Object obj) {
        final Fixture other = (Fixture) obj;
        if (!Objects.equals(this.home, other.home)) {
            return false;
        }
        return Objects.equals(this.away, other.away);
    }

    @Override
    public String toString() {
        return home + " - " + away;
    }
}

class MatchSchedule {
    public static void arrangeFixture(ArrayList<String> teams) {
        Random rand = new Random();
        if (teams.size() % 2 == 1) {
            teams.add("Bay");
        }

        Set<Fixture> matches = new HashSet<>();
        ArrayList<String> weeklyTeams = (ArrayList) teams.clone();

        for (int i = 1; i <= ((teams.size() - 1) * 2); i++) {
            System.out.println("Round " + i);
            while (!weeklyTeams.isEmpty()) {
                int home = rand.nextInt(weeklyTeams.size());
                String homeTeam = weeklyTeams.remove(home);
                int away = rand.nextInt(weeklyTeams.size());
                Fixture temp = new Fixture(homeTeam, weeklyTeams.get(away));
                if (!matches.contains(temp)) {
                    matches.add(temp);
                    System.out.println(temp);
                    weeklyTeams.remove(away);
                } else {
                    weeklyTeams.add(homeTeam);
                }
            }
            System.out.println("----------------------------");
            weeklyTeams = (ArrayList) teams.clone();
        }
    }
}


