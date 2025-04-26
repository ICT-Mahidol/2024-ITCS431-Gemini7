package com.example.demo.controller;

import com.example.demo.service.SciencePlanService;
import edu.gemini.app.ocs.model.SciencePlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/scienceplan")
public class SciencePlanController {

    @Autowired
    private SciencePlanService sciencePlanService;

    // Show form for creating Science Plan
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("sciencePlan", new SciencePlan());
        return "create_scienceplan"; // This maps to create_scienceplan.html
    }

    // Handle form submission to create a Science Plan
    @PostMapping("/create")
    public String createSciencePlan(@ModelAttribute SciencePlan sciencePlan) {
        sciencePlanService.createSciencePlan(sciencePlan); // Call the service to create the Science Plan
        return "redirect:/scienceplan/list"; // Redirect to a list page or success page
    }

    // Test the Science Plan
    @GetMapping("/test/{id}")
    public String testSciencePlan(@PathVariable int id, Model model) {
        boolean result = sciencePlanService.testSciencePlan(id); // Call service to test
        model.addAttribute("result", result);
        return "test_result"; // This is the result page
    }

    // Submit the Science Plan
    @PostMapping("/submit/{id}")
    public String submitSciencePlan(@PathVariable int id) {
        sciencePlanService.submitSciencePlan(id); // Call service to submit
        return "redirect:/scienceplan/list"; // Redirect after submission
    }
}
