package com.example.petroleumcalculator.ui.numerodereynolds;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.petroleumcalculator.R;


public class NumeroDeReynoldsFragment extends Fragment {

    private EditText densidaddelfluido, diametrodelatuberia, velocidaddelfluido, viscosidaddinamicadelfluido;
    private Button calcularnumerodereynolds, eliminarnumerodereynolds;
    private TextView numerodereynolds, tipodefluido;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // View rootView = inflater.inflate(R.layout.fragment_gravedad_api, container, false);
        View view = inflater.inflate(R.layout.fragment_numero_de_reynolds, container, false);

        //cuando ingresa los datos de usuario

        densidaddelfluido = (EditText) view.findViewById(R.id.txtdensidaddelfluido);
        diametrodelatuberia = (EditText) view.findViewById(R.id.txtdiametrodelatuberia);
        velocidaddelfluido = (EditText) view.findViewById(R.id.txtvelocidaddelfluido);
        viscosidaddinamicadelfluido = (EditText) view.findViewById(R.id.txtviscosidaddinamicadelfluido);
        calcularnumerodereynolds = (Button) view.findViewById(R.id.btncalcularnumerodereynolds);
        eliminarnumerodereynolds = (Button) view.findViewById(R.id.btneliminarcalculodenumerodereynolds);
        numerodereynolds = (TextView) view.findViewById(R.id.txtnumerodereynolds);
        tipodefluido = (TextView) view.findViewById(R.id.txttipodeflujo);

        calcularnumerodereynolds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ndensidaddelfluido = Double.parseDouble(densidaddelfluido.getText().toString());
                double ndiametrodelatuberia = Double.parseDouble(diametrodelatuberia.getText().toString());
                double nvelocidaddelfluido = Double.parseDouble(velocidaddelfluido.getText().toString());
                double nviscosidaddinamicadelfluido = Double.parseDouble(viscosidaddinamicadelfluido.getText().toString());
                double resultadonumerodereynolds = ((ndensidaddelfluido * ndiametrodelatuberia * nvelocidaddelfluido )/ nviscosidaddinamicadelfluido);
                numerodereynolds.setText("Numero de Reynolds : " + String.format("%.3f", resultadonumerodereynolds)); //"%2.f" = para solo dos decimales

                if (resultadonumerodereynolds <= 2300)
                    tipodefluido.setText("Tipo de Flujo : Laminar");
                else if (resultadonumerodereynolds > 2300 && resultadonumerodereynolds < 4000)  //&& = funcion logica "y"
                    tipodefluido.setText("Tipo de Flujo : Transicion");
                else if (resultadonumerodereynolds >= 4000) //&& = funcion logica "y"
                    tipodefluido.setText("Tipo de Flujo : Turbulento");
            }


        });

        eliminarnumerodereynolds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                densidaddelfluido.setText("");
                diametrodelatuberia.setText("");
                velocidaddelfluido.setText("");
                viscosidaddinamicadelfluido.setText("");
                numerodereynolds.setText("\"Numero de Reynolds : ");
                tipodefluido.setText("\"Tipo de Fluido :");
            }
        });

        return view;
    }
}
