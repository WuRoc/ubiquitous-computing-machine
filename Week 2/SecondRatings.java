
/**
 * SecondRatings class contains various methods to extract information from the corresponding
 * ArrayLists.
 *
 */

import java.util.*;

public class SecondRatings {
    private ArrayList<Movie> myMovies;
    private ArrayList<Rater> myRaters;
    
    public SecondRatings() {
        // default constructor
        this("ratedmoviesfull.csv", "ratings.csv");
    }
    
    public SecondRatings (String moviefile, String ratingsfile) {
        FirstRatings firstRatings = new FirstRatings ();
        myMovies = firstRatings.loadMovies(moviefile);
        //得到的是
        myRaters = firstRatings.loadRaters(ratingsfile);
    }
    
    public int getMovieSize () {
        return myMovies.size();
    }
    
    public int getRaterSize () {
        return myRaters.size();
    }
    
    private double getAverageByID (String id, int minimalRaters) {
        double sum = 0.0;
        int count = 0;
       
        for (Rater rater : myRaters) {
            //如果id与moiveId的值相等就累加
            if (rater.hasRating(id)) {
                //得到这部电影的评分
                sum += rater.getRating(id);
                //这部电影共有多少个评分
                count++;
            }
        }
        //超过20个才计算这部电影的平均分
        if (count >= minimalRaters) {
            //返回这部电影的平均分
            return sum / count;
        } else {
            return 0.0;
        }
    }
    //算出每种电影评分的平均值，然后加入list
    public ArrayList<Rating> getAverageRatings (int minimalRaters) {
        ArrayList<Rating> averageRatings = new ArrayList<Rating> ();
        //得到movie对象
        for (Movie movie : myMovies) {
            //调用movie类的getID()方法
            String movieID = movie.getID();
            //double average = Math.round(getAverageByID(movieID, minimalRaters) * 100.0) / 100.0;
            //根据moiveID得到平均分
            double average = getAverageByID(movieID, minimalRaters);
            if (average != 0.0) {
                Rating rating = new Rating (movieID, average);
                //将每部电影的平均分加入list
                averageRatings.add(rating);
            }
        }
        
        return averageRatings;
    }
    
    public String getTitle (String id) {
        String title = null;
        
        for (Movie movie : myMovies) {
            if (movie.getID().equals(id)) {
                title = movie.getTitle();
            }
        }
        
        if (title != null) {
            return title;
        } else {
            return "No movie with such ID was found.";
        }
    }
    
    public String getID (String title) {
        String movieID = null;
        
        for (Movie movie : myMovies) {
            if (movie.getTitle().equals(title)) {
                movieID = movie.getID();
            }
        }
        
        if (movieID != null) {
            return movieID;
        } else {
            return "NO SUCH TITLE.";
        }
    }
    
    
}
