public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            total += gain;
            tank += gain;

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total >= 0) {
            return start;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        GasStation gs = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        int result = gs.canCompleteCircuit(gas, cost);
        System.out.println("Starting index: " + result);
    }


    
}
