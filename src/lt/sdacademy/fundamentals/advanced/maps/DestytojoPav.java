package lt.sdacademy.fundamentals.advanced.maps;

import java.util.*;


public class DestytojoPav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           /* Map<String, String> persons = readNameSurname(scanner);
            printMap(persons);
            Map<String, Integer> persons1 = readNameAge(scanner);
            printMap(persons1);
            Map<String, List<String>> persons2 = readNameFriends(scanner);
            printMap(persons2);*/
        Map<String, Map<String, String>> persons3 = readNameDetails(scanner);
        printMap(persons3);
    }
    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.printf("%s : %s\n", key, value);
        }
    }
    private static Map<String, Integer> readNameAge(Scanner scanner) {
        Map<String, Integer> persons = new HashMap<>();
        while (true) {
            System.out.println("Įveskite vardą");
            String name = scanner.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println("Įveskite amžių");
            int age = scanner.nextInt();
            persons.put(name, age);
        }
        return persons;
    }
    private static Map<String, List<String>> readNameFriends(Scanner scanner) {
        Map<String, List<String>> persons = new HashMap<>();
        while (true) {
            List<String> friends = new ArrayList<>();
            System.out.println("Įveskite vardą");
            String name = scanner.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            while (true) {
                System.out.println("Įveskite draugą");
                String friend = scanner.next();
                if (friend.equalsIgnoreCase("stop")) {
                    break;
                }
                friends.add(friend);
            }
            persons.put(name, friends);
        }
        return persons;
    }
    private static Map<String, Map<String, String>> readNameDetails(Scanner scanner) {
        Map<String, Map<String, String>> persons = new HashMap<>();
        while (true) {
            Map<String, String> details = new HashMap<>();
            System.out.println("Įveskite vardą");
            String name = scanner.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            while (true) {
                System.out.println("Įveskite raktą");
                String key = scanner.next();
                if (key.equalsIgnoreCase("stop")) {
                    break;
                }
                System.out.println("Įveskite rakto reikšmę");
                String value = scanner.next();
                details.put(key, value);
            }
            persons.put(name, details);
        }
        return persons;
    }
    private static Map<String, String> readNameSurname(Scanner scanner) {
        Map<String, String> persons = new HashMap<>();
        while (true) {
            System.out.println("Įveskite vardą");
            String name = scanner.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println("Įveskite pavardę");
            String surname = scanner.next();
            persons.put(name, surname);
        }
        return persons;
    }
}