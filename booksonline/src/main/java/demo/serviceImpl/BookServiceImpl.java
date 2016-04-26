package demo.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import demo.domain.Book;
import demo.mapper.BookMapper;
import demo.service.BookService;
import demo.util.Page;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public void addBook(Book book) {
		bookMapper.insertBook(book);

	}

	@Override
	public void updateBook(Book book) {
		bookMapper.updateBook(book);

	}

	@Override
	public void deleteBook(int id) {
		bookMapper.deleteBook(id);

	}

	@Override
	public Book getBook(int id) {
		return bookMapper.getBook(id);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookMapper.getAllBooks();
	}

	@Override 
	public List<Book> getBooksByPage(Page page) {
		int offset=page.getBeginIndex();
		int limit=page.getEveryPage();
		RowBounds rowBounds=new RowBounds(offset, limit);
		return bookMapper.getBooksByPage(rowBounds);
	}

	@Override
	public int getBooksAccount() {
		return bookMapper.getBooksAccount();
	}
	
	
}
