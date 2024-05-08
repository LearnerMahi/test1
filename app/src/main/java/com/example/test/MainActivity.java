package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.shapes.Circle;
import com.example.shapes.Rectangle;
import com.example.shapes.Shape;

public class MainActivity extends AppCompatActivity {
    private Spinner shapeSpinner;
    private Spinner colorSpinner;
    private Button calculateButton;
    private TextView areaTextView,atv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shapeSpinner = findViewById(R.id.shape_spinner);
        colorSpinner = findViewById(R.id.color_spinner);
        calculateButton = findViewById(R.id.calculate_button);
        areaTextView = findViewById(R.id.area_text_view);
        atv=findViewById(R.id.area_text_view2);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateArea();
            }
        });
    }

    private void calculateArea() {
        // Get selected shape and color from spinners
        String selectedShape = shapeSpinner.getSelectedItem().toString();
        String selectedColor = colorSpinner.getSelectedItem().toString();


        Shape  shape = null;
        if (selectedShape.equals("Circle")) {
            shape = new Circle(5); // Example radius, you can get it dynamically from user input
        } else if (selectedShape.equals("Rectangle")) {
            shape = new Rectangle(4, 6); // Example width and length, you can get them dynamically from user input
        }

        // Display area of the shape
        if (shape != null) {
            double area = shape.calculateArea();
            String areaString = "shape: " + selectedColor + "      " + selectedShape + "\n\nArea: " + area;

            areaTextView.setText(areaString);

        }
    }
}