package birthday.message;


import birthday.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.config.ConfigDataLocationNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;

@RequiredArgsConstructor
@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public List<Message> getList(){
        return this.messageRepository.findAll();
    }

    public Message getMessage(Integer id) {
        Optional<Message> message = this.messageRepository.findById(id);

        if (message.isPresent()) {
            return message.get();
        } else {
            throw new DataNotFoundException("메세지 not found");
        }
    }

}
