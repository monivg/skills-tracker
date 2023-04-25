package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping()
    public String displayHomePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h3>We have a few skills we would like to learn. Here is the list!</h3>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorite.</p>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displaySkillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' /><br />" +
                "<label>My favorite language:</label>" +
                "<select name='option1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<label>My second favorite language:</label>" +
                "<select name='option2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<label>My third favorite language:</label>" +
                "<select name='option3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String skillsOutput(@RequestParam String userName, String option1, String option2, String option3) {
        return "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<ol>" +
                "<li>" + option1 + "</li>" +
                "<li>" + option2 + "</li>" +
                "<li>" + option3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
