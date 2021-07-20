package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

//import com.example.fooddelivery.Adapters.NotificationAdapter;
import com.example.fooddelivery.Adapters.PrivacyAndPolicyAdapter;
//import com.example.fooddelivery.Models.NotificationModel;
import com.example.fooddelivery.Models.PrivacyAndPolicyModel;

import java.util.ArrayList;
import java.util.List;

public class Privacy_And_PolicyActivity extends AppCompatActivity {

    RecyclerView rcvPrivacy;
    PrivacyAndPolicyAdapter adapter;
    List<PrivacyAndPolicyModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_and_policy);

        rcvPrivacy = findViewById(R.id.rvPrivacyAndPolicy);
        list = new ArrayList<>();
        list.add(new PrivacyAndPolicyModel(" 1. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 2. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 3. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 4. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 5. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 6. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 7. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 8. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 9. You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 10.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 11.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 12.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 13.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 14.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 15.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));
        list.add(new PrivacyAndPolicyModel(" 16.You can always choose not to provide information although it may be required to engage in activities on OnnFood."));

        rcvPrivacy.setLayoutManager( new LinearLayoutManager(this));
        adapter = new PrivacyAndPolicyAdapter(list, this);
        rcvPrivacy.setAdapter( adapter);
    }
}