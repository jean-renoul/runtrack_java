package job05;
import java.util.HashSet;
import java.util.Set;

public class Unique {
        public static void main(String[] args) {

            int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 7, 5};
    
            Set<Integer> uniqueValues = new HashSet<>();
    
            for (int value : array) {
                uniqueValues.add(value);
            }
    
            System.out.println("Les valeurs uniques du tableau sont :");
            for (int value : uniqueValues) {
                System.out.println(value);
            }
        }
    }