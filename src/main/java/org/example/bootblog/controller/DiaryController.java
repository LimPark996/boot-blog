package org.example.bootblog.controller;

import org.example.bootblog.model.dto.DiaryForm;
import org.example.bootblog.service.DiaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Spring Context
@RequestMapping("/diary")
public class DiaryController {
    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("message", "리스트임다");
        model.addAttribute("list", diaryService.getAllDiaryList());
        return "diary/list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("message", "폼임다");
        model.addAttribute("form", new DiaryForm("", ""));
        return "diary/form";
    }
}
