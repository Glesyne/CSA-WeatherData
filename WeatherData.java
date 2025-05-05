import java.util.ArrayList;
public class WeatherData
{
    private ArrayList<Double> temperatures;
    public WeatherData(ArrayList<Double> temperature){
        temperatures = temperature; 
    }

    public void cleanData(double lower, double upper){ 
        for (int i = temperatures.size()-1; i>=0; i--){
            if (temperatures.get(i)>upper || temperatures.get(i) < lower){
                temperatures.remove(i); 
            }
        }
    }
    
    public int longestHeatWave(double threshold){  
        int longest = 0;
        int current = 0;
        for (int i = 0; i<temperatures.size(); i++){
            if (temperatures.get(i) > threshold){
                current++; 
            } 
            else{
                if (current > longest){
                    longest = current; 
                }
                current = 0; 
            }
        }
        if (current > longest){
            longest = current; 
        }
        return longest;
    }

    public void printList(){
        System.out.println(temperatures);
    }
    
}