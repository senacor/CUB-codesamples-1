package senacor.cub.samples.service.article.command.articledetail;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by rwinzing on 08.03.16.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ArticleNotFoundException extends RuntimeException {
}
