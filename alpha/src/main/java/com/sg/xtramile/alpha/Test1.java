package com.sg.xtramile.alpha;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.sg.xtramile.domain.model.StudentShow;
import com.sg.xtramile.infrastructure.persistence.StudentRepoImp;

@RestController
public class Test1 {

	private StudentRepoImp studentRepo = new StudentRepoImp();
	@RequestMapping("/")
	public ResponseEntity<List<StudentShow>> Test() {
		return ResponseEntity.ok(studentRepo.showall());
	}

}
