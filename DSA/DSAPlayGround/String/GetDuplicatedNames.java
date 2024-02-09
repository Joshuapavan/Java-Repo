package DSA.DSAPlayGround.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GetDuplicatedNames {

    public static void main(String[] args) {
        String[] names = new String[]{"arun", "arun", "ajju", "appu", "ajju"};
        HashMap<String, Integer> namesCountHash = new HashMap<>();
        ArrayList<String> duplicatedNames = new ArrayList<>();

        for(String name : names){
            if(namesCountHash.containsKey(name)){
                namesCountHash.put(name, namesCountHash.get(name)+1);
            }else {
                namesCountHash.put(name,1);
            }
        }

        for(Map.Entry<String,Integer> entry : namesCountHash.entrySet()){
            if(entry.getValue() > 1){
                duplicatedNames.add(entry.getKey());
            }
        }

        System.out.println("Duplicated Names"+duplicatedNames);

    }
}
