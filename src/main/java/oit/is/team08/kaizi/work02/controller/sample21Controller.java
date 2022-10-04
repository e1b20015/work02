package oit.is.team08.kaizi.work02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * sample21Controller
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
@Controller
public class sample21Controller {

  /**
   * work02part1というGETリクエストがあったら work02part1()を呼び出し，work02part1.htmlを返す
   */
  @GetMapping("/sample21")
  public String sample21() {
    return "sample21.html";
  }

  

}
