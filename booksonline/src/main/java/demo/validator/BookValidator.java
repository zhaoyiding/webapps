package demo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import demo.domain.Book;
@Component
public class BookValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Book.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Book book=(Book) object;
		ValidationUtils.rejectIfEmpty(errors, "title", "title_empty");
		ValidationUtils.rejectIfEmpty(errors, "author", "author_empty");
		ValidationUtils.rejectIfEmpty(errors, "price", "price_empty");
		if (book.getPrice()<=0) {
			errors.rejectValue("price", "price_negative");
		}

	}

}
