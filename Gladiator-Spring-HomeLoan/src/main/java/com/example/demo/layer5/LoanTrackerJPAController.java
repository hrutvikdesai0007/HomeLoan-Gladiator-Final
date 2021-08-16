package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
import com.example.demo.layer4.LoanTrackerServiceImplementation;

@CrossOrigin(origins = "*")
@Controller
@RestController // it is a specialized version of @Component - arker to receive web request
@RequestMapping("/tracker")
public class LoanTrackerJPAController {
    @Autowired
    LoanTrackerServiceImplementation trackerRepo;
    @GetMapping
    @ResponseBody
    @RequestMapping(value = "/getLoan/{applicationId}/{ph}")
    public List<LoanTracker> getLoan(@PathVariable int applicationId, @PathVariable String ph) {
        System.out.println("getLoan()...method ");
            try {
                return trackerRepo.selectLoanService(applicationId, ph);
            } catch (LoanTrackerNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            return null;
        }

    @GetMapping
    @ResponseBody
    @RequestMapping(value = "/getallLoan")
    public List<LoanTracker> getAllLoan() {
        System.out.println("getAllLoan()...method ");
                return trackerRepo.selectAllLoansService();
        }



}
