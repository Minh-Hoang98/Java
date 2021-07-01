/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java;

import static java.TriangleType.INVALID;
import static java.TriangleType.ISOSCELES;
import static java.TriangleType.SCALENE;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class TriangleTest {
    
    @Test
    public void Test1(){
        final TriangleType type = Triangle.classify(1, 2, 3);
        assertEquals(SCALENE, type);
    }
    @Test
    public void testInvalid1(){
        final TriangleType type = Triangle.classify(1, 2, 4);
        assertEquals(INVALID, type);
    }
    @Test
    public void testIsoceles3(){
        final TriangleType type = Triangle.classify(3, 3, 2);
        assertEquals(ISOSCELES, type);
    }
    @Test
    public void testInvalid(){
        final TriangleType type = Triangle.classify(3, 1, 1);
        assertEquals(INVALID, type);
    }
}
