package birthday.answer;


import birthday.message.Message;
import birthday.message.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {

    private final MessageService messageService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String createAnswer(Model model,
                               @PathVariable("id") Integer id,
                               @RequestParam(value = "content") String content) {
        Message message = this.messageService.getMessage(id);
        this.answerService.create(message, content);
        return String.format("redirect:/message/detail/%s", id);
    }

}
