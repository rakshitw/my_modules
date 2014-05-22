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
package org.openmrs.module.bpReadingModule.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.bpReadingModule.BpReadingModule;
import org.openmrs.module.bpReadingModule.api.BpReadingModuleService;
import org.openmrs.module.bpReadingModule.api.db.BpReadingModuleDAO;

/**
 * It is a default implementation of {@link BpReadingModuleService}.
 */
public class BpReadingModuleServiceImpl extends BaseOpenmrsService implements BpReadingModuleService {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private BpReadingModuleDAO dao;
	
	/**
     * @param dao the dao to set
     */
    public void setDao(BpReadingModuleDAO dao) {
	    this.dao = dao;
    }
    
    /**
     * @return the dao
     */
    public BpReadingModuleDAO getDao() {
	    return dao;
    }

	@Override
	public void saveBpReadingService(BpReadingModule bpReading) {
		dao.saveReadingDAO(bpReading);
		
	}

	@Override
	public BpReadingModule getBpReading(Integer id) {
		// TODO Auto-generated method stub
		return dao.getReadingDAO(id);
	}
}