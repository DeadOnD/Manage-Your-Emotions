package com.thilo.android.FeelingsManager.Setup;

import com.thilo.android.FeelingsManager.SingleFragmentActivityC;

import android.app.Fragment;

public class ItemSetupActivityC extends SingleFragmentActivityC {
	//The onCreate method in the parent (SingleFragmentActivityC) calls createFragment
	@Override
	public Fragment createFragment(Object inAttachedData){ //Fragment
		return ItemSetupFragmentC.newInstance(inAttachedData);
	}
}
