package com.example.tripvendor.main.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tripvendor.R;
import com.example.tripvendor.main.util.CurrencyUtil;
import com.example.tripvendor.main.util.DaysUtil;
import com.example.tripvendor.main.util.ResourcesUtil;
import com.example.tripvendor.main.model.Package;

import java.util.List;

public class PackageListAdapter extends BaseAdapter {

    private final List<Package> packages;
    private Context context;

    public PackageListAdapter(List<Package> packages, Context context){
        this.packages = packages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return packages.size();
    }

    @Override
    public Package getItem(int position) {
        return packages.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View createdView = LayoutInflater.from(context).inflate(R.layout.item_package,parent, false);

        Package aPackage = packages.get(position);

        showCity(createdView, aPackage);
        showImage(createdView, aPackage);
        showDays(createdView, aPackage);
        showPrice(createdView, aPackage);

        return createdView;
    }

    private void showPrice(View createdView, Package aPackage) {
        TextView price = createdView.findViewById(R.id.item_package_price);
        String currency = CurrencyUtil.formatCurrencyToUS(aPackage.getPrice());
        price.setText(currency);
    }


    private void showDays(View createdView, Package aPackage) {
        TextView days = createdView.findViewById(R.id.item_package_days);
        String daysText = DaysUtil.formatText(aPackage.getDays());
        days.setText(daysText);
    }

    private void showImage(View createdView, Package aPackage) {
        ImageView image = createdView.findViewById(R.id.item_package_image);
        Drawable drawablePackageImage = ResourcesUtil.getDrawable(context, aPackage.getImage());
        image.setImageDrawable(drawablePackageImage);
    }

    private void showCity(View createdView, Package aPackage) {
        TextView city = createdView.findViewById(R.id.item_package_city);
        city.setText(aPackage.getCity());
    }
}
