package com.example.project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.project.model.Employee;

@Controller
public class MapController {

	@PostMapping("/employee")
	public @ResponseBody HashMap<String,String> showEmployee(@RequestBody Employee employee) {
		
		HashMap<String,String> mapStorage = new HashMap<String,String>();
		HashMap<String,String> resultMap = new HashMap<String,String>();

		mapStorage.put("Message","Emp verified Successfully");
		mapStorage.put("EmployeeName", employee.getEmployeeName());
		mapStorage.put("Address", employee.getAddress());
		mapStorage.put("Salary", employee.getSalary());
		mapStorage.put("Department", employee.getDepartment());
		mapStorage.put("Pincode", employee.getPincode());
		mapStorage.put("State", employee.getState());
		mapStorage.put("Country", employee.getCountry());
		
		for(Map.Entry<String, String> entry : mapStorage.entrySet()) {
			String str="";
			for(int i =0;i<entry.getValue().length();i++) {	
				if((entry.getValue().charAt(i)>=48 && entry.getValue().charAt(i)<=57) || (entry.getValue().charAt(i)>=65 && entry.getValue().charAt(i)<=90) || (entry.getValue().charAt(i)>=97 && entry.getValue().charAt(i)<=122) || entry.getValue().charAt(i)==32){
					str= str + entry.getValue().charAt(i);
					}	
				}
			if(str.length()!=0)
				resultMap.put(entry.getKey(), str);

			}
		
		return resultMap;
	}
}
