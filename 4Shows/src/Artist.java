public class Artist extends User {

    private Rating rating;

    Artist (String username, String password, Location location) {
        super(username, password, location);
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void showRequest(Venue venue) {

    }


}
