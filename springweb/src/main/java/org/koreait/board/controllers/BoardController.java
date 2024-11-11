package org.koreait.board.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/write/{bid}")
    public String view(@PathVariable("bid") String id){
        return "board/write";
    }
    @PostMapping("/write/{bid}")
    public String viewPs(@PathVariable("bid") String id){
        return "board/write";
    }
    @GetMapping("/list/{bid}")
    public String list(@PathVariable("bid") String id){
        System.out.printf("bid=%s%n",id);
        return "board/list";
    }

}

