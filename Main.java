import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Double[] al = {99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5}; 
        ArrayList<Double> all = new ArrayList<>(); 
        for (int i = 0; i<al.length; i++){
            all.add(al[i]); 
        }
        WeatherData testa = new WeatherData(all); 
        testa.cleanData(85.0, 120.0);
        testa.printList();
        Double[] al2 = {100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2}; 
        ArrayList<Double> all2 = new ArrayList<>();
        for (int i = 0; i<al2.length; i++){
            all2.add(al2[i]); 
        }
        WeatherData testb = new WeatherData(all2);
        System.out.println(testb.longestHeatWave(100.5));
        System.out.println(testb.longestHeatWave(95.2));
    }
}
