package id.sam.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView txtCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCount = findViewById(R.id.txtCount);
    }

    public void showToast(View view){
        Toast.makeText(this,"Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view){
        ++mCount;
        if(txtCount != null){
            txtCount.setText(Integer.toString(mCount));
        }
    }
}