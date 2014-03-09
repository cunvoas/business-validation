/**
 * Package for mapping compatibility validation.
 * 
 * By experience return, any input field form must be check.
 * But the database model might be modified dans validation rules 
 * must be reported.
 * 
 * Some of them are not uptated ans many bugs comes.
 * 
 * The principle of this validation is to check hibernate mapping 
 * and produce dynamic validation rule for data objects.
 * 
 * This solution is only works when  Hibernate SessionFactory is reachable.
 * 
 * @author cunvoas
 */
package com.github.cunvoas.hibernate;