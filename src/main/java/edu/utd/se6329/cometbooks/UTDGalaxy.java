package edu.utd.se6329.cometbooks;

import java.util.HashMap;
import java.util.Map;

//singleton class
public class UTDGalaxy
{
    //username, password <K,V>
    private Map<String, String> pwdVerifier;
    private Map<String, String> map2;

    private UTDGalaxy(){
        pwdVerifier = new HashMap<String, String>();

        pwdVerifier = new HashMap<>();
        pwdVerifier.put("sayan", "say");
        pwdVerifier.put("ankita", "ank");
        pwdVerifier.put("hunter", "hun");
        pwdVerifier.put("bryan", "bry");
        pwdVerifier.put("trijit", "tri");

        map2 = new HashMap<>();
        map2.put("sayan", "19960104");
        map2.put("ankita", "19960930");
        map2.put("hunter", "19960505");
        map2.put("bryan", "19960204");
        map2.put("trijit", "19960202");
    }

    public Map<String, String> getPwdVerifier() {
        return pwdVerifier;
    }

    public void setPwdVerifier(Map<String, String> pwdVerifier) {
        this.pwdVerifier = pwdVerifier;
    }

    public String authenticateUser(String netid, String password){
        if(pwdVerifier.containsKey(netid)){
            if(pwdVerifier.get(netid) == null) return null;
            return map2.get(netid);
        }
        return null;
    }

    public static UTDGalaxy utdGalaxyInstance = null;

    public static UTDGalaxy getInstance(){
        if(utdGalaxyInstance == null) utdGalaxyInstance = new UTDGalaxy();
        return utdGalaxyInstance;
    }

}
