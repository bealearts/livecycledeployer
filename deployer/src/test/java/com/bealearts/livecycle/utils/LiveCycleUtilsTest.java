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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.adobe.idp.services.ApplicationManagerException;
import com.bealearts.livecycleplugin.lca.LCADefinition;

/**
 * 
 * Tests for LiveCycleUtils
 */
public class LiveCycleUtilsTest 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/* TESTS */
	
	@Test
	public void testLiveCycleUtils() 
	{
		LiveCycleUtils liveCycleUtils = new LiveCycleUtils();
	}
	
	
	@Test
	public void testGetInstalledApplications() throws ApplicationManagerException
	{
		LiveCycleUtils liveCycleUtils = new LiveCycleUtils();
		
		LCADefinition lcaDefinition = liveCycleUtils.getInstalledApplications();
	}

}
