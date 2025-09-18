import java.util.Scanner;

class Player {
     String name;
     int matchesPlayed;
     int runs;
     int wickets;

    // Default Constructor
        Player() {
        name = "";
        matchesPlayed = 0;
        runs = 0;
        wickets = 0;
    }

    // Getter methods
    String getName() {
        return name;
    }

     int getMatchesPlayed() {
        return matchesPlayed;
    }

     int getRuns() {
        return runs;
    }

     int getWickets() {
        return wickets;
    }

    // Setter methods
     void setName(String name) {
        this.name = name;
    }

     void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

     void setRuns(int runs) {
        this.runs = runs;
    }

      void setWickets(int wickets) {
        this.wickets = wickets;
    }

    	void acceptInfo(Scanner sc) {
        System.out.print("Enter player name: ");
        setName(sc.nextLine());

        System.out.print("Enter number of matches played: ");
        setMatchesPlayed(sc.nextInt());

        System.out.print("Enter runs scored: ");
        setRuns(sc.nextInt());

        System.out.print("Enter wickets taken: ");
        setWickets(sc.nextInt());
        sc.nextLine(); // consume newline
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Matches Played: " + getMatchesPlayed());
        System.out.println("Runs: " + getRuns());
        System.out.println("Wickets: " + getWickets());
        System.out.println("---------------------------");
    }
}// class player ends here

// Main class
 class CricketPlayers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[10];

        System.out.println("Enter details of 10 players:");
        for (int i = 0; i < players.length; i++) {
            System.out.println("\n--- Player " + (i + 1) + " ---");
            players[i] = new Player(); // call default constructor
            players[i].acceptInfo(sc);
        }

        System.out.println("\n==== Players Information ====");
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " Details:");
            players[i].displayInfo();
        }

        int maxRunsIndex = 0;
        for (int i = 1; i < players.length; i++) {
            if (players[i].getRuns() > players[maxRunsIndex].getRuns()) {
                maxRunsIndex = i;
            }
        }

        int maxWicketsIndex = 0;
        for (int i = 1; i < players.length; i++) {
            if (players[i].getWickets() > players[maxWicketsIndex].getWickets()) {
                maxWicketsIndex = i;
            }
        }

        System.out.println("\n=== Player with Maximum Runs ===");
        players[maxRunsIndex].displayInfo();

        System.out.println("\n=== Player with Maximum Wickets ===");
        players[maxWicketsIndex].displayInfo();

    }// main methods end here
}//class cricket ends here
