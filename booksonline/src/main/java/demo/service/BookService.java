package demo.service;

import java.util.List;

import demo.domain.Book;
import demo.util.Page;

public interface BookService {
	public void addBook(Book book);
	public void updateBook(Book book);
	public void deleteBook(int id);
	public Book getBook(int id);
	public List<Book> getAllBooks();
	public List<Book> getBooksByPage(Page page);
	public int getBooksAccount();
}
