package huahua.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

abstract class baseFragment extends Fragment{

	private boolean isLazyLoadData = false;
	private boolean isHasLoadDate = false;


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Log.v("vf", "baseFragment-->onActivityCreated()");

		//如果不需要懒加载数据，在执行到onActivityCreated函数时，就开始加载数据
		if(!isLazyLoadData){
			loadData();
		}
	}

	@Override
	public void setUserVisibleHint(boolean isVisibleToUser) {
		super.setUserVisibleHint(isVisibleToUser);

		if (isVisibleToUser) {
			Log.v("vf", "baseFragment-->setUserVisibleHint() true");

			if (isLazyLoadData) {
				if (!isHasLoadDate) {
					isHasLoadDate = true;

					loadData();
				}
			}

		}else{
			Log.v("vf", "baseFragment-->setUserVisibleHint() false");
		}

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v("vf", "baseFragment-->onDestroy()");

		isHasLoadDate = false;

		isLazyLoadData = false;
	}

	public void setLazyLoadData(boolean isSetLazyLoadData) {
		Log.v("vf", "baseFragment-->setLazyLoadData()");

		isLazyLoadData = isSetLazyLoadData;
	}

	abstract void loadData();
}
