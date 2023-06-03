package docterservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import doctorservice.entity.DoctorServiceEntity;
import doctorservice.repository.DoctorServiceRepository;

@RestController
@RequestMapping("rest/server")
public class DoctorServiceController {
	@Autowired
	private DoctorServiceRepository docrepo;
	
	@PostMapping("/register")
	public ResponseEntity<DoctorServiceEntity> creates (@RequestBody DoctorServiceEntity doctor){
		return  new ResponseEntity<>(docrepo.save(doctor), HttpStatus.CREATED);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<?>> getAll(){
		List<DoctorServiceEntity> a = docrepo.findAll();
		return ResponseEntity.ok().body(a);
	}
	
	@GetMapping("/docter/{id}")
	public ResponseEntity<?> getid(@PathVariable Long id){
		Optional<DoctorServiceEntity> op1=docrepo.findById(id);
		if(op1.isPresent()) {
			return ResponseEntity.ok().body(docrepo.findById(id));
		}
		else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
	}
	
	
	
	
	
	
	

}
