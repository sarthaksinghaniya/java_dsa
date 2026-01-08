import java.util.*;

class TableRow {
    int id;
    String value;

    TableRow(int id, String value) {
        this.id = id;
        this.value = value;
    }
}

public class CombineTables {
    public static void main(String[] args) {
        // Table 1
        List<TableRow> table1 = Arrays.asList(
            new TableRow(1, "Alice"),
            new TableRow(2, "Bob"),
            new TableRow(3, "Charlie")
        );

        // Table 2
        List<TableRow> table2 = Arrays.asList(
            new TableRow(2, "Math"),
            new TableRow(3, "Science"),
            new TableRow(4, "History")
        );

        // Map to hold table2 rows by id for fast lookup
        Map<Integer, TableRow> table2Map = new HashMap<>();
        for (TableRow row : table2) {
            table2Map.put(row.id, row);
        }

        // Combine tables (inner join)
        List<String> combined = new ArrayList<>();
        for (TableRow row1 : table1) {
            if (table2Map.containsKey(row1.id)) {
                TableRow row2 = table2Map.get(row1.id);
                combined.add(row1.value + " - " + row2.value);
            }
        }

        // Print result
        for (String row : combined) {
            System.out.println(row);
        }
    }
}

