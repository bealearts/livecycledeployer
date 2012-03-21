/*
 * Copyright (c) 2011, David Beale
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bealearts.livecycle.utils;

import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugin.logging.SystemStreamLog;

import com.adobe.idp.services.ApplicationManager;
import com.adobe.idp.services.ApplicationManagerException;
import com.adobe.idp.services.ApplicationManagerService;
import com.adobe.idp.services.MyArrayOfApplication;
import com.bealearts.livecycleplugin.lca.LCADefinition;


/**
 * LiveCycle Server Utilities
 */
public class LiveCycleUtils
{
	/* PUBLIC */
	
	/**
	 * Default Constructor
	 */
	public LiveCycleUtils()
	{
		this( new SystemStreamLog() );
	}
	
	/**
	 * Constructor which sets the logger, e.g. When used in a Mojo
	 */
	public LiveCycleUtils(Log logger)
	{
		this.logger = logger;
		
		this.applicationManagerProxy = new ApplicationManagerService( this.getClass().getClassLoader().getResource("ApplicationManager.wsdl") );
	}
	
	
	/**
	 * Get installed Applications
	 * @throws ApplicationManagerException 
	 */
	public LCADefinition getInstalledApplications() throws ApplicationManagerException
	{
		LCADefinition lcaDefinition = new LCADefinition();
		
		ApplicationManager applicationManager = this.applicationManagerProxy.getApplicationManager();
		
		MyArrayOfApplication applications = applicationManager.getApplications();
		
		return lcaDefinition;
	}
	
	
	/* PROTECTED */
	
	/* PRIVATE */
	
	private Log logger;
	
	private ApplicationManagerService applicationManagerProxy;
		
}
