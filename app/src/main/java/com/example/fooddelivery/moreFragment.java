package com.example.fooddelivery;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class moreFragment extends Fragment {

    Context mContext1,mContext2,mContext3,mContext4,mContext5;


    TextView tvNotification,tvFeedback,tvFaq,tvBeOurPartner,tvPrivacy;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public moreFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static moreFragment newInstance(String param1, String param2) {
        moreFragment fragment = new moreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext1 = context;
        mContext2 = context;
        mContext3 = context;
        mContext4 = context;
        mContext5 = context;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_more, container, false);
        init(view);
        init1(view);
        init2(view);
        init3(view);
        init4(view);
        return view;
    }
    //function call for Notification
    void init(View view){
        tvNotification = view.findViewById(R.id.tvNotification);
        tvNotification.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext1, NotificationActivity.class);
                startActivity(intent);

            }
        });
    }
    //function for feedback
    void init1(View view){
        tvFeedback = view.findViewById(R.id.tvFeedback);
        tvFeedback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext2, FeedBack.class);
                startActivity(intent);
            }
        });
    }

    //function for feedback
    void init2(View view){
        tvFaq = view.findViewById(R.id.tvFaq);
        tvFaq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext3, FAQActivity.class);
                startActivity(intent);
            }
        });
    }

    //function for feedback
    void init3(View view){
        tvBeOurPartner = view.findViewById(R.id.tvBeOurPartner);
        tvBeOurPartner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext4, BeOurPartner.class);
                startActivity(intent);
            }
        });
    }

    //function for feedback
    void init4(View view){
        tvPrivacy = view.findViewById(R.id.tvPrivacy);
        tvPrivacy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext5, Privacy_And_PolicyActivity.class);
                startActivity(intent);
            }
        });
    }

}




