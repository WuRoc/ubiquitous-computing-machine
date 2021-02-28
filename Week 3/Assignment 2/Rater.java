
/**
 * Rater is an interface for PlainRater and EfficientRater classes.
 * 
 * @ WuHepeng
 * @ Version: 1.0 (February 19, 2021)
 */

import java.util.*;

public interface Rater {
    public void addRating(String item, double rating);

    public boolean hasRating(String item);

    public String getID();

    public double getRating(String item);

    public int numRatings();

    public ArrayList<String> getItemsRated();
}
