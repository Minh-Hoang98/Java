/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2_4;

import Practical1_4.Booking;

/**
 *
 * @author PC
 */




public class BookingNode {
	Booking info;
	BookingNode left,right;
	BookingNode(Booking x) {
		info=x;left=right=null;

	}
	BookingNode(Booking x, BookingNode lt, BookingNode rt){
		this.info = x; left = lt; right = rt;

	}
}

