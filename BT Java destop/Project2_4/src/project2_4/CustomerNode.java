/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_4;

/**
 *
 * @author PC
 */

import Practical1_4.Customer;

public class CustomerNode {
	Customer info;
	CustomerNode left,right;
	CustomerNode(Customer x) {
		info=x;left=right=null;

	}
	CustomerNode(Customer x, CustomerNode lt, CustomerNode rt){
		this.info = x; left = lt; right = rt;

	}
}
