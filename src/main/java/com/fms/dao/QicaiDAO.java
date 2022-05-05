package com.fms.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fms.model.Qicai;

/**
 * Data access object (DAO) for domain model class Qicai.
 * 
 * @see com.fms.model.Qicai
 * @author MyEclipse Persistence Tools
 */

public class QicaiDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(QicaiDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(Qicai transientInstance)
	{
		log.debug("saving Qicai instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Qicai persistentInstance)
	{
		log.debug("deleting Qicai instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public Qicai findById(java.lang.Integer id)
	{
		log.debug("getting Qicai instance with id: " + id);
		try
		{
			Qicai instance = (Qicai) getHibernateTemplate().get(
					"com.model.Qicai", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Qicai instance)
	{
		log.debug("finding Qicai instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding Qicai instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from Qicai as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll()
	{
		log.debug("finding all Qicai instances");
		try
		{
			String queryString = "from Qicai";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public Qicai merge(Qicai detachedInstance)
	{
		log.debug("merging Qicai instance");
		try
		{
			Qicai result = (Qicai) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Qicai instance)
	{
		log.debug("attaching dirty Qicai instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Qicai instance)
	{
		log.debug("attaching clean Qicai instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	/*
	public static QicaiDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (QicaiDAO) ctx.getBean("QicaiDAO");
	}
	*/
}