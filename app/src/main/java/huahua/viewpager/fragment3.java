package huahua.viewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class fragment3 extends Fragment{
	private View mMainView;

	private TextView mTv3;

	private View mView3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("vf", "fragment3-->onCreate()");

		LayoutInflater inflater = getActivity().getLayoutInflater();
		mMainView = inflater.inflate(R.layout.fragment3, (ViewGroup)getActivity().findViewById(R.id.viewpager), false);

		mView3=inflater.inflate(R.layout.fragment3, null);

		mTv3 = (TextView)getActivity().findViewById(R.id.tv3);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.v("vf", "fragment3-->onCreateView()");

		ViewGroup p = (ViewGroup) mMainView.getParent();
		if (p != null) {
			p.removeAllViewsInLayout();
			Log.v("vf", "fragment3-->移除已存在的View");
		}

//		Snackbar.make(mMainView, "您选择了3", Snackbar.LENGTH_SHORT).show();

		Toast.makeText(getActivity(), "您选择了3页卡", Toast.LENGTH_LONG).show();

		return mMainView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Log.v("vf", "fragment3-->onActivityCreated()");

		Snackbar.make(getView(), "Snackbar3", Snackbar.LENGTH_LONG)
				.setAction("Action", null).show();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v("vf", "fragment3-->onDestroy()");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.v("vf", "fragment3-->onPause()");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.v("vf", "fragment3-->onResume()");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.v("vf", "fragment3-->onStart()");
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.v("vf", "fragment3-->onStop()");
	}

}

