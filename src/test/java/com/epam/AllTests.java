package com.epam;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit tests")
@SelectPackages({"com.epam.plateau", "com.epam.minesweeper", "com.epam.other"})
@IncludeClassNamePatterns({"^.*$"})

public class AllTests {
}
