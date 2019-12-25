package com.palak.factoryprogram;

import java.util.List;

public interface FileOperations {
	public List<Employee> readFile(String fileName);

	public void writeFile(String fileName);
}