# API



### 接口 Rater

* ```text
  public interface Rater
  ```
* * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `void` | [`addRating`](Rater.html#addRating-java.lang.String-double-)`(java.lang.String item, double rating)`  |
    | `java.lang.String` | [`getID`](Rater.html#getID--)`()`  |
    | `java.util.ArrayList<java.lang.String>` | [`getItemsRated`](Rater.html#getItemsRated--)`()`  |
    | `double` | [`getRating`](Rater.html#getRating-java.lang.String-)`(java.lang.String item)`  |
    | `boolean` | [`hasRating`](Rater.html#hasRating-java.lang.String-)`(java.lang.String item)`  |
    | `int` | [`numRatings`](Rater.html#numRatings--)`()`  |
* * **方法详细资料**
    * **addRating**

      ```text
      void addRating(java.lang.String item,
                     double rating)
      ```

    * **getID**

      ```text
      java.lang.String getID()
      ```

    * **getItemsRated**

      ```text
      java.util.ArrayList<java.lang.String> getItemsRated()
      ```

    * **getRating**

      ```text
      double getRating(java.lang.String item)
      ```

    * **hasRating**

      ```text
      boolean hasRating(java.lang.String item)
      ```

    * **numRatings**

      ```text
      int numRatings()
      ```



### 

### 类 Rating

* java.lang.Object
* * Rating
* 所有已实现的接口:java.lang.Comparable&lt;[Rating](Rating.html)&gt;

  ```text
  public class Rating
  extends java.lang.Object
  implements java.lang.Comparable<Rating>
  ```

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`Rating`](Rating.html#Rating-java.lang.String-double-)`(java.lang.String anItem, double aValue)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    |  |  |
    |  |  |
    | 限定符和类型 | 方法和说明 |
    | `int` | [`compareTo`](Rating.html#compareTo-Rating-)`(`[`Rating`](Rating.html) `other)`  |
    | `java.lang.String` | [`getItem`](Rating.html#getItem--)`()`  |
    | `double` | [`getValue`](Rating.html#getValue--)`()`  |
    | `java.lang.String` | [`toString`](Rating.html#toString--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
* * **构造器详细资料**
    * **Rating**

      ```text
      public Rating(java.lang.String anItem,
                    double aValue)
      ```
  * **方法详细资料**
    * **compareTo**

      ```text
      public int compareTo(Rating other)
      ```

      指定者:`compareTo` 在接口中 `java.lang.Comparable<`[`Rating`](Rating.html)`>`

    * **getItem**

      ```text
      public java.lang.String getItem()
      ```

    * **getValue**

      ```text
      public double getValue()
      ```

    * **toString**

      ```text
      public java.lang.String toString()
      ```

      覆盖:`toString` 在类中 `java.lang.Object`

### 类 PlainRater

* java.lang.Object
* * PlainRater
* 所有已实现的接口:Rater

  ```text
  public class PlainRater
  extends java.lang.Object
  implements Rater
  ```

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`PlainRater`](PlainRater.html#PlainRater-java.lang.String-)`(java.lang.String id)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `void` | [`addRating`](PlainRater.html#addRating-java.lang.String-double-)`(java.lang.String item, double rating)`  |
    | `java.lang.String` | [`getID`](PlainRater.html#getID--)`()`  |
    | `java.util.ArrayList<java.lang.String>` | [`getItemsRated`](PlainRater.html#getItemsRated--)`()`  |
    | `double` | [`getRating`](PlainRater.html#getRating-java.lang.String-)`(java.lang.String item)`  |
    | `boolean` | [`hasRating`](PlainRater.html#hasRating-java.lang.String-)`(java.lang.String item)`  |
    | `int` | [`numRatings`](PlainRater.html#numRatings--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **PlainRater**

      ```text
      public PlainRater(java.lang.String id)
      ```
  * **方法详细资料**
    * **addRating**

      ```text
      public void addRating(java.lang.String item,
                            double rating)
      ```

      指定者:`addRating` 在接口中 `Rater`

    * **getID**

      ```text
      public java.lang.String getID()
      ```

      指定者:`getID` 在接口中 `Rater`

    * **getItemsRated**

      ```text
      public java.util.ArrayList<java.lang.String> getItemsRated()
      ```

      指定者:`getItemsRated` 在接口中 `Rater`

    * **getRating**

      ```text
      public double getRating(java.lang.String item)
      ```

      指定者:`getRating` 在接口中 `Rater`

    * **hasRating**

      ```text
      public boolean hasRating(java.lang.String item)
      ```

      指定者:`hasRating` 在接口中 `Rater`

    * **numRatings**

      ```text
      public int numRatings()
      ```

      指定者:`numRatings` 在接口中 `Rater`



### 类 EfficientRater

* java.lang.Object
* * EfficientRater
* 所有已实现的接口:Rater

  ```text
  public class EfficientRater
  extends java.lang.Object
  implements Rater
  ```

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`EfficientRater`](EfficientRater.html#EfficientRater-java.lang.String-)`(java.lang.String id)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    |  |  |
    |  |  |
    | 限定符和类型 | 方法和说明 |
    | `void` | [`addRating`](EfficientRater.html#addRating-java.lang.String-double-)`(java.lang.String item, double rating)`  |
    | `java.lang.String` | [`getID`](EfficientRater.html#getID--)`()`  |
    | `java.util.ArrayList<java.lang.String>` | [`getItemsRated`](EfficientRater.html#getItemsRated--)`()`  |
    | `double` | [`getRating`](EfficientRater.html#getRating-java.lang.String-)`(java.lang.String item)`  |
    | `boolean` | [`hasRating`](EfficientRater.html#hasRating-java.lang.String-)`(java.lang.String item)`  |
    | `int` | [`numRatings`](EfficientRater.html#numRatings--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **EfficientRater**

      ```text
      public EfficientRater(java.lang.String id)
      ```
  * **方法详细资料**
    * **addRating**

      ```text
      public void addRating(java.lang.String item,
                            double rating)
      ```

      指定者:`addRating` 在接口中 `Rater`

    * **getID**

      ```text
      public java.lang.String getID()
      ```

      指定者:`getID` 在接口中 `Rater`

    * **getItemsRated**

      ```text
      public java.util.ArrayList<java.lang.String> getItemsRated()
      ```

      指定者:`getItemsRated` 在接口中 `Rater`

    * **getRating**

      ```text
      public double getRating(java.lang.String item)
      ```

      指定者:`getRating` 在接口中 `Rater`

    * **hasRating**

      ```text
      public boolean hasRating(java.lang.String item)
      ```

      指定者:`hasRating` 在接口中 `Rater`

    * **numRatings**

      ```text
      public int numRatings()
      ```

      指定者:`numRatings` 在接口中 `Rater`



### 类 FirstRatings

* java.lang.Object
* * FirstRatings
* ```text
  public class FirstRatings
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`FirstRatings`](FirstRatings.html#FirstRatings--)`()`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `java.util.ArrayList<Movie>` | [`loadMovies`](FirstRatings.html#loadMovies-java.lang.String-)`(java.lang.String filename)`  |
    | `java.util.ArrayList<Rater>` | [`loadRaters`](FirstRatings.html#loadRaters-java.lang.String-)`(java.lang.String filename)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **FirstRatings**

      ```text
      public FirstRatings()
      ```
  * **方法详细资料**
    * **loadMovies**

      ```text
      public java.util.ArrayList<Movie> loadMovies(java.lang.String filename)
      ```

    * **loadRaters**

      ```text
      public java.util.ArrayList<Rater> loadRaters(java.lang.String filename)
      ```



### 

### 类 Movie

* java.lang.Object
* * Movie
* ```text
  public class Movie
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`Movie`](Movie.html#Movie-java.lang.String-java.lang.String-java.lang.String-java.lang.String-)`(java.lang.String anID, java.lang.String aTitle, java.lang.String aYear, java.lang.String theGenres)`  |
    | [`Movie`](Movie.html#Movie-java.lang.String-java.lang.String-java.lang.String-java.lang.String-java.lang.String-java.lang.String-java.lang.String-int-)`(java.lang.String anID, java.lang.String aTitle, java.lang.String aYear, java.lang.String theGenres, java.lang.String aDirector, java.lang.String aCountry, java.lang.String aPoster, int theMinutes)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `java.lang.String` | [`getCountry`](Movie.html#getCountry--)`()`  |
    | `java.lang.String` | [`getDirector`](Movie.html#getDirector--)`()`  |
    | `java.lang.String` | [`getGenres`](Movie.html#getGenres--)`()`  |
    | `java.lang.String` | [`getID`](Movie.html#getID--)`()`  |
    | `int` | [`getMinutes`](Movie.html#getMinutes--)`()`  |
    | `java.lang.String` | [`getPoster`](Movie.html#getPoster--)`()`  |
    | `java.lang.String` | [`getTitle`](Movie.html#getTitle--)`()`  |
    | `int` | [`getYear`](Movie.html#getYear--)`()`  |
    | `java.lang.String` | [`toString`](Movie.html#toString--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
* * **构造器详细资料**
    * **Movie**

      ```text
      public Movie(java.lang.String anID,
                   java.lang.String aTitle,
                   java.lang.String aYear,
                   java.lang.String theGenres)
      ```

    * **Movie**

      ```text
      public Movie(java.lang.String anID,
                   java.lang.String aTitle,
                   java.lang.String aYear,
                   java.lang.String theGenres,
                   java.lang.String aDirector,
                   java.lang.String aCountry,
                   java.lang.String aPoster,
                   int theMinutes)
      ```
  * **方法详细资料**
    * **getCountry**

      ```text
      public java.lang.String getCountry()
      ```

    * **getDirector**

      ```text
      public java.lang.String getDirector()
      ```

    * **getGenres**

      ```text
      public java.lang.String getGenres()
      ```

    * **getID**

      ```text
      public java.lang.String getID()
      ```

    * **getMinutes**

      ```text
      public int getMinutes()
      ```

    * **getPoster**

      ```text
      public java.lang.String getPoster()
      ```

    * **getTitle**

      ```text
      public java.lang.String getTitle()
      ```

    * **getYear**

      ```text
      public int getYear()
      ```

    * **toString**

      ```text
      public java.lang.String toString()
      ```

      覆盖:`toString` 在类中 `java.lang.Object`

### 类 MovieDatabase

* java.lang.Object
* * MovieDatabase
* ```text
  public class MovieDatabase
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`MovieDatabase`](MovieDatabase.html#MovieDatabase--)`()`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `static boolean` | [`containsID`](MovieDatabase.html#containsID-java.lang.String-)`(java.lang.String id)`  |
    | `static java.util.ArrayList<java.lang.String>` | [`filterBy`](MovieDatabase.html#filterBy-Filter-)`(Filter f)`  |
    | `static java.lang.String` | [`getCountry`](MovieDatabase.html#getCountry-java.lang.String-)`(java.lang.String id)`  |
    | `static java.lang.String` | [`getDirector`](MovieDatabase.html#getDirector-java.lang.String-)`(java.lang.String id)`  |
    | `static java.lang.String` | [`getGenres`](MovieDatabase.html#getGenres-java.lang.String-)`(java.lang.String id)`  |
    | `static int` | [`getMinutes`](MovieDatabase.html#getMinutes-java.lang.String-)`(java.lang.String id)`  |
    | `static Movie` | [`getMovie`](MovieDatabase.html#getMovie-java.lang.String-)`(java.lang.String id)`  |
    | `static java.lang.String` | [`getPoster`](MovieDatabase.html#getPoster-java.lang.String-)`(java.lang.String id)`  |
    | `static java.lang.String` | [`getTitle`](MovieDatabase.html#getTitle-java.lang.String-)`(java.lang.String id)`  |
    | `static int` | [`getYear`](MovieDatabase.html#getYear-java.lang.String-)`(java.lang.String id)`  |
    | `static void` | [`initialize`](MovieDatabase.html#initialize-java.lang.String-)`(java.lang.String moviefile)`  |
    | `static int` | [`size`](MovieDatabase.html#size--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **MovieDatabase**

      ```text
      public MovieDatabase()
      ```
  * **方法详细资料**
    * **containsID**

      ```text
      public static boolean containsID(java.lang.String id)
      ```

    * **filterBy**

      ```text
      public static java.util.ArrayList<java.lang.String> filterBy(Filter f)
      ```

    * **getCountry**

      ```text
      public static java.lang.String getCountry(java.lang.String id)
      ```

    * **getDirector**

      ```text
      public static java.lang.String getDirector(java.lang.String id)
      ```

    * **getGenres**

      ```text
      public static java.lang.String getGenres(java.lang.String id)
      ```

    * **getMinutes**

      ```text
      public static int getMinutes(java.lang.String id)
      ```

    * **getMovie**

      ```text
      public static Movie getMovie(java.lang.String id)
      ```

    * **getPoster**

      ```text
      public static java.lang.String getPoster(java.lang.String id)
      ```

    * **getTitle**

      ```text
      public static java.lang.String getTitle(java.lang.String id)
      ```

    * **getYear**

      ```text
      public static int getYear(java.lang.String id)
      ```

    * **initialize**

      ```text
      public static void initialize(java.lang.String moviefile)
      ```

    * **size\[Show source in BlueJ\]**

      ```text
      public static int size()
      ```



### 类 SecondRatings

* java.lang.Object
* * SecondRatings
* ```text
  public class SecondRatings
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`SecondRatings`](SecondRatings.html#SecondRatings--)`()`  |
    | [`SecondRatings`](SecondRatings.html#SecondRatings-java.lang.String-java.lang.String-)`(java.lang.String moviefile, java.lang.String ratingsfile)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `java.util.ArrayList<Rating>` | [`getAverageRatings`](SecondRatings.html#getAverageRatings-int-)`(int minimalRaters)`  |
    | `java.lang.String` | [`getID`](SecondRatings.html#getID-java.lang.String-)`(java.lang.String title)`  |
    | `int` | [`getMovieSize`](SecondRatings.html#getMovieSize--)`()`  |
    | `int` | [`getRaterSize`](SecondRatings.html#getRaterSize--)`()`  |
    | `java.lang.String` | [`getTitle`](SecondRatings.html#getTitle-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **SecondRatings**

      ```text
      public SecondRatings()
      ```

    * **SecondRatings**

      ```text
      public SecondRatings(java.lang.String moviefile,
                           java.lang.String ratingsfile)
      ```
  * **方法详细资料**
    * **getAverageRatings**

      ```text
      public java.util.ArrayList<Rating> getAverageRatings(int minimalRaters)
      ```

    * **getID**

      ```text
      public java.lang.String getID(java.lang.String title)
      ```

    * **getMovieSize**

      ```text
      public int getMovieSize()
      ```

    * **getRaterSize**

      ```text
      public int getRaterSize()
      ```

    * **getTitle**

      ```text
      public java.lang.String getTitle(java.lang.String id)
      ```



### 类 ThirdRatings

* java.lang.Object
* * ThirdRatings
* ```text
  public class ThirdRatings
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`ThirdRatings`](ThirdRatings.html#ThirdRatings--)`()`  |
    | [`ThirdRatings`](ThirdRatings.html#ThirdRatings-java.lang.String-)`(java.lang.String ratingsfile)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `java.util.ArrayList<Rating>` | [`getAverageRatings`](ThirdRatings.html#getAverageRatings-int-)`(int minimalRaters)`  |
    | `java.util.ArrayList<Rating>` | [`getAverageRatingsByFilter`](ThirdRatings.html#getAverageRatingsByFilter-int-Filter-)`(int minimalRaters, Filter filterCriteria)`  |
    | `int` | [`getRaterSize`](ThirdRatings.html#getRaterSize--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **ThirdRatings**

      ```text
      public ThirdRatings()
      ```

    * **ThirdRatings**

      ```text
      public ThirdRatings(java.lang.String ratingsfile)
      ```
  * **方法详细资料**
    * **getAverageRatings**

      ```text
      public java.util.ArrayList<Rating> getAverageRatings(int minimalRaters)
      ```

    * **getAverageRatingsByFilter**

      ```text
      public java.util.ArrayList<Rating> getAverageRatingsByFilter(int minimalRaters,
                                                                   Filter filterCriteria)
      ```

    * **getRaterSize**

      ```text
      public int getRaterSize()
      ```



### 类 MovieRunnerAverage

* java.lang.Object
* * MovieRunnerAverage
* ```text
  public class MovieRunnerAverage
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`MovieRunnerAverage`](MovieRunnerAverage.html#MovieRunnerAverage--)`()`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    |  |  |
    |  |  |
    | 限定符和类型 | 方法和说明 |
    | `void` | [`getAverageRatingOneMovie`](MovieRunnerAverage.html#getAverageRatingOneMovie--)`()`  |
    | `void` | [`printAverageRatings`](MovieRunnerAverage.html#printAverageRatings--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **MovieRunnerAverage**

      ```text
      public MovieRunnerAverage()
      ```
  * **方法详细资料**
    * **getAverageRatingOneMovie**

      ```text
      public void getAverageRatingOneMovie()
      ```

    * **printAverageRatings**

      ```text
      public void printAverageRatings()
      ```





### 接口 Filter

* ```text
  public interface Filter
  ```
* * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](Filter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |
* * **方法详细资料**
    * **satisfies**

      ```text
      boolean satisfies(java.lang.String id)
      ```



### 

### 类 MinutesFilter

* java.lang.Object
* * MinutesFilter
* 所有已实现的接口:Filter

  ```text
  public class MinutesFilter
  extends java.lang.Object
  implements Filter
  ```

  MinutesFilter can be used to extract movies with length in between minimum and maximum specified minutes specified in the method parameter. 得到符合条件的电影

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`MinutesFilter`](MinutesFilter.html#MinutesFilter-int-int-)`(int min, int max)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](MinutesFilter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **MinutesFilter**

      ```text
      public MinutesFilter(int min,
                           int max)
      ```
  * **方法详细资料**
    * **satisfies**

      ```text
      public boolean satisfies(java.lang.String id)
      ```

      指定者:`satisfies` 在接口中 `Filter`





\`\`

### 类 TrueFilter

* java.lang.Object
* * TrueFilter
* 所有已实现的接口:Filter

  ```text
  public class TrueFilter
  extends java.lang.Object
  implements Filter
  ```

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`TrueFilter`](TrueFilter.html#TrueFilter--)`()`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](TrueFilter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **TrueFilter**

      ```text
      public TrueFilter()
      ```
  * **方法详细资料**
    * **satisfies**

      ```text
      public boolean satisfies(java.lang.String id)
      ```

      指定者:`satisfies` 在接口中 `Filter`

\`\`

### 类 GenreFilter

* java.lang.Object
* * GenreFilter
* 所有已实现的接口:Filter

  ```text
  public class GenreFilter
  extends java.lang.Object
  implements Filter
  ```

  GenreFilter can be used to extract movies in specified genre in the method parameter.

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`GenreFilter`](GenreFilter.html#GenreFilter-java.lang.String-)`(java.lang.String genre)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](GenreFilter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **GenreFilter**

      ```text
      public GenreFilter(java.lang.String genre)
      ```
  * **方法详细资料**
    * **satisfies**

      ```text
      public boolean satisfies(java.lang.String id)
      ```

      指定者:`satisfies` 在接口中 `Filter`

\`\`

### 类 YearAfterFilter

* java.lang.Object
* * YearAfterFilter
* 所有已实现的接口:Filter

  ```text
  public class YearAfterFilter
  extends java.lang.Object
  implements Filter
  ```

  YearAfterFilter can be used to extract only movies released after a particular year specified in the method parameter.

* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`YearAfterFilter`](YearAfterFilter.html#YearAfterFilter-int-)`(int year)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](YearAfterFilter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **YearAfterFilter**

      ```text
      public YearAfterFilter(int year)
      ```
  * **方法详细资料**
    * **satisfies**

      ```text
      public boolean satisfies(java.lang.String id)
      ```

      指定者:`satisfies` 在接口中 `Filter`

\`\`

\`\`

### 类 AllFilters

* java.lang.Object
* * AllFilters
* 所有已实现的接口:Filter

  ```text
  public class AllFilters
  extends java.lang.Object
  implements Filter
  ```

* * **字段概要**

    | 字段 |  |
    | :--- | :--- |
    | 限定符和类型 | 字段和说明 |
    | `(专用程序包) java.util.ArrayList<Filter>` | [`filters`](AllFilters.html#filters)  |

  * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`AllFilters`](AllFilters.html#AllFilters--)`()`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `void` | [`addFilter`](AllFilters.html#addFilter-Filter-)`(Filter f)`  |
    | `boolean` | [`satisfies`](AllFilters.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **字段详细资料**
    * **filters**

      ```text
      java.util.ArrayList<Filter> filters
      ```
  * **构造器详细资料**
    * **AllFilters**

      ```text
      public AllFilters()
      ```
  * **方法详细资料**//判断该movive的id是否符合条件
    * **addFilter**

      ```text
      public void addFilter(Filter f)
      ```

    * **satisfies**

      ```text
      public boolean satisfies(java.lang.String id)
      ```

      指定者:`satisfies` 在接口中 `Filter`

\`\`

### 类 DirectorsFilter

* java.lang.Object
* * DirectorsFilter
* 所有已实现的接口:Filter

  ```text
  public class DirectorsFilter
  extends java.lang.Object
  implements Filter
  ```

* * **字段概要**

    | 字段 |  |
    | :--- | :--- |
    | 限定符和类型 | 字段和说明 |
    | `(专用程序包) java.lang.String` | [`directorsList`](DirectorsFilter.html#directorsList)  |

  * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`DirectorsFilter`](DirectorsFilter.html#DirectorsFilter-java.lang.String-)`(java.lang.String directors)`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    |  |  |
    |  |  |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](DirectorsFilter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **字段详细资料**
    * **directorsList**

      ```text
      java.lang.String directorsList
      ```
  * **构造器详细资料**
    * **DirectorsFilter**

      ```text
      public DirectorsFilter(java.lang.String directors)
      ```
  * **方法详细资料**
    * **satisfies**

      ```text
      public boolean satisfies(java.lang.String id)
      ```

      指定者:`satisfies` 在接口中 `Filter`

\`\`

### 类 MovieRunnerWithFilters

* java.lang.Object
* * MovieRunnerWithFilters
* ```text
  public class MovieRunnerWithFilters
  extends java.lang.Object
  ```
* * **构造器概要**

    | 构造器 |
    | :--- |
    | 构造器和说明 |
    | [`MovieRunnerWithFilters`](MovieRunnerWithFilters.html#MovieRunnerWithFilters--)`()`  |

  * **方法概要**

    | 所有方法 |  |
    | :--- | :--- |
    | 限定符和类型 | 方法和说明 |
    | `void` | [`printAverageRatings`](MovieRunnerWithFilters.html#printAverageRatings--)`()`  |
    | `void` | [`printAverageRatingsByDirectors`](MovieRunnerWithFilters.html#printAverageRatingsByDirectors--)`()`  |
    | `void` | [`printAverageRatingsByDirectorsAndMinutes`](MovieRunnerWithFilters.html#printAverageRatingsByDirectorsAndMinutes--)`()`  |
    | `void` | [`printAverageRatingsByGenre`](MovieRunnerWithFilters.html#printAverageRatingsByGenre--)`()`  |
    | `void` | [`printAverageRatingsByMinutes`](MovieRunnerWithFilters.html#printAverageRatingsByMinutes--)`()`  |
    | `void` | [`printAverageRatingsByYearAfter`](MovieRunnerWithFilters.html#printAverageRatingsByYearAfter--)`()`  |
    | `void` | [`printAverageRatingsByYearAfterAndGenre`](MovieRunnerWithFilters.html#printAverageRatingsByYearAfterAndGenre--)`()`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **MovieRunnerWithFilters**

      ```text
      public MovieRunnerWithFilters()
      ```
  * **方法详细资料**
    * **printAverageRatings**

      ```text
      public void printAverageRatings()
      ```

    * **printAverageRatingsByDirectors**

      ```text
      public void printAverageRatingsByDirectors()
      ```

    * **printAverageRatingsByDirectorsAndMinutes**

      ```text
      public void printAverageRatingsByDirectorsAndMinutes()
      ```

    * **printAverageRatingsByGenre**

      ```text
      public void printAverageRatingsByGenre()
      ```

    * **printAverageRatingsByMinutes**

      ```text
      public void printAverageRatingsByMinutes()
      ```

    * **printAverageRatingsByYearAfter**

      ```text
      public void printAverageRatingsByYearAfter()
      ```

    * **printAverageRatingsByYearAfterAndGenre**

      ```text
      public void printAverageRatingsByYearAfterAndGenre()
      ```

