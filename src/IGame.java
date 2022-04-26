public interface IGame extends Comparable<Game> {

    // constructor args (String title, int year, int rating, int GameID)

    public String getTitle(); // retrieve the title of this game object

    public int getRating(); // retrieve the Steam rating out of 100%

    public int getID(); // retrieve the ID of the game in the Steam URL

    public double getPrice();

    public String getGenre();

    // compareTo() method supports sorting games in descending order by rating

    // toString() prints out ID, genre, rating, price



}