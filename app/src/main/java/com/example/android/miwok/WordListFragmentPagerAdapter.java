package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mscec on 2017/8/11.
 */

public class WordListFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    Context context;

    public WordListFragmentPagerAdapter(Context context,  FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if (position == 2){
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return this.context.getString(R.string.category_numbers);
        } else if (position == 1){
            return this.context.getString(R.string.category_family);
        } else if (position == 2){
            return this.context.getString(R.string.category_colors);
        } else {
            return this.context.getString(R.string.category_phrases);
        }
    }
}
