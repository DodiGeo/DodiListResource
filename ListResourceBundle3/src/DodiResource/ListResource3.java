package DodiResource;
import java.util.ResourceBundle;
public class ListResource3 {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("dodi.properties");
		String greeting = bundle.getString("greeting");
		String farewell = bundle.getString("farewell");
		String gratitude = bundle.getString("gratitude");
		
		System.out.println(greeting);
		System.out.println(farewell);
		System.out.println(gratitude);

	}

}
