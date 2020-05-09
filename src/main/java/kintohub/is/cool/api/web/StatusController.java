package kintohub.is.cool.api.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Single;

@Controller("/status")
public class StatusController {

  @Get
  public Single<String> status() {
    return Single.just("Hello, there: " + System.currentTimeMillis());
  }
}
