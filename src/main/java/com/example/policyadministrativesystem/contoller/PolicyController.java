package com.example.policyadministrativesystem.contoller;


import com.example.policyadministrativesystem.entity.Address;
import com.example.policyadministrativesystem.entity.Coverage;
import com.example.policyadministrativesystem.entity.Policy;
import com.example.policyadministrativesystem.entity.State;
import com.example.policyadministrativesystem.service.AddressService;
import com.example.policyadministrativesystem.service.CoverageService;
import com.example.policyadministrativesystem.service.PolicyService;
import com.example.policyadministrativesystem.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class PolicyController {
    @Autowired
    PolicyService policyService;
    @Autowired
    AddressService addressService;
    @Autowired
    StateService stateService;
    @Autowired
    CoverageService coverageService;
    @GetMapping("addPolicy")
    public String addPolicy(Model model){
        model.addAttribute("policy",new Policy());
        model.addAttribute("address",new Address());
        model.addAttribute("state",stateService.getAllState());
        model.addAttribute("coverage",coverageService.getAllCoverage());
        return "addPolicy";
    }
    @GetMapping("submit")
    public String submit(@ModelAttribute("policy") Policy policy, @ModelAttribute("address") Address address, @RequestParam("stateId") int stateId, @RequestParam("coverageId") List<Integer> coverageId){
        State state=stateService.getStateById(stateId);
        address.setStates(state);
        policy.setAddress(address);
        List<Coverage> coverages=new ArrayList<>();
        for (Integer coverage:coverageId){
            Coverage c=coverageService.getCoverageById(coverage);
            coverages.add(c);
        }
        policy.setCoverages(coverages);
        policyService.addPolicy(policy);
        addressService.addAddress(address);
        stateService.addState(state);
        return "index";
    }
    @GetMapping("listPolicy")
    public String listPolicy(Model model){
        List<Policy> policies=policyService.getAllPolicy();
        model.addAttribute("state",stateService.getAllState());
        model.addAttribute("coverage",coverageService.getAllCoverage());
        model.addAttribute("policy",policies);
        model.addAttribute("address",addressService.getAllAddress());
        return "listPolicy";
    }
    @GetMapping("getPolicyById/{id}")
    public String getById(@PathVariable int id,Model model){
        Policy policy=policyService.getPolicyById(id);
        Address address=addressService.getAddressById(id);
        model.addAttribute("state",stateService.getAllState());
        model.addAttribute("coverage",coverageService.getAllCoverage());
        model.addAttribute("policy",policy);
        model.addAttribute("address",address);
        return "update";
    }

    @GetMapping("update")
    public String update(@ModelAttribute("policy") Policy policy, @ModelAttribute("adddress") Address address, @RequestParam("stateId") int stateId, @RequestParam("coverageId") List<Integer> coverageId,Model model){
        State state=stateService.getStateById(stateId);
        address.setStates(state);
        policy.setAddress(address);
        List<Coverage> coverages=new ArrayList<>();
        for (Integer coverage:coverageId){
            Coverage c=coverageService.getCoverageById(coverage);
            coverages.add(c);
        }
        policy.setCoverages(coverages);
        policyService.updatePolicy(policy);
        List<Policy> policies=policyService.getAllPolicy();
        model.addAttribute("policy",policies);
        return "listPolicy";
    }

}
