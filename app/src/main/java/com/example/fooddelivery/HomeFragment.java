package com.example.fooddelivery;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fooddelivery.Adapters.FoodBeverageAdapter;
import com.example.fooddelivery.Adapters.ImageSliderAdapter;
import com.example.fooddelivery.Adapters.OurPartnerAdapter;
import com.example.fooddelivery.Adapters.RestaurantDetailAdapter;
import com.example.fooddelivery.Adapters.WeeklyDealsAdapter;
import com.example.fooddelivery.Models.FoodBeverageModel;
import com.example.fooddelivery.Models.OurPartnerModel;
import com.example.fooddelivery.Models.ProductModel;
import com.example.fooddelivery.Models.RestaurantDetailModel;
import com.example.fooddelivery.Models.SliderImageListModel;
import com.example.fooddelivery.Models.WeeklyDealsModel;
import com.example.fooddelivery.Remote.ApiService;
import com.example.fooddelivery.Remote.ApiUtils;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    RecyclerView recycle,recycle1,recycle2;
    WeeklyDealsAdapter adapter;
    List<WeeklyDealsModel>data;
    OurPartnerAdapter adapter1;
    List<OurPartnerModel>data1;
    FoodBeverageAdapter adapter2;
    List<FoodBeverageModel>data2;
    Context mContext,mContext1,mContext2;
    List<SliderImageListModel> slider;
    ImageView imgRestaurantImage;


    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
        mContext1 =context;
        mContext2 = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //function for loading top weekly deals in home fragment
        ///we need to pass view here
        TopWeekDeals(view);
        TopOurPartner(view);
        TopFoodBeverage(view);
        slider(view);
        return view;
    }


    void TopWeekDeals(View view) {
//    name = view.findViewById(R.id.tvFoodName);
//    price = view.findViewById(R.id.tvPriceForWeeklyDeals);

//        recycle = view.findViewById(R.id.rvWeeklyDeals); //getting reference of recycle from homeFragment.xml file
//
//        LinearLayoutManager linearLayoutManager;
//        linearLayoutManager = new LinearLayoutManager(mContext);
//        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
//        recycle.setLayoutManager(linearLayoutManager);
//
//        ApiService ap = ApiUtils.ApiService();
//        ap.productAll().enqueue(new Callback< List<ProductModel>>() {
//            @Override
//            public void onResponse(Call< List<ProductModel>> call, Response< List<ProductModel>> response) {
//                if (response.isSuccessful()){
//                    List<ProductModel> prducts = response.body();
//
//                    adapter = new WeeklyDealsAdapter(prducts, mContext);
//                    recycle.setAdapter(adapter);
//                }
//            }
//
//            @Override
//            public void onFailure(Call< List<ProductModel>> call, Throwable t) {
//
//            }
//            });

            //Function definitions of top weekly deals
        recycle = view.findViewById(R.id.rvWeeklyDeals); //getting reference of recycle from homeFragment.xml file
        data = new ArrayList<>();
        //initializing data for displaying it in to weekly deals section in home fragments
        data = new ArrayList<>();
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));
        data.add(new WeeklyDealsModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger"," NPR 180"));

        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recycle.setLayoutManager(linearLayoutManager);
        adapter = new WeeklyDealsAdapter(data, mContext);
        recycle.setAdapter(adapter);

    }

    void TopOurPartner(View view){

        recycle1 =  view.findViewById(R.id.rvOurPartner);
        data1 = new ArrayList<>();
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));
        data1.add(new OurPartnerModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant And Bar"));

        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = new LinearLayoutManager(mContext1);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recycle1.setLayoutManager(linearLayoutManager);
        adapter1 = new OurPartnerAdapter(data1, mContext1);
        recycle1.setAdapter(adapter1);

    }


    void TopFoodBeverage(View view){
        // fetching data from api
        recycle = view.findViewById(R.id.rvFoodAndBeverage); //getting reference of recycle from homeFragment.xml file

        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = new LinearLayoutManager(mContext2);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recycle.setLayoutManager(linearLayoutManager);

        ApiService ap = ApiUtils.ApiService();
        ap.productAll().enqueue(new Callback< List<ProductModel>>() {
            @Override
            public void onResponse(Call< List<ProductModel>> call, Response< List<ProductModel>> response) {
                if (response.isSuccessful()){
                    List<ProductModel> prudct = response.body();

                    adapter2 = new FoodBeverageAdapter(prudct, mContext2);
                    recycle.setAdapter(adapter2);
                }
            }

            @Override
            public void onFailure(Call< List<ProductModel>> call, Throwable t) {

            }
            });




//        recycle2 =  view.findViewById(R.id.rvFoodAndBeverage);
//        data2 = new ArrayList<>();
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//        data2.add(new FoodBeverageModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","burger","This is special veg food we provide hygenic food ","180"));
//
//        LinearLayoutManager linearLayoutManager;
//        linearLayoutManager = new LinearLayoutManager(mContext2);
//        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
//        recycle2.setLayoutManager(linearLayoutManager);
//        adapter2 = new FoodBeverageAdapter(data2, mContext2);
//        recycle2.setAdapter(adapter2);

    }
    // image slider

    void slider( View view){
        slider = new ArrayList<>();
        slider.add(new SliderImageListModel("Pizza", "https://images.unsplash.com/photo-1551782450-a2132b4ba21d?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=750&q=80"));
        slider.add(new SliderImageListModel("Pizza", "https://media.metrolatam.com/2020/06/05/pizzacaseiradeli-c83618a926f77e3ce9475aba5fe8c1ed-1200x800.jpg"));
        slider.add(new SliderImageListModel("Burger", "https://th.bing.com/th/id/OIP.AFg98bdzMHUgAaKQLm5pDQHaEa?pid=ImgDet&rs=1"));



        SliderView sliderView = view.findViewById(R.id.imageSlider);
        sliderView.setSliderAdapter(new ImageSliderAdapter(mContext, slider));


        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                Log.i("GGG", "onIndicatorClicked: " + sliderView.getCurrentPagePosition());
            }
        });

    }
    }

