# 类 MinutesFilter

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
    |  |  |
    |  |  |
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

