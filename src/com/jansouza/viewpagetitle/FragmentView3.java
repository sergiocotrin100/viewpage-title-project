package com.jansouza.viewpagetitle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentView3 extends Fragment {
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
		View myView = inflater.inflate(R.layout.fragment_layout, container, false);
		
		TextView text = (TextView) myView.findViewById(R.id.text);
		text.setText("FragmentView3");
		
		return myView;
	}

}