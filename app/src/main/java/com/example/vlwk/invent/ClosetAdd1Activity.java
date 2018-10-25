package com.example.vlwk.invent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ClosetAdd1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_closet_add1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, COLORS);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, ITEMS);
        AutoCompleteTextView textView2 = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView2);
        textView2.setAdapter(adapter2);
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
