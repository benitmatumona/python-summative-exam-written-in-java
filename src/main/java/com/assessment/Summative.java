import java.util.*;

public class Summative {

    //////////////////
    // Question 1
    //////////////////
    public static List<List<String>> batchApiDispatcher(List<String> userIds) {
        List<List<String>> batches = new ArrayList<>();
        for (int i = 0; i < userIds.size(); i += 5) {
            int end = Math.min(i + 5, userIds.size());
            batches.add(new ArrayList<>(userIds.subList(i, end)));
        }
        return batches;
    }

    //////////////////
    // Question 2
    //////////////////
    public static int winningStreak(List<String> streak) {
        List<Integer> winningLengths = new ArrayList<>();
        int currentStreak = 0;
        for (String s : streak) {
            if (s.equals("W")) {
                currentStreak++;
            } else {
                if (currentStreak > 0) {
                    winningLengths.add(currentStreak);
                    currentStreak = 0;
                }
            }
        }
        winningLengths.add(currentStreak);
        return winningLengths.stream().max(Integer::compareTo).orElse(0);
    }

    //////////////////
    // Question 3
    //////////////////
    public static List<Integer> peakFinder(List<Integer> temperatures) {
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < temperatures.size() - 1; i++) {
            if (temperatures.get(i) > temperatures.get(i - 1) && temperatures.get(i) > temperatures.get(i + 1)) {
                peaks.add(temperatures.get(i));
            }
        }
        return peaks;
    }

    //////////////////
    // Question 4
    //////////////////
    public static Map<String, Double> stageSummary(List<Map<String, Object>> records) {
        Map<String, Double> summary = new LinkedHashMap<>();
        for (Map<String, Object> record : records) {
            int stage = (Integer) record.get("stage");
            double duration = (Double) record.get("duration_hours");
            String key = "Stage " + stage;
            summary.put(key, summary.getOrDefault(key, 0.0) + duration);
        }
        // Round to 2 decimal places
        summary.replaceAll((k, v) -> Math.round(v * 100.0) / 100.0);
        return summary;
    }

    //////////////////
    // Question 5
    //////////////////
    public static List<String> drawTriangle(int height) {
        List<String> rows = new ArrayList<>();
        for (int level = 0; level < height; level++) {
            int middle = 2 * level + 1 - 2;
            String row;
            if (level == 0) {
                row = "*";
            } else if (level == height - 1) {
                row = "*" + "*".repeat(middle) + "*";
            } else {
                row = "*" + " ".repeat(middle) + "*";
            }
            rows.add(row);
        }
        for (int i = rows.size() - 1; i >= 0; i--) {
            int spaces = rows.size() - i - 1;
            rows.set(i, " ".repeat(spaces) + rows.get(i));
        }
        return rows;
    }

    // Optional main method to test
    public static void main(String[] args) {
        System.out.println(batchApiDispatcher(Arrays.asList("ID1","ID2","ID3","ID4","ID5","ID6","ID7")));
        System.out.println(winningStreak(Arrays.asList("W","W","L","W")));
        System.out.println(peakFinder(Arrays.asList(1,3,7,1,2,6,3,2,1)));
        List<Map<String,Object>> records = new ArrayList<>();
        Map<String,Object> rec = new HashMap<>();
        rec.put("stage", 2);
        rec.put("duration_hours", 3.5);
        records.add(rec);
        System.out.println(stageSummary(records));
        System.out.println(drawTriangle(5));
    }
}
