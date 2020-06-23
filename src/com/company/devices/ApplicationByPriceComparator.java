
package com.company.devices;
        import java.util.Comparator;

public class ApplicationByPriceComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        if (o1.price == null && o2.price == null){
            return 0;
        }
        if (o1.price == null) {
            return -1;
        }
        if (o2.price == null) {
            return 1;
        }
        return (int) (o2.price-o1.price);
    }
}
