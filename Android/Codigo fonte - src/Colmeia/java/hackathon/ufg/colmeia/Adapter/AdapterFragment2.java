package hackathon.ufg.colmeia.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import hackathon.ufg.colmeia.Model.EstamosFz;
import hackathon.ufg.colmeia.Model.FazAi;
import hackathon.ufg.colmeia.R;

import java.util.ArrayList;

public class  AdapterFragment2 extends ArrayAdapter<EstamosFz> {

    private final Context context;
    private final ArrayList<EstamosFz> persons;

    public AdapterFragment2(Context context, ArrayList<EstamosFz> persons) {
        super(context,-1,persons);
        this.context = context;
        this.persons = persons;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_tab2, parent, false);

        EstamosFz fazAi = persons.get(position);

        TextView txtName = view.findViewById(R.id.textViewName);
        TextView txtDescricao = view.findViewById(R.id.textViewTeam);

        ImageView img = view.findViewById(R.id.imageView);
        //Button btn = view.findViewById(R.id.buttonDelete);

        txtName.setText(fazAi.getNomeCriador());
        txtDescricao.setText(fazAi.getDescricao());
        img.setImageResource(R.drawable.female);

        return view;
    }

}