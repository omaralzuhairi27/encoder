package at.nacs.encoder.logic;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("morse")
public interface MorceClient {

  @PostMapping("/morse")
  String post(String message);
}
