import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("library-config.xml");
        LibraryService service = context.getBean(LibraryService.class);
        service.addBook();
    }
}
