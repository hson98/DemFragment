package com.tranhuyson.demfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.tranhuyson.demfragment.databinding.FragmentView02Binding;

public class Fragment02 extends Fragment {
    FragmentView02Binding binding;

    public static Fragment02 newInstance() {
        
        Bundle args = new Bundle();
        
        Fragment02 fragment = new Fragment02();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_view02,container,false);
        binding.tvfragment02.setText("Fragment02");
        return binding.getRoot();
    }
}
