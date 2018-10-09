package com.example.vlwk.invent;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, COLORS);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                view.findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_dropdown_item_1line, ITEMS);
        AutoCompleteTextView textView2 = (AutoCompleteTextView)
                view.findViewById(R.id.autoCompleteTextView2);
        textView2.setAdapter(adapter2);

        return view;

    }

    private static final String[] COLORS = new String[] {
            "Red", "Orange", "Yellow", "Green", "Blue", "Purple", "Violet"
    };

    private static final String[] ITEMS = new String[] {
            "Blouses/Shirt (Women)", "Dress (Women)", "Skirt (Women)", "Sweatshirt/Hoodie (Men)", "Cardigan (Women)", "Jacket/Coat (Women)", "Sweater (Women)",
            "Sweater (Men)", "Graphic Tee (Women)", "Shorts (Women)", "Pants (Women)", "Romper/Jumpsuit (Women)", "Tee/Tank (Men)", "Denim (Women)", "Shorts (Men)", "Pants (Men)", "Denim (Men)", "Jacket/Vest (Men)",
            "Sweatshirt/Hoodie (Women)", "Legging (Women)", "Shirt/Polo (Men)", "Suit (Men)"
    };

}
