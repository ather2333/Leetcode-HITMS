import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> requests;

    // Constructor
    public RecentCounter() {
        requests = new LinkedList<>();
    }

    // ping method
    public int ping(int t) {
        // Add the new request time
        requests.add(t);

        // Remove requests that are older than t - 3000
        while (!requests.isEmpty() && requests.peek() < t - 3000) {
            requests.poll(); // Remove from front
        }

        // Remaining requests are within [t-3000, t]
        return requests.size();
    }

    // Example usage
    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));     // Output: 1
        System.out.println(rc.ping(100));   // Output: 2
        System.out.println(rc.ping(3001));  // Output: 3
        System.out.println(rc.ping(3002));  // Output: 3
    }
}
