package com.example.petroleumcalculator.ui.gravedadespecifica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.petroleumcalculator.R;


public class GravedadEspecificaFragment extends Fragment {

    private EditText gradosapi;
    private Button calculargravedadespecifica, eliminargravedadespecifica;
    private TextView gravedadespecifica, tipodehidrocarburo;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // View rootView = inflater.inflate(R.layout.fragment_gravedad_especifica, container, false);
        View view = inflater.inflate(R.layout.fragment_gravedad_especifica, container, false);

        //cuando ingresa los datos de usuario

        gradosapi = (EditText) view.findViewById(R.id.txtgradosapi);
        calculargravedadespecifica = (Button) view.findViewById(R.id.btncalculargravedadespecifica);
        eliminargravedadespecifica = (Button) view.findViewById(R.id.btneliminargravedadespecifica);
        gravedadespecifica = (TextView) view.findViewById(R.id.txtgravedadespecifica);
        tipodehidrocarburo = (TextView) view.findViewById(R.id.txttipodehidrocarburo);

        calculargravedadespecifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ngradosapi = Double.parseDouble(gradosapi.getText().toString());
                double resultadogravedadespecifica = (141.5 / (ngradosapi + 131.5));
                gravedadespecifica.setText("Gravedad Especifica (GE) : " + String.format("%.3f", resultadogravedadespecifica)); //"%2.f" = para solo dos decimales

                if (ngradosapi <= 10)
                    tipodehidrocarburo.setText("Tipo de Hidrocarburo : Crudo Extra Pesado");
                else if (ngradosapi > 10 && ngradosapi <= 22.3)  //&& = funcion logica "y"
                    tipodehidrocarburo.setText("Tipo de Hidrocarburo : Crudo Pesado");
                else if (ngradosapi > 22.3 && ngradosapi <= 31.1)  //&& = funcion logica "y"
                    tipodehidrocarburo.setText("Tipo de Hidrocarburo : Crudo Mediano");
                else if (ngradosapi > 31.1) //&& = funcion logica "y"
                    tipodehidrocarburo.setText("Tipo de Hidrocarburo : Crudo Ligero");
            }
        });

        eliminargravedadespecifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gradosapi.setText("");
                gravedadespecifica.setText("\"GRAVEDAD ESPECIFICA (GE) :");
                tipodehidrocarburo.setText("\"TIPO DE HIDROCARBURO (°API) :");
            }
        });
        return view;
    }
}




















