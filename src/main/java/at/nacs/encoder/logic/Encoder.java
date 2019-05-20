package at.nacs.encoder.logic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class Encoder {

  private final MorceClient morceClient;


  public String post(String message) {
    return Stream.of(message.split(""))
                 .filter(e -> !e.equals(" "))
                 .map(e -> getString(e))
                 .collect(Collectors.joining(""));
  }

  private String getString(String e) {
    return morceClient.post(e);
  }
}
