package Task4;

import java.util.Arrays;

public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;
    public Train (String destination, int trainNumber, String departureTime){
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }
    public int sortNum(Train[] train) {
        for (int i = 0; i < train.length; i++) {
            Arrays.sort(new int[]{trainNumber});
        }
        return 0;
    }
    public String toString(){
        return  "\n------------------------------------------" +
                "\nDestination: " + this.destination +
                "\nTrain number: " +  this.trainNumber +
                "\nDeparture Time: " + this.departureTime;
    }
}
