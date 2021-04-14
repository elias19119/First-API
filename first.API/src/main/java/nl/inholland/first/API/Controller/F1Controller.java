package nl.inholland.first.API.Controller;
import com.sun.media.jfxmedia.Media;
import nl.inholland.first.API.Model.F1;
import nl.inholland.first.API.Service.F1Service;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "cars")
public class F1Controller {

    private F1Service service;
    public F1Controller(F1Service service) {
        this.service = service;
    }
    @RequestMapping(value ="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<F1>> getGuitars() {
        return ResponseEntity.status(200).body(service.getCars());
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<F1> createGuitar(@RequestBody F1 car) {
        service.addcar(car);
        return ResponseEntity.status(201).body(car);
    }
}
