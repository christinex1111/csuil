import java.util.ArrayList;

public class babblingBrooks {
    public static void main(String[] args) {
        int[] input = {3,10,20,30,99,1,50,88,3,88,2,77};
        int numOfStreams = input[0];
        int[] streamsArray = new int[numOfStreams];
        ArrayList <Integer> streams = new ArrayList<>();
        int streamNumber = 0;
        double streamDecimal = 0.0;
        double streamPercentage = 0.0;
        double splitNum = 0.0;
        int splitNumInt = 0;
        int streamJoin = 0;
        int streamSum = 0;

        for (int n = 0; n < streamsArray.length; n++) {
            streams.add(1);
        }

        for (int i = 0; i < streams.size(); i++) {
            streams.set(i, input[i+1]);
        }

        for (int j = numOfStreams + 1; j < input.length; j++) {
            if (input[j] == 99) {
                streamNumber = input[j+1];
                streamDecimal = input[j+2];
                streamPercentage = streamDecimal / 100;
                splitNum = streams.get(streamNumber - 1) * streamPercentage;
                splitNumInt= (int) splitNum;
                streams.set(streamNumber - 1, splitNumInt);
                streams.add(streamNumber, splitNumInt);
            } else if (input[j] == 88) {
                //int lastStream = streams.get(streams.size()-1);
                streamNumber = input[j+1];
                if (streamNumber == streamsArray.length) {
                    streamJoin = streamNumber--;
                    streamSum = streams.get(streamNumber-1) + streams.get(streamJoin-1);
                    streams.remove(streams.get(streamNumber-1));
                    streams.set(streamNumber - 1, streamSum);
                } else {
                    streamJoin = streamNumber++;
                    streamSum = streams.get(streamNumber-1) + streams.get(streamJoin-1);
                    streams.remove(streams.get(streamNumber-1));
                    streams.set(streamNumber - 2, streamSum);
                }
            }
        }
        System.out.println(streams);
    }
}