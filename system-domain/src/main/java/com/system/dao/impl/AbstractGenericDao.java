package com.system.dao.impl;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.system.dao.GenericDao;
import com.system.util.ClassUtil;
import com.system.util.Util;


@Transactional(TxType.MANDATORY)
abstract class AbstractGenericDao<P,Q extends Serializable> implements GenericDao<P,Q> {
	private static int MAX_IN_SIZE = 1000;
	
	@Inject
	private SessionFactory sessionFactory;
	
	private final Class<P> bean;
	
	@SuppressWarnings("unchecked")
	protected AbstractGenericDao()
	{
		bean = (Class<P>) ClassUtil.getTypeArguments(AbstractGenericDao.class, this.getClass()).get(0);
	}
	
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	
	
	@SuppressWarnings("unchecked")
	public List<P> find()
	{
		final Session s = this.getSession();
		final Criteria c = s.createCriteria(bean);
		return c.list();
	}
	
	@SuppressWarnings("unchecked")
	public P find(final Q id)
	{
		return (P) getSession().get(bean, id);
	}
	
	@SuppressWarnings("unchecked")
	public P load(final Q id)
	{
		return (P) getSession().load(bean, id);
	}
	
	public Serializable save(final P entity)
	{
		return getSession().save(entity);
	}
	
	public void remove(final P entity)
	{
		getSession().delete(entity);
	}
	
	public void update(final P entity)
	{
		getSession().update(entity);
	}
	
	public void remove(final Q id)
	{
		final Session s = this.getSession();
		s.delete(s.load(bean, id));
	}
	
	public void remove(final Q[] id)
	{
		final Session s = this.getSession();
		for(final Q p : id)
		{
			s.delete(s.load(bean, p));
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public P getOne()
	{
		final Session session = getSession();
		final Criteria c = session.createCriteria(bean);
		c.setMaxResults(1);
		return (P) c.uniqueResult();
	}

	protected int getTotalRows(final Criteria criteria)
	{
		criteria.setProjection(Projections.projectionList().add(Projections.rowCount()));
		return ((Long)criteria.uniqueResult()).intValue();
	}
	
	
	protected int getTotalRows()
	{
		final Session s = this.getSession();
		return getTotalRows(s.createCriteria(bean));
	}
	
	protected static Disjunction splitInClause(final String alias, final Object[] values)
	{
		final Disjunction disjunction = Restrictions.disjunction();
		
		if(values.length > MAX_IN_SIZE)
		{
			for(final Object[] o : Util.split(values, MAX_IN_SIZE, new Object[][]{}))
			{
				disjunction.add(Restrictions.in(alias, o));
			}
		}else if(values.length > 0)
		{
			disjunction.add(Restrictions.in(alias, values));
		}else
		{
			/** force to FALSE is values are empty **/
			disjunction.add(Restrictions.sqlRestriction("(0=1)"));
		}
		return disjunction;
	}
	
	
	protected static Object[][] splitInSqlCalsue(final StringBuilder outerSql, final String column, final String paramterNamePrefix, final Object[] values)
	{
		final Object[][] ret;
		if(values.length > MAX_IN_SIZE)
		{
			final StringBuilder sb = new StringBuilder();
			sb.append(" and (1=0 ");
			
			final Object[][] parts = Util.split(values, MAX_IN_SIZE, new Object[][]{});
			for(int i=0;i<parts.length;i++)
			{
				sb.append(String.format("or %s in (:%s%d)", column, paramterNamePrefix, i));
			}
			
			sb.append(")");
			outerSql.append(sb.toString());
			ret = parts;
			
		}else
		{
			outerSql.append(String.format(" and %s in (:%s%d)",column, paramterNamePrefix, 0));
			ret = new Object[][]{values};
		}
		return ret;
	}
}
