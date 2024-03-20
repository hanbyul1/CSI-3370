/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import firm.Employee;
import firm.Executive;
import firm.Hourly;
import firm.Volunteer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kim2
 */
public class StaffMemberTest {
    
    Employee empl;
    Executive exec;
    Hourly hourly;
    Volunteer voln;    
    
    public StaffMemberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //Create an object of each type of StaffMember
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void EmployeePay() {
        //Test Employee pay()
    }

    @Test
    public void ExecutivePay() {
        //Test Executive pay()
    }

    @Test
    public void HourlyPay() {
        //Test Hourly pay()
    }

    @Test
    public void VolunteerPay() {
        //Test Volunteer pay()
    }
}
