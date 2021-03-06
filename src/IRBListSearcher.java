import java.util.List;

public interface IRBListSearcher<T extends Comparable<T>> {
    /**
     * Takes a list of IDs to search the tree for
     * Returns a list of games corresponding to the IDs passed
     */
    public List<Game> search(List<Integer> gameList);

    /**
     * Removes the Game corresponding to the ID passed
     */
    public IGame remove(int id);

    /**
     * Returns a String representation of the tree
     */
    public String traversal();

}