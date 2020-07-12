package com.authorandbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.authorandbook.model.Author;
import com.authorandbook.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService autHorService;
	
	@PostMapping("/save")
	@ResponseBody
	public void saveAuthor(Author author) {
		autHorService.saveAuthor(author);
	}
	
	@PostMapping("/update/{id}")
	@ResponseBody
	public void updateAuthor(Author author,@PathVariable("id") int id) {
		autHorService.updateAuthor(author, id);
	}
	
	@PostMapping("/delete/{id}")
	@ResponseBody
	public void deleteAuthor(@PathVariable ("id")int id) {
		autHorService.deleteAuthor(id);
	}
	
	@GetMapping("/search/{id}")
	@ResponseBody
	public Author findByAuthorId(@PathVariable("id") int id) {
		return autHorService.findByAuthorId(id);
	}
	
	@GetMapping("/search/all")
	public List<Author> getAll(){
		return autHorService.getAll();
	}
}
