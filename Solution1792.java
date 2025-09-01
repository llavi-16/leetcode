import java.util.PriorityQueue;

class Solution1792 {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Max-heap based on "gain" if we add a student to a class
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(b[0], a[0])
        );

        // Calculate initial gains and push into heap
        for (int[] c : classes) {
            int pass = c[0], total = c[1];
            double gain = calcGain(pass, total);
            pq.offer(new double[]{gain, pass, total});
        }

        // Distribute extra students
        for (int i = 0; i < extraStudents; i++) {
            double[] top = pq.poll(); // class with max gain
            int pass = (int) top[1];
            int total = (int) top[2];

            // Add one student who passes
            pass++;
            total++;

            // Push updated class with new gain
            double gain = calcGain(pass, total);
            pq.offer(new double[]{gain, pass, total});
        }

        // Compute final average
        double sum = 0.0;
        while (!pq.isEmpty()) {
            double[] top = pq.poll();
            int pass = (int) top[1];
            int total = (int) top[2];
            sum += (double) pass / total;
        }

        return sum / classes.length;
    }

    // Helper to compute "gain" for adding one student
    private double calcGain(int pass, int total) {
        return ((double)(pass + 1) / (total + 1)) - ((double) pass / total);
    }
}
