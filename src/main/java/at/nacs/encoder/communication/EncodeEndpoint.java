package at.nacs.encoder.communication;

import at.nacs.encoder.Message;
import at.nacs.encoder.logic.Encoder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encode")
@RequiredArgsConstructor
public class EncodeEndpoint {

  private final Encoder encoder;

  @PostMapping
  String get(@RequestBody String message) {
    return encoder.post(message);

  }
}
