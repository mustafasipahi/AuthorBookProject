package com.authorandbook.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;import com.authorandbook.model.Book;
import com.authorandbook.service.AdminAuthorService;
import com.authorandbook.service.AdminBookService;
import com.authorandbook.service.AuthorService;
import com.authorandbook.service.BookService;

@Component
public class Console implements CommandLineRunner{

//	@Autowired
//	private AdminBookService adminBookService;
	
//	@Autowired
//	private AdminAuthorService adminAuthorService;
	
//	@Autowired
//	private AuthorService authorService;
	
	@Autowired
	private BookService bookService;
	
	@Override
	public void run(String... args) throws Exception {

		
		Book book2 = new Book();
		book2.setId(1);
		book2.setBookName("MongoDenemeName1");
		book2.setBookAuthor("MongoDenemeAuthor1");
		
		bookService.saveBook(book2);
		
		Book book3 = new Book();
		book3.setId(2);
		book3.setBookName("MongoDenemeName2");
		book3.setBookAuthor("MongoDenemeAuthor2");
		
		bookService.saveBook(book3);
		
		List<Book> bookList = bookService.getAll();
		
		for(Book oneBook : bookList) {
			System.out.println(oneBook);
		}
	}
}
