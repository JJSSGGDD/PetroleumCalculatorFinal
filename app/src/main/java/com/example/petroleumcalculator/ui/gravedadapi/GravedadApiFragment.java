package com.example.petroleumcalculator.ui.gravedadapi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.example.petroleumcalculator.R;


public class GravedadApiFragment extends Fragment {

    private EditText gravedadespecifica2;
    private Button calculargravedadapi2, eliminargravedadapi2;
    private TextView gradosapi2, tipodehidrocarburo2;

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

        calculargravedadapi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double ngravedadespecifica = Double.parseDouble(gravedadespecifica2.getText().toString());
                double resultadogravedadapi = ((141.5 / ngravedadespecifica) - 131.5);
                gradosapi2.setText("GRADOS API : " + String.format("%.3f", resultadogravedadapi)); //"%2.f" = para solo dos decimales
            }
        });

        eliminargravedadapi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravedadespecifica2.setText("");
                gradosapi2.setText("\"GRADOS API : ");
                tipodehidrocarburo2.setText("\"TIPO DE HIDROCARBURO (°API) :");
            }
        });

        return view;
    }
}
