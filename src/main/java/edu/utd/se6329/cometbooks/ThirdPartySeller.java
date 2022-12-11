package edu.utd.se6329.cometbooks;

import java.util.*;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

//Singleton class
public class ThirdPartySeller
{
    private Map<String, Double> bookToPriceMapper;

    public Map<String, Double> getBookToPriceMapper() {
        return bookToPriceMapper;
    }

    public void setBookToPriceMapper(Map<String, Double> bookToPriceMapper) {
        this.bookToPriceMapper = bookToPriceMapper;
    }

    private ThirdPartySeller() {
        bookToPriceMapper = new HashMap<String, Double>();
        bookToPriceMapper.put("12345", 23.4);
        bookToPriceMapper.put("sfsd3", 12.4);
        bookToPriceMapper.put("435vc", 33.4);
        bookToPriceMapper.put("df352", 21.4);
        bookToPriceMapper.put("sfd32", 6.4);
        bookToPriceMapper.put("bh43f", 22.4);
        bookToPriceMapper.put("5ybfc", 1.4);
        bookToPriceMapper.put("45bgg", 15.4);
        bookToPriceMapper.put("56445", 34.4);
    }
    public ArrayList<Pair<String, Double>> getMarketSalesPrices(ArrayList<Textbook> textbookList){
        ArrayList<Pair<String, Double>> prices = new ArrayList<>();

        for(int i=0;i<textbookList.size();i++){
            if(bookToPriceMapper.containsKey(textbookList.get(i).getISBN())){
                Pair<String, Double> price = new ImmutablePair<String, Double>(textbookList.get(i).getISBN(), bookToPriceMapper.get(textbookList.get(i).getISBN()));
                prices.add(price);
            }
        }
        return prices;
    }
    public static ThirdPartySeller thirdPartySellerInstance = null;

    public static ThirdPartySeller getInstance(){
        if(thirdPartySellerInstance == null) thirdPartySellerInstance = new ThirdPartySeller();
        return thirdPartySellerInstance;
    }
}
