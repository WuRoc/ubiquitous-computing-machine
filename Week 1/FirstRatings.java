
/**
 * loadMovies and loadRaters methods add data from the related csv files into corresponding
 * ArrayLists.
 * 
 * @ Konstantin Krumin
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
            //类型
            String currentGenre = record.get(4);
            //导演
            String currentDirector = record.get(5);
            //分钟
            int currentMinutes = Integer.parseInt(record.get(6));
            //海报
            String currentPoster = record.get(7);
            //新建一个movie的对象引用
            Movie currentMovie = new Movie(currentID, currentTitle, currentYear, currentCountry, currentGenre, currentDirector, currentMinutes, currentPoster);
            //把对象加到ArrayList里
            movieData.add(currentMovie);
        }
        
        return movieData;
    }
    
    // test cases for the file
    public void testLoadMovies () {
        //ArrayList<Movie> movies = loadMovies("ratedmoviesfull");
        ArrayList<Movie> movies = loadMovies("ratedmovies_short");
        System.out.println("Number of movies: " + movies.size());
        
        //String countInGenre = "Comedy"; // variable
        String countInGenre = "Drama";
        int countComedies = 0;
        
        int minutes = 150; // variable
        int countMinutes = 0;
        
        for (Movie movie : movies) {
            //Returns true if and only if this string contains the specified sequence of char values
            if (movie.getGenres().contains(countInGenre)) {
                countComedies +=1;
            }
            
            if (movie.getMinutes() > minutes) {
                countMinutes +=1;
            }
        }
        System.out.println("There are " + countComedies + " comedies in the list");
        System.out.println("There are " + countMinutes + " movies with more than " + minutes + 
        " minutes in the list");
        
        // Create a HashMap with count of how many movies each particular director filmed
        HashMap<String,Integer> countMoviesByDirector = new HashMap<String,Integer> ();
        for (Movie movie : movies) {
            String[] directors = movie.getDirector().split(",");
            
            for (String director : directors ) {
                director = director.trim();
                if (! countMoviesByDirector.containsKey(director)) {
                    countMoviesByDirector.put(director, 1);
                } else {
                    countMoviesByDirector.put(director, countMoviesByDirector.get(director) + 1);
                }
            }
        }
        
        // Count max number of movies directed by a particular director
        int maxNumOfMovies = 0;
        for (String director : countMoviesByDirector.keySet()) {
            if (countMoviesByDirector.get(director) > maxNumOfMovies) {
                maxNumOfMovies = countMoviesByDirector.get(director);
            }
        }
        
        // Create an ArrayList with directors from the list that directed max number of movies
        ArrayList<String> directorsList = new ArrayList<String> ();
        for (String director : countMoviesByDirector.keySet()) {
            if (countMoviesByDirector.get(director) == maxNumOfMovies) {
                directorsList.add(director);
            }
        }
        
        System.out.println("Max number of movies directed by one director: " + maxNumOfMovies);
        System.out.println("Directors who directed that many movies are " + directorsList);
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
            //先用listOfIDs 添加含有rater_id的
            if (! listOfIDs.contains(currentRaterID)) {
                //新建一个Rater的对象，
                Rater currentRater = new Rater(currentRaterID);
                //又把rater对象加入ArrayList中
                ratersData.add(currentRater);
                //添加的还是上面的currentRaterID的对象 myRatings.add(new Rating(item,rating)); item ：currentMovieID
                currentRater.addRating(currentMovieID, currentMovieRating);
            
            } else {
                //如果在rataData里
                for (int k=0; k < ratersData.size(); k++) {
                    if (ratersData.get(k).getID().equals(currentRaterID)) {
                        //增加一个rating的对象
                        ratersData.get(k).addRating(currentMovieID, currentMovieRating);
                    }
                }
            }
            
            listOfIDs.add(currentRaterID);
        }
        
        return ratersData;
    }
    
    // test cases for the file
    public void testLoadRaters () {
        ArrayList<Rater> raters = loadRaters("ratings_short");
        
        System.out.println("Total number of raters: " + raters.size());
        
        HashMap<String, HashMap<String, Double>> hashmap = new HashMap<String, HashMap<String, Double>> ();
        for (Rater rater : raters) {
            HashMap<String, Double> ratings = new HashMap<String, Double> ();
            ArrayList<String> itemsRated = rater.getItemsRated();
            
            for (int i=0; i < itemsRated.size(); i++) {
                String movieID = itemsRated.get(i);
                double movieRating = rater.getRating(movieID);
                
                ratings.put(movieID, movieRating);
            }
            hashmap.put(rater.getID(), ratings);
        }
        
        String raterID = "1"; //rater_id
        //得到一个hashmap对象key： rater_id	value【【hashmap：【key：movie_id	value ：rating】】
        int ratingsSize = hashmap.get(raterID).size();
        System.out.println("Number of ratings for the rater " + raterID + " : " + ratingsSize);
        
        int maxNumOfRatings = 0;
        for (String key : hashmap.keySet()) {
            int currAmountOfRatings = hashmap.get(key).size();
            
            if (currAmountOfRatings > maxNumOfRatings) {
                maxNumOfRatings = currAmountOfRatings;
            }
        }
        //哪个评价者评价的最多
        System.out.println("Maximum number of ratings by any rater : " + maxNumOfRatings);
        
        ArrayList<String> raterWithMaxNumOfRatings = new ArrayList<String> ();
        for (String key : hashmap.keySet()) {
            int currAmountOfRatings = hashmap.get(key).size();
            
            if (maxNumOfRatings == currAmountOfRatings) {
                raterWithMaxNumOfRatings.add(key);
            }
        }
        System.out.println("Rater(s) with the most number of movies rated : " + raterWithMaxNumOfRatings);
        
        String movieID = "1798709";
        int numOfRatings = 0;
        for (String key : hashmap.keySet()) {
            if(hashmap.get(key).containsKey(movieID)) {
                numOfRatings +=1;
            }
        }
        System.out.println("Number of ratings movie " + movieID + " has : " + numOfRatings);
        
        ArrayList<String> uniqueMovies = new ArrayList<String> ();
        for (String key : hashmap.keySet()) {
            for (String currMovieID : hashmap.get(key).keySet()) {
                if (! uniqueMovies.contains(currMovieID)) {
                    uniqueMovies.add(currMovieID);
                }
            }
        }
        System.out.println("Total number of movies that were rated : " + uniqueMovies.size());
    }
}
