package co.com.k4soft.introduccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtNombre;
    private TextView txtApellido;
    private EditText editValue;
    private Button btnAceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        setInfo();
        onClickAceptar();

    }

    /*por layout*/
    public void onClickAceptar2(View view) {
        capturarValor();
    }

   /*por programación (Programmatically)*/
    private void onClickAceptar() {
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                capturarValor();
            }
        });
    }

    private void capturarValor() {
        String value = editValue.getText().toString();
        if("".equals(value)){
            editValue.setError(getString(R.string.requerido));
        }else{
            editValue.setText("");
            Toast.makeText(getApplicationContext(), value, Toast.LENGTH_LONG).show();
        }

    }

    private void setInfo() {
        txtNombre.setText("Diego");
        txtApellido.setText("García Pineda");
    }

    private void initComponents() {
        txtNombre =  findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        editValue = findViewById(R.id.editValue);
        btnAceptar = findViewById(R.id.btnAceptar);
    }
}
