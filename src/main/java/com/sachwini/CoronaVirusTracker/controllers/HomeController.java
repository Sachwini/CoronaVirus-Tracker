package com.sachwini.CoronaVirusTracker.controllers;

import com.sachwini.CoronaVirusTracker.models.LocationStats;
import com.sachwini.CoronaVirusTracker.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @RequestMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat ->stat.getLatestTotalCases()).sum();
        int totalDiffCases = allStats.stream().mapToInt(stat ->stat.getDiffYT()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        model.addAttribute("totalDiffCases",totalDiffCases);
        return "home";
    }
}
