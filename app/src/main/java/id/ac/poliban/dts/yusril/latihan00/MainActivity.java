package id.ac.poliban.dts.yusril.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //konten view dihubungkan dengan koding
        //java kita
        setContentView(R.layout.activity_main);

        //menghuungkan view dengan object Button
        // dalam source code kita
        Button btFirst = findViewById(R.id.btFirst);
        final Button btSecond = findViewById(R.id.btSecond);
        final Button btThird = findViewById(R.id.btThird);
        final Button btForth = findViewById(R.id.btForth);

        //Interface onClikListener merupakan interface yang ada dikelas view
        //hanyar berisi satu method onCLick(View view)

        //berikut kode memasang event listener onclick pada object Button
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hei Anda Telah Menekan Tombol Pertama", Toast.LENGTH_SHORT).show();

            btSecond.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Hei Anda Telah Menekan Tombol Kedua", Toast.LENGTH_SHORT).show();

                btThird.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Hei Anda Telah Menekan Tombol Ketiga", Toast.LENGTH_SHORT).show();

                    btForth.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(MainActivity.this, "Hei Anda Telah Menekan Tombol Keempat", Toast.LENGTH_SHORT).show();
                        }
                    });
                    }
                });
                }
            });
            }
        });
    }
}
