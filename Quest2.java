/*Perform takeWhile and dropWhile operations on stream
*/
package exe5;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
public class Quest2 {
    public static void main(String[] args) {
 
        System.out.println(IntStream
                .rangeClosed(1,10)
                .takeWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));
 
        System.out.println(IntStream
                .rangeClosed(1,10)
                .dropWhile(x->x<=5)
                .boxed()
                .collect(Collectors.toList()));
    }
}