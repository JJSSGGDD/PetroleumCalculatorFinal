package com.example.petroleumcalculator.ui.gravedadapi;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.petroleumcalculator.R;


public class GravedadApiFragment extends Fragment {

    private EditText gravedadespecifica2;
    private Button calculargravedadapi2, eliminargravedadapi2;
    private TextView gradosapi2, tipodehidrocarburo2;
    private ImageView imagenejemplo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // View rootView = inflater.inflate(R.layout.fragment_gravedad_api, container, false);
        View view = inflater.inflate(R.layout.fragment_gravedad_api, container, false);

        //cuando ingresa los datos de usuario

        gravedadespecifica2 = (EditText) view.findViewById(R.id.txt2gravedadespecifica);
        calculargravedadapi2 = (Button) view.findViewById(R.id.btncalculargravedadapi);
        eliminargravedadapi2 = (Button) view.findViewById(R.id.btneliminargravedadapi);
        gradosapi2 = (TextView) view.findViewById(R.id.txt2gradosapi);
        tipodehidrocarburo2 = (TextView) view.findViewById(R.id.txt2tipodehidrocarburo);
        imagenejemplo = (ImageView) view.findViewById(R.id.imgimagenejemplo);

        calculargravedadapi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double ngravedadespecifica = Double.parseDouble(gravedadespecifica2.getText().toString());
                double resultadogravedadapi = ((141.5 / ngravedadespecifica) - 131.5);
                gradosapi2.setText("Grados API : " + String.format("%.3f", resultadogravedadapi)); //"%2.f" = para solo dos decimales

                if (resultadogravedadapi <= 10)
                    tipodehidrocarburo2.setText("Tipo de Hidrocarburo : Crudo Extra Pesado");
                else if (resultadogravedadapi > 10 && resultadogravedadapi <= 22.3)  //&& = funcion logica "y"
                    tipodehidrocarburo2.setText("Tipo de Hidrocarburo : Crudo Pesado");
                else if (resultadogravedadapi > 22.3 && resultadogravedadapi <= 31.1) {  //&& = funcion logica "y"
                    tipodehidrocarburo2.setText("Tipo de Hidrocarburo : Crudo Mediano");
                    imagenejemplo.setVisibility(View.VISIBLE); // Configurar que una imagen sea visible cuando ocurra un condicional
                }
                else if (resultadogravedadapi > 31.1) //&& = funcion logica "y"
                {
                    tipodehidrocarburo2.setText("Tipo de Hidrocarburo : Crudo Ligero");
                    imagenejemplo.setVisibility(View.INVISIBLE); // Configurar que una imagen sea invisble cuando ocurra un condicional
                }
            }

            private ImageView getImagenejemplo() {
                return imagenejemplo;
            }
        });

        eliminargravedadapi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedadespecifica2.setText("");
                gradosapi2.setText("\"Grados API : ");
                tipodehidrocarburo2.setText("\"Tipo de Hidrocarburo :");
            }
        });

        return view;
    }
}
