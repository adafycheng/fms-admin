package com.fms.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.fms.dao.CardDAO;
import com.fms.model.Card;
import com.fms.util.ApplicationContextProvider;
import com.opensymphony.xwork2.ActionSupport;

public class CardAction extends ActionSupport
{
	private int cardId;
	private String cardLeixiong;
	private String cardGuize;
	private String cardYouhuizhengce;
	
	private String message;
	private String path;
	
	private ApplicationContextProvider appContext;
	private CardDAO cardDAO;
	
	public CardAction() {
		appContext = new ApplicationContextProvider();
		cardDAO = (CardDAO) appContext.getApplicationContext().getBean("cardDao", CardDAO.class);
	}
	
	/*
	public CardDAO getCardDAO()
	{
		return cardDAO;
	}
	
	public void setCardDAO(CardDAO cardDAO)
	{
		this.cardDAO = cardDAO;
	}
	 */

	public String cardAdd()
	{
		Card card = new Card();
		card.setCardGuize(cardGuize);
		card.setCardLeixiong(cardLeixiong);
		card.setCardYouhuizhengce(cardYouhuizhengce);
		
		cardDAO.save(card);
		this.setMessage("");
		this.setPath("cardManage.action");
		return "succeed";
	}
	
	public String cardManage()
	{
		List cardList=cardDAO.findAll();
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("cardList", cardList);
		return ActionSupport.SUCCESS;
	}
	
	public String cardDel()
	{
		cardDAO.delete(cardDAO.findById(cardId));
		this.setMessage("");
		this.setPath("cardManage.action");
		return "succeed";
	}

	public String getCardGuize()
	{
		return cardGuize;
	}

	public void setCardGuize(String cardGuize)
	{
		this.cardGuize = cardGuize;
	}

	public int getCardId()
	{
		return cardId;
	}

	public void setCardId(int cardId)
	{
		this.cardId = cardId;
	}

	public String getCardLeixiong()
	{
		return cardLeixiong;
	}

	public void setCardLeixiong(String cardLeixiong)
	{
		this.cardLeixiong = cardLeixiong;
	}

	public String getCardYouhuizhengce()
	{
		return cardYouhuizhengce;
	}

	public void setCardYouhuizhengce(String cardYouhuizhengce)
	{
		this.cardYouhuizhengce = cardYouhuizhengce;
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
	
}
