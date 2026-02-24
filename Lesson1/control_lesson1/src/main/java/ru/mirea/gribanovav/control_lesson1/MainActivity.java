package ru.mirea.gribanovav.control_lesson1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textViewStudent);
        tv.setText("New text in MIREA");
        Button myButton = findViewById(R.id.button_contact);
        myButton.setText("MireaButton");
        CheckBox cb = findViewById(R.id.check_box);
        cb.setChecked(true);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v,
                                                                            insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}