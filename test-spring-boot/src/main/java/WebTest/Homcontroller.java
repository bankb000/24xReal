package WebTest;

import WebTest.Repository.ExhibitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by bankza514 on 12/27/2016.
 */


@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Homcontroller {

    @RequestMapping("/")
    String home() {
        return "index";
    }asdfasdf

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Homcontroller.class, args);
    }

}
