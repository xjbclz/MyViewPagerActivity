package huahua.viewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment2 extends baseFragment{
	private View mMainView;

//	private boolean isHasLoadDate = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("vf", "fragment2-->onCreate()");

		LayoutInflater inflater = getActivity().getLayoutInflater();
		mMainView = inflater.inflate(R.layout.fragment2, (ViewGroup)getActivity().findViewById(R.id.viewpager), false);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.v("vf", "fragment2-->onCreateView()");

		ViewGroup p = (ViewGroup) mMainView.getParent();
		if (p != null) {
			p.removeAllViewsInLayout();
			Log.v("vf", "fragment2-->移除已存在的View");
		}

		Log.v("vf", "fragment2-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));

		return mMainView;
	}

//	@Override
//	public void onActivityCreated(Bundle savedInstanceState) {
//		super.onActivityCreated(savedInstanceState);
//
//		Log.v("vf", "fragment2-->onActivityCreated()");
//
////        Snackbar.make(getView(), "Snackbar2", Snackbar.LENGTH_LONG)
////                .setAction("Action", null).show();
//
//		Log.v("vf", "fragment2-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));
//	}
//
//	@Override
//	public void setUserVisibleHint(boolean isVisibleToUser) {
//		super.setUserVisibleHint(isVisibleToUser);
//
//		if (isVisibleToUser) {
//			Log.v("vf", "fragment2-->setUserVisibleHint() true");
//
//			if (!isHasLoadDate) {
//				isHasLoadDate = true;
//
//				Log.v("vf", "fragment2-->load data");
//			}
//
//		}else{
//			Log.v("vf", "fragment2-->setUserVisibleHint() false");
//		}
//
//	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v("vf", "fragment2-->onDestroy()");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.v("vf", "fragment2-->onPause()");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.v("vf", "fragment2-->onResume()");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.v("vf", "fragment2-->onStart()");

		Log.v("vf", "fragment2-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.v("vf", "fragment2-->onStop()");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.v("vf", "fragment2-->onSaveInstanceState()");
	}

	@Override
	public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);

		Log.v("vf", "fragment2-->onViewStateRestored()");
	}

	@Override
	public void loadData() {
		Log.v("vf", "fragment2-->loadData()");
	}

}
