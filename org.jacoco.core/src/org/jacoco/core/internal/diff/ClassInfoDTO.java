/*******************************************************************************
 * Copyright (c) 2009, 2022 Mountainminds GmbH & Co. KG and Contributors
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core.internal.diff;

import java.util.List;

/**
 * 类信息
 */
public class ClassInfoDTO {
	/**
	 * java文件
	 */
	private String classFile;

	/**
	 * 类中的方法
	 */
	private List<MethodInfoDTO> methodInfoS;

	/**
	 * 修改类型
	 */
	private String type;

	public String getClassFile() {
		return classFile;
	}

	public void setClassFile(String classFile) {
		this.classFile = classFile;
	}

	public List<MethodInfoDTO> getMethodInfos() {
		return methodInfoS;
	}

	public void setMethodInfos(List<MethodInfoDTO> methodInfoDTOS) {
		this.methodInfoS = methodInfoDTOS;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
