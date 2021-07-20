//package com.example.fooddelivery;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//
////import com.example.fooddelivery.Adapters.NotificationAdapter;
////import com.example.fooddelivery.Adapters.OrderHistoryAdapter;
////import com.example.fooddelivery.Models.NotificationModel;
////import com.example.fooddelivery.Models.OrderHistoryModel;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class NotificationActivity extends AppCompatActivity {
//
//    RecyclerView rcvNotification;
//    NotificationAdapter adapter;
//    List<NotificationModel> list;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_notification);
//
//        rcvNotification = findViewById(R.id.rvNotification);
//        list = new ArrayList<>();
//
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//        list.add(new NotificationModel("New Year Offer !!!","2021/01/01","8 pcs Hot and Crispy Chicken Bucket for just Rs 990 Tap the OnnFood App to place order"));
//
//        rcvNotification.setLayoutManager( new LinearLayoutManager(this));
//        adapter = new NotificationAdapter(list, this);
//        rcvNotification.setAdapter( adapter);
//
//    }
//}