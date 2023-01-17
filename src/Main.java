import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<String> teams = new ArrayList<>();
            teams.add("Galatasaray");
            teams.add("Bursaspor");
            teams.add("Fenerbahce");
            teams.add("Besiktas");
            teams.add("Basaksehir");
            teams.add("Trabzonspor");

            System.out.println("TAKIM SAYISI CIFT SENARYOSU");
            System.out.println("---------------------------------");
            MatchSchedule.arrangeFixture(teams);

            teams.add("Bay");
            System.out.println("---------------------------------");
            System.out.println("TAKIM SAYISI TEK SENARYOSU");
            System.out.println("---------------------------------");
            MatchSchedule.arrangeFixture(teams);

        }
    }
