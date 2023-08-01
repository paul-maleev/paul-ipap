import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class TrafficLights {
    public static void main (String[] args) {
        int N = 7;
        int M = 10;
        int crossroads[] ={5,3,7,5,7,6,6,7,2,5,1,2,1,2,4,5,4,5,1,3};

        HashMap<Integer,Integer> uniqueCrossroads = new HashMap<>();

        for(int i:crossroads) {
            uniqueCrossroads.put(i,0);
        }

        /*
        for(int i=0;i<crossroadsFrom.length;i++) {
            int value = uniqueCrossroads.get(crossroadsFrom[i]);
            uniqueCrossroads.put(crossroadsFrom[i],value+1);
        }
        */

        System.out.println(Arrays.toString(uniqueCrossroads.keySet().toArray()));





    }
}
