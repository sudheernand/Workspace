package com.indus.training.listner;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * Application Lifecycle Listener implementation class ContextSessionMigration
 *
 */
public class ContextSessionMigration implements HttpSessionActivationListener {

    /**
     * Default constructor. 
     */
    public ContextSessionMigration() {
    }

	/**
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
