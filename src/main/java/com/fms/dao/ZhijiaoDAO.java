package com.fms.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fms.model.Zhijiao;

/**
 * Data access object (DAO) for domain model class Zhijiao.
 * 
 * @see com.fms.model.Zhijiao
 * @author MyEclipse Persistence Tools
 */

public class ZhijiaoDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(ZhijiaoDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	public void save(Zhijiao transientInstance)
	{
		log.debug("saving Zhijiao instance");
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

	public void delete(Zhijiao persistentInstance)
	{
		log.debug("deleting Zhijiao instance");
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

	public Zhijiao findById(java.lang.Integer id)
	{
		log.debug("getting Zhijiao instance with id: " + id);
		try
		{
			Zhijiao instance = (Zhijiao) getHibernateTemplate().get(
					"com.model.Zhijiao", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zhijiao instance)
	{
		log.debug("finding Zhijiao instance by example");
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
		log.debug("finding Zhijiao instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from Zhijiao as model where model."
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
		log.debug("finding all Zhijiao instances");
		try
		{
			String queryString = "from Zhijiao";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zhijiao merge(Zhijiao detachedInstance)
	{
		log.debug("merging Zhijiao instance");
		try
		{
			Zhijiao result = (Zhijiao) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zhijiao instance)
	{
		log.debug("attaching dirty Zhijiao instance");
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

	public void attachClean(Zhijiao instance)
	{
		log.debug("attaching clean Zhijiao instance");
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
	public static ZhijiaoDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (ZhijiaoDAO) ctx.getBean("ZhijiaoDAO");
	}
	*/
}