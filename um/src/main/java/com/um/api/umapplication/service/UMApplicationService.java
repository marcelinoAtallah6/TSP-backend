package com.um.api.umapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.api.umapplication.model.UMApplication;
import com.um.api.umapplication.model.UMMenu;
import com.um.api.umapplication.repository.UMApplicationRepository;

@Service
public class UMApplicationService {

	@Autowired
	private UMApplicationRepository umApplicationRepository;

	public List<UMApplication> getAllApplications() {

		 // Fetch all applications with their associated menus (and child menus)
        List<UMApplication> applications = umApplicationRepository.findAll();
        
//        // Iterate over applications and manually set their child menus
//        for (UMApplication application : applications) {
//            for (UMMenu menu : application.getMenus()) {
//                loadChildMenus(menu);
//            }
//        }
        
        return applications;
        
	}

	public UMApplication saveApplication(UMApplication application) {
		return umApplicationRepository.save(application);
	}
}
