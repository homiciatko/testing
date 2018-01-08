package proteintracker;


import org.junit.*;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 * Created by Pawel on 2018-01-06.
 */
public class TrackingServiceTest {


    private TrackingService service;
    int amountToAdd, amountToRemove;


    @BeforeClass
    public static void before(){
        System.out.println("WTF");
        System.out.println("Before Class");

    }

    @AfterClass
    public static void after(){
        System.out.println("After Class");
    }


    @Before
    public void setUp(){
        System.out.println("Before");
        amountToAdd = 10;
        service = new TrackingService();
        amountToRemove = 20;
    }

    @After
    public void tearDown(){
        System.out.println("After");
    }


    @Test
    public void NewTrackingServiceTotalIsZero(){
        System.out.println("test 1");

        assertEquals("Tracking service total was not zero", 0,service.getTotal());
    }

    @Test
    public void WhenAddingProteinTotalIncreasesByThatAmount() {
        System.out.println("test 2");

        service.addProtein(amountToAdd);
        assertEquals("TrackingService taotal was not "+amountToAdd, amountToAdd, service.getTotal());
    }

    @Test
    public void WhenRemovingMoreProteinTotalRemainsZero(){
        System.out.println("test 3");

        service.removeProtein(amountToRemove);
        assertEquals("TrackingService total should not be less than zero", 0, service.getTotal());

    }

}