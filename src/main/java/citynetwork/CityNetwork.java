package citynetwork;

import java.util.ArrayList;
import java.util.List;

public class CityNetwork {
    public final List<CityTLA> _cities = new ArrayList<>();

    public boolean checkRep() {
        List<String> cityNameList = new ArrayList<>();

        //Add each element in to the respected list
        for(int i = 0; i < _cities.size(); i++) {
            cityNameList.add(_cities.get(i)._cityName);
        }

        for(int i = 0; i < _cities.size(); i++) { //Go through each code
            String currentCode = _cities.get(i)._cityCode; //Get current city name for checking
            int count = 0;
            for(int j = 0; j < _cities.size(); j++) { //Scan through every city with each code
                String currentCity = cityNameList.get(j);
                if(Utils.isValidCode(currentCity, currentCode)) count++;
            }
            if(count != 1) return false;
        }
        return true;
    }

//        for (int i = 0; i < _cities.size(); i++) {
//            CityTLA city1 = _cities.get(i);
//            if (city1.checkRep() == false) {
//                return false;
//            }
//            for (int j = i+1; j < _cities.size(); j++) {
//                CityTLA city2 = _cities.get(j);
//                if (Utils.isValidCode(city2._cityName, city1._cityCode)) {
//                    return false;
//                }
//            }
//        }

    /**
     *
     * @param cityNames is not null and only contains strings with upper-case alphabets and spaces
     * @return a {@code CityNetwork} instance with the maximum number of cities from {@code cityNames} that can have ambiguity-free TLAs
     */
    public static final CityNetwork buildNetwork(List<String> cityNames) {
        // TODO: Implement this method for Task 3
        return null;
    }
}
