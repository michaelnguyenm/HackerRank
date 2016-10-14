import java.util.*;

public class RansomNote {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public RansomNote(String magazine, String note, int m, int n) {
        magazineMap = new Hashtable<String, Integer>();
        noteMap = new Hashtable<String, Integer>();
        addToMap(magazineMap, magazine, m);
        addToMap(noteMap, note, n);
    }
    
    public static void addToMap(Map<String, Integer> m, String line, int num) {
        Scanner s = new Scanner(line);
        Integer frequencies;
        for (int i = 0; i < num; i++) {
            String word = s.next();
            frequencies = m.get(s);
            //Has key
            if (frequencies == null) {
                m.put(word, 1);
            //Does not have key
            } else {
                m.put(word, frequencies + 1);
            }
        }
    }
    
    public boolean solve() {
        for (String s : noteMap.keySet()) {
            Integer noteFrequency = noteMap.get(s);
            Integer magazineFrequency = magazineMap.get(s);
            if (magazineFrequency == null)
                return false;
            if (noteFrequency > magazineFrequency)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine(), m, n);
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
