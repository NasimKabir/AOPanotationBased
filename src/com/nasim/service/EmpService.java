package com.nasim.service;

import org.springframework.stereotype.Repository;

import com.nasim.model.Accountant;
import com.nasim.model.Manager;
@Repository
public class EmpService {
private Manager manager;
private Accountant accoutant;

public Manager getManager() {
	return manager;
}
public void setManager(Manager manager) {
	this.manager = manager;
}
public Accountant getAccoutant() {
	return accoutant;
}
public void setAccoutant(Accountant accoutant) {
	this.accoutant = accoutant;
}

}
