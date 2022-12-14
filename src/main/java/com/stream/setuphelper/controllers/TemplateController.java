package com.stream.setuphelper.controllers;

import com.stream.setuphelper.models.TemplateEntity;
import com.stream.setuphelper.models.dtos.CreateTemplateDTO;
import com.stream.setuphelper.service.TemplateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TemplateController {

    private TemplateService templateService;

    @ModelAttribute("createTemplateDTO")
    public CreateTemplateDTO initCreateTemplateDTO() {
        return new CreateTemplateDTO();
    }

    @GetMapping("/templates")
    public String templates() {
        return "templates";
    }

    public String getAllTemplates(Model model) {
        List<TemplateEntity> templates = templateService.getAllLocations();

        model.addAttribute("templates", templates);

        return "templates";
    }

                                  @GetMapping("/templates/add")
    public String templatesAdd() {
        return "templates-add";
    }

    @PostMapping("/templates/add")
    public String templatesAdd(@Valid CreateTemplateDTO createTemplateDTO,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("createTemplateDTO", createTemplateDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.createTemplateDTO", bindingResult);

            return "redirect:/templates";
        }

        return "redirect:/";
    }
}
