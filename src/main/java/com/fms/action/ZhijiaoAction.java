package com.fms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.fms.dao.QicaiDAO;
import com.fms.dao.ZhijiaoDAO;
import com.fms.model.Zhijiao;
import com.fms.util.ApplicationContextProvider;
import com.opensymphony.xwork2.ActionSupport;

public class ZhijiaoAction extends ActionSupport
{
	private int zhijiaoId;
	private String zhijiaoJiaolianName;
	private String zhijiaoKecheng;
	private String zhijiaoHuiyuan;
	
	private String message;
	private String path;
	

	private ApplicationContextProvider appContext;
	private ZhijiaoDAO zhijiaoDAO;
	
	public ZhijiaoAction() {
		appContext = new ApplicationContextProvider();
		zhijiaoDAO = (ZhijiaoDAO) appContext.getApplicationContext().getBean("zhijiaoDao", ZhijiaoDAO.class);
	}
	
	
	public String zhijiaoAdd()
	{
		Zhijiao zhijiao=new Zhijiao();
		zhijiao.setZhijiaoJiaolianName(zhijiaoJiaolianName);
		zhijiao.setZhijiaoKecheng(zhijiaoKecheng);
		zhijiao.setZhijiaoHuiyuan(zhijiaoHuiyuan);
		zhijiaoDAO.save(zhijiao);
		this.setMessage("");
		this.setPath("zhijiaoManage.action");
		return "succeed";
	}
	
	
	public String zhijiaoManage()
	{
		List zhijiaoList=zhijiaoDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("zhijiaoList", zhijiaoList);
		return ActionSupport.SUCCESS;
	}
	
	public String zhijiaoDel()
	{
		zhijiaoDAO.delete(zhijiaoDAO.findById(zhijiaoId));
		this.setMessage("");
		this.setPath("zhijiaoManage.action");
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

	public ZhijiaoDAO getZhijiaoDAO()
	{
		return zhijiaoDAO;
	}

	public void setZhijiaoDAO(ZhijiaoDAO zhijiaoDAO)
	{
		this.zhijiaoDAO = zhijiaoDAO;
	}

	public String getZhijiaoHuiyuan()
	{
		return zhijiaoHuiyuan;
	}

	public void setZhijiaoHuiyuan(String zhijiaoHuiyuan)
	{
		this.zhijiaoHuiyuan = zhijiaoHuiyuan;
	}

	public int getZhijiaoId()
	{
		return zhijiaoId;
	}

	public void setZhijiaoId(int zhijiaoId)
	{
		this.zhijiaoId = zhijiaoId;
	}

	public String getZhijiaoJiaolianName()
	{
		return zhijiaoJiaolianName;
	}

	public void setZhijiaoJiaolianName(String zhijiaoJiaolianName)
	{
		this.zhijiaoJiaolianName = zhijiaoJiaolianName;
	}

	public String getZhijiaoKecheng()
	{
		return zhijiaoKecheng;
	}

	public void setZhijiaoKecheng(String zhijiaoKecheng)
	{
		this.zhijiaoKecheng = zhijiaoKecheng;
	}
	
	
	
}
