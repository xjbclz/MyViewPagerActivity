package huahua.viewpager;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class fragment1 extends baseFragment{
	private View mMainView;
	private TextView tv;
	private Button btn;
    private LinearLayout mRoot;

    private static boolean isHasCreateDialog = false;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.v("vf", "fragment1-->onCreate()");

		LayoutInflater inflater = getActivity().getLayoutInflater();
		mMainView = inflater.inflate(R.layout.fragment1, (ViewGroup)getActivity().findViewById(R.id.viewpager), false);

		tv = (TextView)mMainView.findViewById(R.id.tv1);
		btn = (Button)mMainView.findViewById(R.id.btn1);
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				tv.setText("Hello Viewpager\"");

//				Snackbar.make(getView(), "Hello Viewpager", Snackbar.LENGTH_LONG)
//						.setAction("Action", null).show();
//
//				Snackbar.make(getView(), "AA", Snackbar.LENGTH_LONG)
//						.setAction("Action", null).show();

//				rwAlertDialog(getActivity(), "AlertDilalog 显示提示信息");

				Intent intent=new Intent(getActivity(),Main2Activity.class);
				startActivity(intent);
			}
		});

		Log.v("vf", "fragment1-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		Log.v("vf", "fragment1-->onCreateView()");

		ViewGroup p = (ViewGroup) mMainView.getParent();
		if (p != null) {
			p.removeAllViewsInLayout();
			Log.v("vf", "fragment1-->移除已存在的View");
		}

		Toast.makeText(getActivity(), "您选择了1页卡", Toast.LENGTH_LONG).show();

        mRoot = (LinearLayout) mMainView.findViewById(R.id.fragment1);

//		Snackbar.make(mRoot, "您选择了1", Snackbar.LENGTH_SHORT).show();

		Log.v("vf", "fragment1-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));

		return mMainView;
	}

//    @Override
//	public void onActivityCreated(Bundle savedInstanceState) {
//		super.onActivityCreated(savedInstanceState);
//
//		Log.v("vf", "fragment1-->onActivityCreated()");
//
////		Snackbar.make(getView(), "Snackbar1", Snackbar.LENGTH_LONG)
////				.setAction("Action", null).show();
//
//		Log.v("vf", "fragment1-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));
//	}
//
//	@Override
//	public void setUserVisibleHint(boolean isVisibleToUser) {
//		super.setUserVisibleHint(isVisibleToUser);
//
//		if (isVisibleToUser) {
//			Log.v("vf", "fragment1-->setUserVisibleHint() true");
//
//			Log.v("vf", "fragment1-->load data");
//
//			rwAlertDialog(getActivity(), "AlertDilalog 显示提示信息");
//
//		}else{
//			Log.v("vf", "fragment1-->setUserVisibleHint() false");
//		}
//
//	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.v("vf", "fragment1-->onDestroy()");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.v("vf", "fragment1-->onPause()");
	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.v("vf", "fragment1-->onResume()");
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.v("vf", "fragment1-->onStart()");

		Log.v("vf", "fragment1-->mUserVisibleHint=" + String.valueOf(getUserVisibleHint()));
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.v("vf", "fragment1-->onStop()");
	}

	public void rwAlertDialog(
			final Context context, String messageText) {

        Log.e("vf", "rwAlertDialog");

		if (!isHasCreateDialog) {
            isHasCreateDialog = true;



            AlertDialog.Builder builder = new AlertDialog.Builder(context);
			builder.setTitle("提示")
					.setIcon(R.drawable.ic_launcher)
					.setMessage(messageText)
					.setCancelable(true)
					.setPositiveButton("确定", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
						}
					}).setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    }).create().show();

			builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
				@Override
				public void onDismiss(DialogInterface dialog) {
                    isHasCreateDialog = false;

					Log.e("vf", "onDismiss");
				}
			});
		}
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		Log.v("vf", "fragment1-->onActivityCreated()");

	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);

		Log.v("vf", "fragment1-->onSaveInstanceState()");
	}

	@Override
	public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);

		Log.v("vf", "fragment1-->onViewStateRestored()");
	}

	@Override
	public void loadData() {
		Log.v("vf", "fragment1-->loadData()");

		rwAlertDialog(getActivity(), "不是懒加载");
	}

	public void onBackPressed(){
		rwAlertDialog(getActivity(), "back key");
	}


}
