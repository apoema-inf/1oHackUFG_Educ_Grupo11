package hackathon.ufg.colmeia.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import hackathon.ufg.colmeia.Adapter.AdapterFragment1;
import hackathon.ufg.colmeia.Adapter.AdapterFragment2;
import hackathon.ufg.colmeia.Model.EstamosFz;
import hackathon.ufg.colmeia.Model.FazAi;
import hackathon.ufg.colmeia.R;

import java.util.ArrayList;

public class Tab2FragmentEstamosFz extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_2_estamos_fazendo, container, false);
        listView = (ListView) rootView.findViewById(R.id.frag2_listview);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        AdapterFragment2 adapter = new AdapterFragment2(getContext(), todosOsCursos());
        listView.setAdapter(adapter);
    }

   private ArrayList<EstamosFz> todosOsCursos() {

        ArrayList<EstamosFz> lista = new ArrayList<>();
        lista.add(new EstamosFz("Olho na bomba", "", "O o aplicativo permite que o consumidor conheça em tempo real os preços praticados pelos postos revendedores de combustíveis de todo o Estado de Goiás. "));
        lista.add(new EstamosFz("Museu Antropológico da UFG", "", "Convite a todos para a palestra Pesquisa Antropológica e o Museu Antropológico da UFG: 50 Anos de Produção do Conhecimento."));
        lista.add(new EstamosFz("Open Zika", "", "O OpenZika procura substâncias candidatas a um medicamento que possa tratar as pessoas infectadas pelo vírus Zika."));

        return lista;
    }

}


