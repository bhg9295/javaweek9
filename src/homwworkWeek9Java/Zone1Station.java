package homwworkWeek9Java;

import java.util.*;

// Write a programme that tells you which line passes through particular stations.Just use Zone 1 stations name.
public class Zone1Station {
    public static void main(String[] args) {
        HashMap<String,String> stationLine = new HashMap<>();

        stationLine.put("Aldgate", "Districtline");
        stationLine.put("Waterloo", "Jublilee line ");
        stationLine.put("BondStreet", "Central line");
        stationLine.put("Oxford circus", "Central line");
        stationLine.put("Paddington", "Backerloo line");
        stationLine.put("Edgware", "Circal line");
        stationLine.put("Eustone NR", "Northern line");
        stationLine.put("Knightbridge", "Piccadily line");
        stationLine.put("Farringdon", "Metropolitan line");
        stationLine.put("Liver pool", "Elizabeth line");


        Scanner ob = new Scanner(System.in);
        System.out.println("Enter station Name :");
        String Zone1Station = ob.nextLine();

      for (Map.Entry<String, String> entry : stationLine.entrySet()){
          String linename = entry.getKey();
          String linestation = entry.getValue();
          System.out.println(linestation+""+linename);
      }
      // Itrate by itrater
        Iterator<Map.Entry<String,String>> carlist = stationLine.entrySet().iterator();
      while (carlist.hasNext()){

      }

        System.out.println(carlist.next());
    }

}
