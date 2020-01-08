package com.wansoft.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Juan Salinas Zavaleta
 */
public class DinamicProxyRelection {
	
	public static void main(String[] args) {
		
		InvocationHandler handler =  new InvocationHandler() {
			@Override
			public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
				/**
				 * do something here
				 */
				return null;
			}
		};
		
		/**
		 * You create dynamic proxies usign the Proxy.newProxyInstace() method.
		 * The newProxyInstace() method take 3 parameters 
		 */
		
		/**
		 * Database Connection and Transaction Management----------------------------------
		 * 
		 * The Spring framework has a transaction proxy that can start and commit / rollback a transaction for you. 
		 * How this works is described in more detail in the text Advanced Connection and Transaction Demarcation and Propagation , so I'll only describe it briefly. The call sequence becomes something along this:
		 * 
		 * web controller --> proxy.execute(...);
		 * proxy --> connection.setAutoCommit(false);
		 * proxy --> realAction.execute();
		 * realAction does database work
		 * proxy --> connection.commit();
		 * 
		 */
		
		/**
		 * Dynamic Mock Objects for Unit Testing
		 * 
		 * The Butterfly Testing Tools makes use of dynamic proxies to implement dynamic stubs, mocks and proxies for unit testing. 
		 * When testing a class A that uses another class B (interface really), you can pass a mock implementation of B into A instead of a real B. 
		 * All method calls on B are now recorded, and you can set what return values the mock B is to return.
		 * 
		 * Furthermore Butterfly Testing Tools allow you to wrap a real B in a mock B, so that all method calls on the mock are recorded, and then forwarded to the real B. 
		 * This makes it possible to check what methods were called on a real functioning B. 
		 * For instance, if testing a DAO you can wrap the database connection in a mock. 
		 * The DAO will not see the difference, and the DAO can read/write data to the database as usual since the mock forwards all calls to the database. 
		 * But now you can check via the mock if the DAO uses the connection properly, for instance if the connection.close() is called (or NOT called), if you expected that. 
		 * This is normally not possible to determine from the return value of a DAO.
		 */
		
		/**
		 * Adaptation of DI Container to Custom Factory Interfaces
		 * 
		 * The dependency injection container Butterfly Container has a powerful feature that allows you to inject the whole container into beans produced by it. 
		 * But, since you don't want a dependency on the container interface, the container is capable of adapting itself to a custom factory interface of your design. 
		 * You only need the interface. 
		 * No implementation. 
		 * Thus the factory interface and your class could look something like this:
		 * 
		 * public interface IMyFactory {
		 * 	Bean   bean1();
		 * 	Person person();
		 * 	...
		 * }
		 * 
		 * public class MyAction{
		 * 
		 * 	protected IMyFactory myFactory= null;
		 * 		public MyAction(IMyFactory factory){
		 * 			this.myFactory = factory;
		 * 		}
		 * 
		 * 	public void execute(){
		 * 		Bean bean = this.myFactory.bean();
		 * 		Person person = this.myFactory.person();
		 * 	}
		 * 
		 * }
		 * 
		 * When the MyAction class calls methods on the IMyFactory instance injected into its constructor by the container, 
		 * the method calls are translated into calls to the IContainer.instance() method, which is the method you use to obtain instances from the container. 
		 * That way an object can use Butterfly Container as a factory at runtime, rather than only to have dependencies injected into itself at creation time. 
		 * And this without having any dependencies on any Butterfly Container specific interfaces.
		 */
		
		/**
		 * AOP-like Method Interception
		 * 
		 * The Spring framework makes it possible to intercept method calls to a given bean, provided that bean implements some interface. 
		 * The Spring framework wraps the bean in a dynamic proxy. 
		 * All calls to the bean are then intercepted by the proxy. 
		 * The proxy can decide to call other methods on other objects either before, instead of, or after delegating the method call to the bean wrapped.
		 */
	}
}
