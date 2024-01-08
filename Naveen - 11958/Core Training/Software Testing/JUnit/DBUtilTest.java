package com.ems.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ems.util.DBUtil;

public class DBUtilTest {

    static DBUtil db;

    @Before
    public void objectCreation() {
        db = new DBUtil();
    }

    @After
    public void objectDeletion() {
        db = null;
    }

    @Test
    public void testGetDBConnection() {
        assertNotNull(db);
    }

}