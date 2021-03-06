package com.fms.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.fms.model.User;

/**
 * Data access object (DAO) for domain model class User.
 * 
 * @see com.fms.model.User
 * @author MyEclipse Persistence Tools
 */

public class UserDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(UserDAO.class);

	protected void initDao()
	{
		// do nothing
	}

	/*
	private SessionFactory sessionFactory;
    public UserDAO(SessionFactory sessionfactory){
        this.sessionFactory=sessionfactory;
    }
    */
    
	public void save(User transientInstance)
	{
		log.debug("saving User instance");
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

	public void delete(User persistentInstance)
	{
		log.debug("deleting User instance");
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

	public User findById(java.lang.Integer id)
	{
		log.debug("getting User instance with id: " + id);
		try
		{
			User instance = (User) getHibernateTemplate().get(
					"com.model.User", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(User instance)
	{
		log.debug("finding User instance by example");
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
		log.debug("finding User instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from User as model where model."
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
		log.debug("finding all User instances");
		try
		{
			String queryString = "from User";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
	public List findAllGongzuoRenyuan()
	{
		log.debug("finding all User instances");
		try
		{
			String queryString = "from User where userType !=0 and userType !=8";//8??????????????????????????????(????????)
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
	public List findAllHuiyuan()
	{
		log.debug("finding all User instances");
		try
		{
			String queryString = "from User where userType=8";////8??????????????????????????????(????????)
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public User merge(User detachedInstance)
	{
		log.debug("merging User instance");
		try
		{
			User result = (User) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(User instance)
	{
		log.debug("attaching dirty User instance");
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

	public void attachClean(User instance)
	{
		log.debug("attaching clean User instance");
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
	public static UserDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (UserDAO) ctx.getBean("UserDAO");
	}
	*/
}