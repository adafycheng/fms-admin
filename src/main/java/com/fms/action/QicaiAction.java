package com.fms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.fms.dao.QicaiDAO;
import com.fms.model.Qicai;
import com.fms.util.ApplicationContextProvider;
import com.opensymphony.xwork2.ActionSupport;

public class QicaiAction extends ActionSupport
{
	private int qicaiId;
	private String qicaiName;
	private String qicaiGoumairiqi;
	private String qicaiBeizhu;
	
	private String message;
	private String path;
	
	
	private ApplicationContextProvider appContext;
	private QicaiDAO qicaiDAO;
	
	public QicaiAction() {
		appContext = new ApplicationContextProvider();
		qicaiDAO = (QicaiDAO) appContext.getApplicationContext().getBean("qicaiDao", QicaiDAO.class);
	}
	
	/*
	public QicaiDAO getQicaiDAO()
	{
		return qicaiDAO;
	}

	public void setQicaiDAO(QicaiDAO qicaiDAO)
	{
		this.qicaiDAO = qicaiDAO;
	}
	*/
	
	public String qicaiAdd()
	{
		Qicai qicai=new Qicai();
		qicai.setQicaiBeizhu(qicaiBeizhu);
		qicai.setQicaiGoumairiqi(qicaiGoumairiqi);
		qicai.setQicaiName(qicaiName);
		
		qicaiDAO.save(qicai);
		this.setMessage("");
		this.setPath("qicaiManage.action");
		return "succeed";
	}
	
	public String qicaiManage()
	{
		List qicaiList=qicaiDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("qicaiList", qicaiList);
		return ActionSupport.SUCCESS;
	}
	
	public String qicaiDel()
	{
		qicaiDAO.delete(qicaiDAO.findById(qicaiId));
		this.setMessage("");
		this.setPath("qicaiManage.action");
		return "succeed";
	}
	
	
	
	
	
	
	

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getQicaiBeizhu()
	{
		return qicaiBeizhu;
	}

	public void setQicaiBeizhu(String qicaiBeizhu)
	{
		this.qicaiBeizhu = qicaiBeizhu;
	}

	public String getQicaiGoumairiqi()
	{
		return qicaiGoumairiqi;
	}

	public void setQicaiGoumairiqi(String qicaiGoumairiqi)
	{
		this.qicaiGoumairiqi = qicaiGoumairiqi;
	}

	public int getQicaiId()
	{
		return qicaiId;
	}

	public void setQicaiId(int qicaiId)
	{
		this.qicaiId = qicaiId;
	}

	public String getQicaiName()
	{
		return qicaiName;
	}

	public void setQicaiName(String qicaiName)
	{
		this.qicaiName = qicaiName;
	}
	
}
