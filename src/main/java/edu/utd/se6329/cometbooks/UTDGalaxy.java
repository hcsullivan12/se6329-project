package edu.utd.se6329.cometbooks;

//singleton class
public class UTDGalaxy
{
    //username, password <K,V>
    private Map<String, String> pwdVerifier;
    private Map<String, String> map2;

    private UTDGalaxy(){
        pwdVerifier = new HashMap<>();
        pwdVerifier["sayan"] = "say";
        pwdVerifier["ankita"] = "ank";
        pwdVerifier["hunter"] = "hun";
        pwdVerifier["bryan"] = "bry";
        pwdVerifier["trijit"] = "tri";

        map2 = new HashMap<>();
        map2["sayan"] = "19960104";
        map2["ankita"] = "19960930";
        map2["hunter"] = "19960505";
        map2["bryan"] = "19960204";
        map2["trijit"] = "19960202";
    }

    public String authenticateUser(String netid, String password){
        if(pwdVerifier.containsKey(netid)){
            if(pwdVerifier.get(netid) == null) return null;
            return map2.get(netid);
        }
        return null;
    }

    public static Controller utdGalaxyInstance = null

    public static Controller getInstance(){
        if(utdGalaxyInstance == null) utdGalaxyInstance = new UTDGalaxy();
        return utdGalaxyInstance;
    }

}
