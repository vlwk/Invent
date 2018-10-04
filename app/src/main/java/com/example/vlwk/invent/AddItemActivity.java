package com.example.vlwk.invent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AddItemActivity extends AppCompatActivity {

    private static final String[] COLOURS = new String[] {
            "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Purple"
    };

    private static final String[] CLOTHING = new String[] {
            "Denim (Men)", "Jacket/Vest (Men)", "Pants (Men)", "Shirt/Polo (Men)", "Shorts (Men)", "Suit (Men)", "Sweater (Men)", "Sweatshirt/Hoodie (Men)", "Tee/Tank (Men)", "Cardigan (Women)", "Denim (Women)", "Dress (Women)", "Graphic Tee (Women)", "Jacket/Coat (Women)", "Legging (Women)", "Pants (Women)", "Romper/Jumpsuit (Women)", "Shorts (Women)", "Skirt (Women)", "Sweater (Women)", "Sweatshirt/Hoodie (Women)", "Tee/Tank (Women)"
    };

    String selected_colour;
    String thisshitisnotused;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        AutoCompleteTextView editText = findViewById(R.id.colourselect);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, COLOURS);
        editText.setAdapter(adapter);

        AutoCompleteTextView editText2 = findViewById(R.id.clothingselect);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, CLOTHING);
        editText2.setAdapter(adapter2);

    }

    public void submitClothing(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
