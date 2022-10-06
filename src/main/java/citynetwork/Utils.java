package citynetwork;

import java.util.ArrayList;

public class Utils {

    public static boolean isValidCode(String _cityName, String _cityCode) {
        if(_cityCode.length() != 3) return false;
        //Convert _cityCode to List
        ArrayList<String> listCityCode = new ArrayList<>();
        //Checks if there is a non string, if there is return false immediately
        for(int i = 0; i < 3; i++) {
            if(_cityCode.charAt(i) != ' ' && isNotNumber(_cityCode.substring(i, i+1))) listCityCode.add(_cityCode.substring(i, i+1));
            else return false;
        }

        for(int i = 0; i < _cityName.length(); i++) {
            String currentChar = _cityName.substring(i, i+1).toUpperCase();
            if(listCityCode.get(0).equals(currentChar)) {
                listCityCode.remove(0);
            }
            if(listCityCode.size() <= 0) return true;
        }
        return false;
    }

    private static boolean isNotNumber(String check) {
        try {
            Integer isInteger = Integer.parseInt(check);
        }
        catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }
}
