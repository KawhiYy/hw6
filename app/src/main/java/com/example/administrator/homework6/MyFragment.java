package com.example.administrator.homework6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyFragment extends Fragment {
    int imgid;
    String text;
    ImageView iv;
    TextView tv;
    Bundle arg;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arg = getArguments();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item,container,false);
        iv = (ImageView) view.findViewById(R.id.iv);
        tv = (TextView) view.findViewById(R.id.tv);
        tv.setText(arg.getString("sg"));

        int page = arg.getInt("fruit");
        iv.setImageResource(page);
        if(page == R.drawable.banana){

            view.setBackgroundResource(R.color.colorAccent);
        }
        if(page == R.drawable.orange){
            view.setBackgroundResource(R.color.colorPrimary);
        }
        if(page == R.drawable.apple){
            view.setBackgroundResource(R.color.colorPrimaryDark);
        }

        return view;
    }


}
