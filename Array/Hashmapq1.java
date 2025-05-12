import java.util.*;

public class Hashmapq1 {
    public static void main(String[] args) {
        HashMap<String, List<Long>> teamSca = new HashMap<>();

        // Add multiple phone numbers for the same name
        addNumber(teamSca, "Sohail", 8578084975L);
        addNumber(teamSca, "Sohail", 8578084976L);
        addNumber(teamSca, "Sohail", 8578084977L);
        addNumber(teamSca, "Alam", 9876543210L);

        // Iterate and display all entries
        Set<Map.Entry<String, List<Long>>> member = teamSca.entrySet();
        Iterator<Map.Entry<String, List<Long>>> it = member.iterator();

        while (it.hasNext()) {
            Map.Entry<String, List<Long>> e = it.next();
            System.out.println("Name: " + e.getKey() + ", Mob Numbers: " + e.getValue());
        }
    }

    // Helper method to add numbers to the map
    public static void addNumber(HashMap<String, List<Long>> map, String name, Long number) {
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(number);
    }
}
