package org.ubruno.catalog.business.dbcommon;

import java.util.List;

/**
 * 
 * @author ubruno
 *
 * @param <MODEL>
 */
public interface CommonDAOOperations<MODEL> {

	
	public List<MODEL> findAll();
	
	public MODEL findOne();
	
	public MODEL findById(Long id);
	
	public MODEL insert(MODEL model);
	
}
