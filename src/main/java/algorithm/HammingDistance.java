package algorithm;

public class HammingDistance{
    public static int calculate(Comparable source, Comparable comparing){
        String sourceStr = source.toString();
        String comparingStr = comparing.toString();
        if(sourceStr.length() == comparingStr.length()){
            return compute(sourceStr, comparingStr);
        } else {
            throw new IllegalArgumentException(
                    "Error. Cannot compute the hamming distance. The parameters have different length!"
            );
        }
    }

    private static int compute(String source, String comparing){
        int distance = 0;
        for(int iteration = 0; iteration < source.length(); iteration++){
            distance = source.charAt(iteration) != comparing.charAt(iteration) ? ++distance : distance;
        }
        return distance;
    }
}
