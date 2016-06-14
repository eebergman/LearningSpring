package com.notes;

public class A_GettingStartedWithBeans {

/**
 *  1. Start by creating a new Maven project. 
 *  	using command line to select the correct archetype 
 * 			-group id is formatted name arrb and formatted the same as a pkg, ie "com.xyz"
 * 			-the other thing is also arrb
 * 
 * 	2. Import Spring dependencies.
 * 			-use Maven Repo to steal formatting
 * 				-Spring Core
 * 				-Spring Beans
 * 				-Spring Context
 * 
 * 3. Created classes in the app
 * 			-Main
 * 			-Person
 * 				-should have stuff to do.
 * 
 * 4. Right click on the project folder; this is the top most file.
 * 			-hover- new
 * 			-click- other
 * 			-Spring	
 * 			-new Spring Beans Config file
 * 			-Name arrb
 * 			-ck- next
 * 
 * 5. Beans view
 * 			-ck- beans at bottom of the view
 * 			-arrb id name
 * 			-class name of the class we are trying to find to connect, same as the POJO
 * 
 * 6. In the class where we are using the bean 
 * 			-type "ApplicationContext context = new FileSystemXmlApplicationContext("arrbNameOfBeansXML.xml");"
 * 			-import applicationContext pkg
 * 			
 * 	7. Now we can use that to access the stuff the POJO does!!
 * 
 * 8. cast context to FileSystemApplicationContext to close it.
 * 			-((File SystemXmlApplicationContext)context).close();
 * 
 * 9. beans.xml in a pkg? 
 * 			-/\2 "ApplicationContext context = new ClassPathXmlApplicationContext("copy qualified name of beans.xml");
 * 			-only need stuff from com and after			
 * 
 * 			-/\2 "((ClassPathXmlApplicationContext)context).close();
 * 
 * 10. Adding to the POJO
 * 			-when adding a new POJO or after adding fields to the POJO you must update the bean data. 
 * 			-ck- on beans.xml file 
 * 			-ck- beans on bottom of the view
 * 			-Rck- on the specific bean
 * 				-Insert Constructor argument
 * 					-Index or name are the two really important fields. 
 */
	
	
	
	
	
}
