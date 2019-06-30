package hackathon.ufg.colmeia.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import hackathon.ufg.colmeia.Model.FazAi;
import hackathon.ufg.colmeia.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterFragment1 extends ArrayAdapter<FazAi> {

    private final Context context;
    private final ArrayList<FazAi> persons;

    public AdapterFragment1(Context context, ArrayList<FazAi> persons) {
        super(context,-1,persons);
        this.context = context;
        this.persons = persons;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_tab1, parent, false);

        FazAi fazAi = persons.get(position);

        TextView txtName = view.findViewById(R.id.textViewName);
        TextView txtDescricao = view.findViewById(R.id.textViewTeam);

        ImageView img = view.findViewById(R.id.imageView);
        img.setImageResource(fazAi.getIntImage());
        //Button btn = view.findViewById(R.id.buttonDelete);

        txtName.setText(fazAi.getNomeCriador());
        txtDescricao.setText(fazAi.getDescricao());
        img.setImageResource(R.drawable.female);

        return view;
    }

}