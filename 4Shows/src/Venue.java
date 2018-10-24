public class Venue extends User {

    private Rating rating;

    Venue (String username, String password, Location location) {
        super(username, password, location);
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void showRequest(Artist artist) {

    }
}
