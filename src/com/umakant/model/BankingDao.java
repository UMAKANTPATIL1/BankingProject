package com.umakant.model;


import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.umakant.view.Banking;

//import com.rcpit.BankingDemo.Banking;

@Component
public class BankingDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Banking banking){
		Integer i =(Integer)this.hibernateTemplate.save(banking);
		return i;
		
	}
	public Banking getUser(int userId) {
		Banking banking = this.hibernateTemplate.get(Banking.class, userId);
		return banking;
		}
	public Banking getUserInt(int userAccount) {
		Banking banking = this.hibernateTemplate.get(Banking.class, userAccount);
		
		return banking;
		}
	public List<Banking> getAllUsers() {
		List<Banking> banking = this.hibernateTemplate.loadAll(Banking.class);
		return banking;
		}
	@Transactional
	public void deleteUser(int userId){
		Banking banking = this.hibernateTemplate.get(Banking.class,userId);
		this.hibernateTemplate.delete(banking);
	}
	@Transactional
	public void updateUser(Banking banking){
		
		this.hibernateTemplate.update(banking);
		
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
		}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
		}
	
	
	
}
