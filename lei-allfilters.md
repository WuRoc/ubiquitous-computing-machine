# 类 AllFilters



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

