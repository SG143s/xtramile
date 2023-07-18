package com.sg.xtramile.alpha;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.jackson.JsonComponent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sg.xtramile.domain.model.StudentData;
//import org.springframework.web.bind.annotation.RequestMethod;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.sg.xtramile.domain.model.StudentShow;
import com.sg.xtramile.infrastructure.persistence.StudentRepoImp;

class gets {
	@JsonProperty("id")
	protected String id;
}
@RestController
public class Test1 {

	private StudentRepoImp studentRepo = new StudentRepoImp();
	@GetMapping("/all")
	public ResponseEntity<List<StudentShow>> Test() {
		return ResponseEntity.ok(studentRepo.showall());
	}
	@PostMapping("/create")
	public ResponseEntity<Object> create(@RequestBody StudentData ins) {
		studentRepo.add(ins);
		return ResponseEntity.ok().body(null);
	}
	@PostMapping("/update")
	public ResponseEntity<Object> update(@RequestBody StudentData ins) {
		studentRepo.edit(ins.getID(), ins);
		return ResponseEntity.ok().body(null);
	}
	@PostMapping("/delete")
	public ResponseEntity<Object> update(@RequestBody gets ins) {
		studentRepo.delete(ins.id);
		return ResponseEntity.ok().body(null);
	}
}
