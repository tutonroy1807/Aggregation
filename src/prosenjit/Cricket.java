package prosenjit;

public class Cricket {
    String matchType;
    int over;


    Cricket(String mT, int o)
    {
        matchType = mT;
        over = o;
    }

    void displayInformation()
    {
        System.out.println("Matchtype: "+matchType);
        System.out.println("Over in Tournament: "+over);
    }



}
