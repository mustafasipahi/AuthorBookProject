package com.authorandbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.authorandbook.model.Book;
import com.authorandbook.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/save")
	@ResponseBody
	public void saveBook(Book book) {
		bookService.saveBook(book);
	}
	
	@PostMapping("/update/{id}")
	@ResponseBody
	public void updateBook(Book book,@PathVariable("id") int id) {
		bookService.updateBook(book,id);
	}
	
	@PostMapping("/delete/{id}")
	@ResponseBody
	public void deleteBook(@PathVariable("id") int id) {
		bookService.deleteBook(id);
	}
	
	@GetMapping("/search/{id}")
	@ResponseBody
	public Book findByBookId(@PathVariable("id")int id) {
		Book book = bookService.findByBookId(id);
		return book;
	}
	
	@GetMapping("/search/all")
	@ResponseBody
	public List<Book> getAll(){
		List<Book> bookList = bookService.getAll();
		return bookList;
	}
}
