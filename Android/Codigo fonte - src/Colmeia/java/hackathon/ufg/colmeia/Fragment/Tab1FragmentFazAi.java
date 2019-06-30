package hackathon.ufg.colmeia.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import hackathon.ufg.colmeia.Activity.Main;
import hackathon.ufg.colmeia.Adapter.AdapterFragment1;
import hackathon.ufg.colmeia.Model.FazAi;
import hackathon.ufg.colmeia.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tab1FragmentFazAi  extends Fragment {

    private ListView listView;
    TextView txt;
    private ImageView imgViewAdd;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_1_faz_ai, container, false);
        listView = (ListView) rootView.findViewById(R.id.frag1_listview);
        txt = (TextView) rootView.findViewById(R.id.fragment_txt_1);

        imgViewAdd = (ImageView) rootView.findViewById(R.id.frag1_imgview_add);
        imgViewAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Criação em desenvolvimento", Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AdapterFragment1 adapter = new AdapterFragment1(getContext(), todosOsCursos());
        listView.setAdapter(adapter);
    }


    private ArrayList<FazAi> todosOsCursos() {

        ArrayList<FazAi> lista = new ArrayList<>();
        lista.add(new FazAi("Alimentar os cachorros do campus", "", "Criamos um grupo voluntário de 20 pessoas para cuidar todas quartas feiras dos cachorros do campus."));
        lista.add(new FazAi("Solução para a dengue no Goiânia 2", "", "O bairro Goiânia 2 apresenta o maior número de casos de dengue. Precisamos de uma solução.",R.drawable.female3));

        return lista;
    }

}


