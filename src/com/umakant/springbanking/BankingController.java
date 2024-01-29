package com.umakant.springbanking;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.umakant.model.BankingDao;
import com.umakant.view.Banking;

@Controller
public class BankingController
{
	@Autowired
	BankingDao bankingDao;
	
	@RequestMapping("/")
	public String login()
	{
		return "index";		
	}
	@RequestMapping("/createAccount")
	public String create()
	{
		return "create_account";
	}
	@RequestMapping("/depositAmount")
	public String deposit()
	{
		return "deposit";
		
	}
	@RequestMapping("/withdrawAmount")
	public String withdraw()
	{
		return "withdraw";
		
	}
//	@RequestMapping("/viewPage")
//	public String view()
//	{
//		return "viewAccount";
//		
//	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public String insertData(HttpServletRequest request)
	{
		String userName,password;
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		if(userName.equals("admin@gmail.com")&&password.equals("admin"))
		{
			return "create_account";
			
		}
		
		else
		{
			return "error";
		}
	}
	
	@RequestMapping(path="/createAccount", method=RequestMethod.POST)
	public String createAccount(HttpServletRequest request)
	{
		int id=0,balance,accNo;
		String name;
		//id=Integer.parseInt(request.getParameter("id"));
		name=request.getParameter("name");
		accNo=Integer.parseInt(request.getParameter("accNo"));
		balance=Integer.parseInt(request.getParameter("balance"));
		
		Banking banking = new Banking();
		banking.setUserId(id);
		banking.setUserName(name);
		banking.setUserAccount(accNo);
		banking.setUserBalance(balance);
		
		int i=bankingDao.insert(banking);
		if(i!=0)
		{
			return "create_account";
		}
		else
		{
			return "error";
		}
		
	}
	
	@RequestMapping(path="/deposit", method=RequestMethod.POST)
	public String depositAmount(HttpServletRequest request)
	{
		int balance,oldBal;
		int accNo=Integer.parseInt(request.getParameter("accNo"));
		balance=Integer.parseInt(request.getParameter("balance"));
		
		
		Banking bank2=bankingDao.getUserInt(accNo);
		//bank2=bankingDao.getUserString(userAccount)
		oldBal=bank2.getUserBalance();
		
		int newamt=balance+oldBal;
		bank2.setUserBalance(newamt);
		bankingDao.updateUser(bank2);
		return "deposit";
		
	}
	@RequestMapping(path="/withdraw", method=RequestMethod.POST)
	public String withdrawAmount(HttpServletRequest request)
	{
		int balance,oldBal;
		int accNo=Integer.parseInt(request.getParameter("accNo"));
		balance=Integer.parseInt(request.getParameter("balance"));
		
		
		Banking bank2=bankingDao.getUserInt(accNo);
		oldBal=bank2.getUserBalance();
		if(balance>0&&oldBal>0)
		{
			int newamt=(oldBal-balance);
			bank2.setUserBalance(newamt);
			bankingDao.updateUser(bank2);
			return "withdraw";
		}
		else
		{
			return"error";
		}
		
	}
	@RequestMapping(path="/viewPage")
	public String viewAccountPage(Model model)
	{

		List<Banking> banking =bankingDao.getAllUsers();
		model.addAttribute("user",banking);
		
		return "viewAccount";
		
	}
}
	