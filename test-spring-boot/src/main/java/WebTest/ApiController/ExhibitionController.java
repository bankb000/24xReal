package WebTest.ApiController;

import WebTest.Exhibition;
import WebTest.Repository.ExhibitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bankza514 on 1/27/2017.
 */

@RestController
@RequestMapping("/api/exhibition")
@Transactional(readOnly = false, rollbackFor = Exception.class,isolation = Isolation.READ_COMMITTED)
public class ExhibitionController {

    private ExhibitionRepository exhibitionRepository;

    @Autowired
    public ExhibitionController(ExhibitionRepository exhibitionRepository){
        this.exhibitionRepository = exhibitionRepository;
    }

    @RequestMapping(value = "id", method = RequestMethod.GET)
    public Exhibition getExhibitionId(@PathVariable int exhibitionId){
        return exhibitionRepository.get(exhibitionId);
    }
}
