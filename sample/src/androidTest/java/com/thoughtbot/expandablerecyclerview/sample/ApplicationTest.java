package com.thoughtbot.expandablerecyclerview.sample;

import android.app.Application;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

  @Test
  public void testApplicationNotNull() {
    Application app = ApplicationProvider.getApplicationContext();
    assertNotNull(app);
  }
}
