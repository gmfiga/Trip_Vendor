package com.example.tripvendor.main.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tripvendor.R;
import com.example.tripvendor.main.dao.PackageDAO;
import com.example.tripvendor.main.model.Package;
import com.example.tripvendor.main.ui.adapter.PackageListAdapter;

import java.util.List;

public class PackageListActivity extends AppCompatActivity {


    public static final String APPBAR_TITLE = "Packages";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_list);

        setTitle(APPBAR_TITLE);

        configureList();
    }

    private void configureList() {
        ListView packageList = findViewById(R.id.activity_package_listview);
        List<Package> packages = new PackageDAO().list();
        packageList.setAdapter(new PackageListAdapter(packages, this));
    }
}
