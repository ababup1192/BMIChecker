package org.ababup1192.bmichecker;


import android.test.ActivityInstrumentationTestCase2;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testEmptyHeightAndWeight() {
        // 身長と体重が空のままクリック
        onView(withId(R.id.buttonResult)).perform(click());
        // BMIの結果にエラーテキストが出るかチェック
        onView(withId(R.id.textViewResult)).check(matches(withText("身長か体重が空です!")));
    }

}
