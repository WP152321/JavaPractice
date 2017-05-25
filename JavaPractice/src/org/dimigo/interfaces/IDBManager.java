/**
 * 
 */
package org.dimigo.interfaces;

import org.dimigo.abstractclass.Galaxy;
import org.dimigo.abstractclass.IPhone;

/**
 * <pre>
 * org.dimigo.interfaces
 *   |_IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author : ldcle
 * @version : 1.0
 */
public interface IDBManager {
		
		String ORACLE_DATABASE = "ORACLE";
		String SYBASE_DATABASE = "SYBASE";
		
		void insert();
		void search();
		void update();
		void delete();
		
		public static IDBManager getDBObject(String database){
			IDBManager idbm = null;
			if(database.equals(ORACLE_DATABASE)){
				idbm = new OracleDB();
			}
			else if (database.equals(SYBASE_DATABASE)){
				idbm = new SybaseDB();
			}
			return idbm;
		}
}
