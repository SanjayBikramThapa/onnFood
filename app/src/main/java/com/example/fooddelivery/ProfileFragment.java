package com.example.fooddelivery;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

    Context mContext1,mContext2,mContext3,mContext4,mContext5;
    TextView tvUserProfile,tvOrderHistory,tvChangePassword,tvDeliveryAddress;


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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
        View view= inflater.inflate(R.layout.fragment_profile, container, false);
        init(view);
        init1(view);
        init2(view);
        init3(view);
        return view;
    }

    //function call for Notification
    void init(View view){
        tvUserProfile = view.findViewById(R.id.tvUserProfile);
        tvUserProfile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext1, UserProfile.class);
                startActivity(intent);

            }
        });
    }


    //function call for Notification
    void init1(View view){
        tvOrderHistory = view.findViewById(R.id.tvOrderHistory);
        tvOrderHistory.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext2, OrderHistory.class);
                startActivity(intent);

            }
        });
    }
    //function call for Notification
    void init2(View view){
        tvChangePassword = view.findViewById(R.id.tvChangePassword);
        tvChangePassword.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext3, ChangePasswords.class);
                startActivity(intent);

            }
        });
    }

    //function call for Notification
    void init3(View view){
        tvDeliveryAddress = view.findViewById(R.id.tvDeliveryAddress);
        tvDeliveryAddress.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext4, DeliveryAddress.class);
                startActivity(intent);

            }
        });
    }


}