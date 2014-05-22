/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.bpReadingModule.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.api.context.Context;
import org.openmrs.module.bpReadingModule.BpReadingModule;
import org.openmrs.module.bpReadingModule.api.BpReadingModuleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The main controller.
 */
@Controller
public class  BpReadingModuleManageController {
	
	protected final Log log = LogFactory.getLog(getClass());
	@RequestMapping(value = "/module/bpReadingModule/manage", method = RequestMethod.GET)
	public void manage(ModelMap model) {
		model.addAttribute("user", Context.getAuthenticatedUser());
	}
	
	@RequestMapping(value = "/module/bpReadingModule/manage", method = RequestMethod.POST)
	public void setBpReading(
		@RequestParam("id") Integer id,	
		@RequestParam("patient_id") Integer patient_id,
		@RequestParam("bpreading") Integer bp_reading) {
	BpReadingModule bpReading = new BpReadingModule();
	
	
	bpReading.setBp_reading(bp_reading);
	bpReading.setId(id);
	bpReading.setPatient_id(patient_id);
	Context.getService(BpReadingModuleService.class).saveBpReadingService(bpReading);
		
	}
}
