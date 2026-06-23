import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Product search(Product[] products, int targetId) {

        Arrays.sort(products, (p1, p2) ->p1.getProductId() - p2.getProductId());
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].getProductId() == targetId) {

                return products[mid];

            } else if (products[mid].getProductId() < targetId) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }

        }

        return null;
    }

}