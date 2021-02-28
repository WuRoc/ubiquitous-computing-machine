# API



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
    * **MinutesFilter\[Show source in BlueJ\]**

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
    * **TrueFilter\[Show source in BlueJ\]**

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
    |  |  |
    |  |  |
    | 限定符和类型 | 方法和说明 |
    | `boolean` | [`satisfies`](YearAfterFilter.html#satisfies-java.lang.String-)`(java.lang.String id)`  |

    * **从类继承的方法 java.lang.Object**

      `clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
* * **构造器详细资料**
    * **YearAfterFilter\[Show source in BlueJ\]**

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
    * **filters\[Show source in BlueJ\]**

      ```text
      java.util.ArrayList<Filter> filters
      ```
  * **构造器详细资料**
    * **AllFilters\[Show source in BlueJ\]**

      ```text
      public AllFilters()
      ```
  * **方法详细资料**//判断该movive的id是否符合条件
    * **addFilter\[Show source in BlueJ\]**

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
    * **directorsList\[Show source in BlueJ\]**

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

