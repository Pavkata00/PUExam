public class Package {
    private String description;
    private String destination;

    public Package(String description, String destination) {

        this.description = description;
        this.destination = destination;
    }

    public String getDescription() {
        return description;
    }

    public String getDestination() {
        return destination;
    }


}