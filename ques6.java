/*Convert an Optional type into Stream
*/
package exe5;
import java.util.*;
public class ques6 {
	public static void main(String[] args) {

		Optional<Integer> op = Optional.of(7819);

		System.out.println("Optional: " + op);
		System.out.println("Getting the Stream:");
		op.stream().filter(e -> e > 7).findFirst().stream().forEach(System.out::print);

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("");
		integerList.stream().filter(e -> e > 5).findFirst().stream().forEach(System.out::println);
	}
}