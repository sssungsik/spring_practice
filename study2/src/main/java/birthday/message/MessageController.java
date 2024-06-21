package birthday.message;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/message")
@RequiredArgsConstructor
@Controller
public class MessageController {

    private final MessageService messageService;


    @GetMapping("/list")
    public String list(Model model){
        List<Message> messageList = this.messageService.getList();
        model.addAttribute("messageList", messageList);

        return "message_list";
    }

    @GetMapping(value = "/detail/{id}")
    public String detail(Model model, @PathVariable("id") Integer id) {

        Message message = this.messageService.getMessage(id);
        model.addAttribute("message", message);
        return "message_detail";

        // @PathVariable : URL 뒤 {id} 값처럼 변하는 값 얻을 때
    }

}
