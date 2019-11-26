package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EditText Editar;
    private EditText Editar2;
    private Button btnProcessar;
    private TextView lblnum1;
    private TextView lblnum2;
    private ProjetoAPIService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lblnum1 = findViewById(R.id.lblNum1);
        lblnum2 = findViewById(R.id.lblNum2);
        Editar  = findViewById(R.id.Editar);
        Editar2 = findViewById(R.id.Editar2);
        btnProcessar = findViewById(R.id.btnProcessar);
    }


    public void BtnProcessar(View view)
    {
        this.service = new Retrofit.Builder().baseUrl("http://172.16.58.22:8001/api/funcoes/divisao/num1/num2")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(ProjetoAPIService.class);


    }



}
