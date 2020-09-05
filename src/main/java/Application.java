import com.georve.service.SpeakerService;
import com.georve.service.SpeakerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class Application {

    public static void main(String args[]){

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service=context.getBean("SpeakerService",SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstname());
    }
}
