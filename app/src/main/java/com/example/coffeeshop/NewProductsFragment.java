package com.example.coffeeshop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coffeeshop.adapters.ViewAllAdapter;
import com.example.coffeeshop.models.ProductModel;

import java.util.ArrayList;
import java.util.List;


public class NewProductsFragment extends Fragment {

    private RecyclerView recyclerView;
    private ViewAllAdapter adapter;
    private List<ProductModel> productList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_products, container, false);

        recyclerView = view.findViewById(R.id.pop_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Aquí inicializas la lista de productos (puedes obtenerla de Firebase)
        productList = new ArrayList<>();

        // Inicializas el adaptador con la lista de productos
        adapter = new ViewAllAdapter(getActivity(), productList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}