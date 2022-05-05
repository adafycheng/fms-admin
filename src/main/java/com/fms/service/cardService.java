package com.fms.service;

import java.util.List;

import com.fms.dao.CardDAO;

public class cardService
{
	private CardDAO cardDAO;

	public List findAllCard()
	{
		return cardDAO.findAll();
	}
	
	public CardDAO getCardDAO()
	{
		return cardDAO;
	}

	public void setCardDAO(CardDAO cardDAO)
	{
		this.cardDAO = cardDAO;
	}
	

}
