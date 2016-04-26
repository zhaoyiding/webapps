package demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import demo.domain.Book;

public interface BookMapper {
	
	@Insert("insert into book values(#{id},#{title},#{author},#{price})")
	public int insertBook(Book book);
	
	@Update("update book set title=#{title},author=#{author},price=#{price} "
			+ "where id=#{id}")
	public int updateBook(Book book);
	
	@Delete("delete from book where id=#{id}")
	public int deleteBook(int id);
	
	@Select("select * from book where id=#{id}")
	public Book getBook(int id);
	
	@Select("select * from book")
	public List<Book> getAllBooks();
	
	@Select("select * from book")
	public List<Book> getBooksByPage(RowBounds rowBounds);
	
	@Select("select count(*) from book")
	public int getBooksAccount();
}
