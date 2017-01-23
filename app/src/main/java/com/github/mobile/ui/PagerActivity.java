/*
 * Copyright 2012 GitHub Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.mobile.ui;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Activity that displays a {@link ViewPager} and has workarounds for
 * ActionBar/ViewPager bugs
 */
public abstract class PagerActivity extends DialogFragmentActivity implements
        OnPageChangeListener {

    private boolean menuCreated;

    /**
     * Get provider of the currently selected fragment
     *
     * @return fragment provider
     */



    //getProvider() is extended by 5 classes, and each override of it is the same, it violate DRY, we can make it abstract and it can be used


/*
    protected abstract FragmentProvider getProvider();

*/

    protected  FragmentProvider getProvider(FragmentStatePagerAdapter adapter){
        return adapter;
    }

    /**
     * Get selected fragment
     *
     * @return fragment
     */

    //get parameter of getProvider changed
    protected FragmentStatePagerAdapter adapter;
    protected Fragment getFragment() {
        FragmentProvider provider = getProvider(adapter);
        if (provider != null)
            return provider.getSelected();
        else
            return null;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        Fragment fragment = getFragment();
        if (fragment != null)
            return fragment.onOptionsItemSelected(item);

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void invalidateOptionsMenu() {
        if (menuCreated)
            super.invalidateOptionsMenu();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Fragment fragment = getFragment();
        if (fragment != null)
            fragment.onCreateOptionsMenu(menu, getMenuInflater());

        boolean created = super.onCreateOptionsMenu(menu);
        menuCreated = true;
        return created;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset,
            int positionOffsetPixels) {
        // Intentionally left blank
    }

    @Override
    public void onPageSelected(int position) {
        invalidateOptionsMenu();
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        // Intentionally left blank
    }
}
