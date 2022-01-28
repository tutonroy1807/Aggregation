package prosenjit;

public class Player {
    String matchType;
    int over;
    String PlayerName;
    int JersyNumber;

    Player(String mT, int o, String PlName, int JName)
    {
        matchType = mT;
        over = o;
        PlayerName = PlName;
        JersyNumber = JName;
    }

    void displayInformation()
    {
        System.out.println("MatchType: "+matchType);
        System.out.println("Over: "+over);
        System.out.println("PlayerName: "+PlayerName);
        System.out.println("JersyNumber: "+JersyNumber);
    }
}
