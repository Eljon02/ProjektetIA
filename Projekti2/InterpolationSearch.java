import java.util.Arrays;

public class InterpolationSearch {
    
    public static int interpolationSearch(int[] array, int target) {
        int low = 0; // Kufiri i poshtem
        int high = array.length - 1; // Kufiri i eperm
        
        while (low <= high && target >= array[low] && target <= array[high]) {
            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);
            if (array[pos] == target) {
                return pos;
            } else if (array[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        return -1; // Nese nuk gjindet elementi i kerkuar
    }
    
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // Inicializimi i vargut
        int target = 14; // Elementi i kerkuar
        Arrays.sort(array);
        
        int index = interpolationSearch(array, target);
        
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}