import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InitialTask {

    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Paths.get(InitialTask.class.getClassLoader().getResource("sample.html").toURI());

        String contents = new String(Files.readAllBytes(path));

        String title =StringUtils.substringBetween(contents, "<title>", "</title>");

        System.out.println(title);
        if(title.equals("India")) {
            System.out.println("5 cities in " + title + " are\n Chennai, Mumbai, Bangalore, Hyderabad, Delhi");
        }
        else if(title.equals("Australia")) {
            System.out.println("5 cities in " + title + " are\n Sydney, Melbourne, Brisbane, Perth, Adelaide");
        }


    }
}
