package org.jacoco.core.internal.diff;

import java.util.List;

public class MethodInfoDTO {
	/**
	 * 方法名
	 */
	public String methodName;
	/**
	 * 方法参数
	 */
	public List<String> parameters;

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}
}
