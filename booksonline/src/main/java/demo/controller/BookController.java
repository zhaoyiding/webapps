package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import demo.domain.Book;
import demo.service.BookService;
import demo.util.Page;
import demo.util.PageUtil;
import demo.validator.BookValidator;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = { "/book_list", "/" })
	public String bookList(Model model,@RequestParam(defaultValue="1") int currentPage) {
		int booksAccount=bookService.getBooksAccount();
		Page page=PageUtil.getPage(3, booksAccount, currentPage);
		List<Book> list = bookService.getBooksByPage(page);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		return "list";
	}

	@RequestMapping("/book_detail")
	public String bookDetail(Model model, @RequestParam int id) {
		Book book = bookService.getBook(id);
		model.addAttribute("book", book);
		return "detail";
	}

	@RequestMapping("/book_input")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		return "input";
	}

	@RequestMapping("/book_commit")
	public String commitBook(@ModelAttribute Book book, BindingResult bindingResult, Model model) {
		BookValidator bookValidator = new BookValidator();
		bookValidator.validate(book, bindingResult);

		if (bindingResult.hasErrors()) {
			return "input";
		} else {
			bookService.addBook(book);
			return "redirect:/book_list";
		}

	}
	
	@RequestMapping("/book_delete")
	public String deleteBook(@RequestParam int id) {
		bookService.deleteBook(id);
		return "redirect:/book_list";
	}
	
	@RequestMapping("/book_update")
	public String updateBook(@ModelAttribute Book book) {
		bookService.updateBook(book);
		return "redirect:/book_list";
	}
}
