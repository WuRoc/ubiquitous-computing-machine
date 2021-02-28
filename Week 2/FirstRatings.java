
/**
 * loadMovies and loadRaters methods add data from the related csv files into corresponding
 * ArrayLists.
 * 
 * @ wuhepeng
 * @ Version: 1.0 (February 14, 2020)
 */

import edu.duke.*;
import java.util.*;
import org.apache.commons.csv.*;

public class FirstRatings {
    public ArrayList<Movie> loadMovies (String filename) {
        ArrayList<Movie> movieData = new ArrayList<Movie> ();

        FileResource fr = new FileResource("data/" + filename + ".csv");
        CSVParser parser = fr.getCSVParser();

        for (CSVRecord record: parser) {
            String currentID = record.get(0);
            String currentTitle = record.get(1);
            String currentYear = record.get(2);
            String currentCountry = record.get(3);
            String currentGenre = record.get(4);
            String currentDirector = record.get(5);
            int currentMinutes = Integer.parseInt(record.get(6));
            String currentPoster = record.get(7);

            Movie currentMovie = new Movie(currentID, currentTitle, currentYear, currentGenre, currentDirector, 
                    currentCountry, currentPoster, currentMinutes);

            movieData.add(currentMovie);
        }

        return movieData;
    }

    public ArrayList<Rater> loadRaters (String filename) {
        ArrayList<Rater> ratersData = new ArrayList<Rater> ();
        ArrayList<String> listOfIDs = new ArrayList<String> ();

        FileResource fr = new FileResource("data/" + filename + ".csv");
        CSVParser parser = fr.getCSVParser();

        for (CSVRecord record : parser) {
            String currentRaterID = record.get(0);
            String currentMovieID = record.get(1);
            double currentMovieRating = Double.parseDouble(record.get(2));

            if (! listOfIDs.contains(currentRaterID)) {
                Rater currentRater = new Rater(currentRaterID);
                ratersData.add(currentRater);
                //这里实际添加一个让rater类里的myRatings属性里的一个新的rating对象
                currentRater.addRating(currentMovieID, currentMovieRating);
            } else {
                //因为list里放的是rater对象所以不可以直接用currentMovieID进行查找
                // for (int k=0; k < ratersData.size(); k++) {
                // if (ratersData.get(k).getID().equals(currentRaterID)) {
                // ratersData.get(k).addRating(currentMovieID, currentMovieRating);
                    // }
                // }
                for(Rater rater : ratersData) {
                    if(rater.getID().equals(currentRaterID)) {
                        //如果还是该电影评分者评分，则加在集合上myRatings
                        rater.addRating(currentMovieID, currentMovieRating);
                    }
                }
            }

            listOfIDs.add(currentRaterID);
        }

        return ratersData;
    }
}
