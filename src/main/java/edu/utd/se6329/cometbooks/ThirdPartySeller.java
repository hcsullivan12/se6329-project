package edu.utd.se6329.cometbooks;

import java.util.ArrayList;

//Singleton class
public class ThirdPartySeller
{
    private ThirdPartySeller() {
    }

    public static ThirdPartySeller thirdPartySellerInstance = null;

    public static ThirdPartySeller getInstance(){
        if(thirdPartySellerInstance == null) thirdPartySellerInstance = new ThirdPartySeller();
        return thirdPartySellerInstance;
    }
}
