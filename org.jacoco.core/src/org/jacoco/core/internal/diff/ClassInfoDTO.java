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
