package KataProblems.week4.SuperMarketQueue;

public class SuperMarketQueue {
    static int totalTime = 0;
    static int idx = 0;

    public static int solveSuperMarketQueue(int[] customers, int n) {
        reinitializeStaticVariables();
        int[] queues = new int [n];
        // send first customers
        while (idx<n && idx<customers.length){
            queues[idx] = customers[idx];
            idx++;
        }
        // promote rest of customers
        while (idx<customers.length){
            queues = getMinimumAndPromoteQueue(queues);
            queues = addNextCustomersToQueues(queues, customers);
        }
        // count time for remaining customers
        totalTime+=getMaxOfRemainingQueues(queues);
        return totalTime;
    }
    public static void reinitializeStaticVariables(){
        totalTime=0;
        idx=0;
    }

    public static int[] getMinimumAndPromoteQueue(int[] queues) {
        // get minimum value being processed
        int min = Integer.MAX_VALUE;
        for (int i=0; i<queues.length; i++) {
            if (queues[i]>0){
                min = Math.min(queues[i], min);
            }
        }
        // promote minimum from queue
        for(int j=0; j<queues.length; j++){
            if (queues[j]>0){
                queues[j] -= min;
            }
        }
        // add time passed
        totalTime+=min;
        return queues;
    }

    public static int[] addNextCustomersToQueues(int[] queues, int[] customers){
        for (int j=0; j<queues.length; j++) {
            if (idx < customers.length && queues[j] == 0) {
                queues[j] = customers[idx];
                idx++;
            }
        }
        return queues;
    }

    public static int getMaxOfRemainingQueues(int[] queues){
        int max=0;
        for (int value : queues){
            max=Math.max(value, max);
        }
        return max;
    }
}
