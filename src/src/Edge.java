public class Edge {
    private Node poster;
    private Node follower;

    public Edge(Node poster, Node follower) {
        this.poster = poster;
        this.follower = follower;
    }

    public Node getPoster() {
        return poster;
    }

    public Node getFollower() {
        return follower;
    }
}
