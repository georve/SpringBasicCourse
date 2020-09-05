import com.georve.repository.HibernateSpeakerRepositoryImp;
import com.georve.repository.SpeakerRepository;
import com.georve.service.SpeakerService;
import com.georve.service.SpeakerServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="SpeakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImp();
    }


    @Bean(name="SpeakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImp sp=new SpeakerServiceImp(this.getSpeakerRepository());
        return sp;

    }
}
