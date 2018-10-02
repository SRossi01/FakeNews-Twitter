import java.util.List;

public class Node {
    private boolean seenFN;
    private boolean seenCorrection;
    private List<Edge> connections;

    public Node() {
        this.seenFN = false;
        this.seenCorrection = false;
    }

    public List<Edge> getConnections() {
        return connections;
    }

    public boolean addConnection(Edge e) {
        connections.add(e);
    }

    public boolean hasSeenFN() {
        return seenFN;
    }

    public void setSeenFN(boolean fn) {
        this.seenFN = fn;
    }

    public boolean hasSeenCorrection() {
        return seenCorrection;
    }

    public void setSeenCorrection(boolean corr) {
        this.seenCorrection = corr;
    }

    private void postFN() {
        if (seenFN && !seenCorrection) {
            for (Edge e : connections) {
                if (e.getPoster() == this) {
                    e.getFollower().setSeenFN(true);
                }
            }
        }
    }

    private void postCorrection() {
        if (seenCorrection) {
            for (Edge e : connections) {
                if (e.getPoster() == this) {
                    e.getFollower().setSeenCorrection(true);
                }
            }
        }

    }

    public void post() {

        //Random rand = new Random();

    }
}
