package hackathon.ufg.colmeia.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import hackathon.ufg.colmeia.Fragment.*;
import hackathon.ufg.colmeia.Model.EstamosFz;
import hackathon.ufg.colmeia.Model.FazAi;
import hackathon.ufg.colmeia.R;

import java.util.ArrayList;

public class Main extends AppCompatActivity {


    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    ImageButton imgBtnShare;

 public    ArrayList<FazAi> listFazAi;
  public   ArrayList<EstamosFz> listEstamosFz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFazAi = new ArrayList<>();
        listEstamosFz = new ArrayList<>();


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab3FragmentServicos(), "Serviços");
        adapter.addFragment(new Tab1FragmentFazAi(), "Faz ai");
        adapter.addFragment(new Tab2FragmentEstamosFz(), "Estamos fazendo");
        adapter.addFragment(new Tab4FragmentSobre(), "Sobre");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        imgBtnShare = findViewById(R.id.main_img_share);
        imgBtnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Serviço de busca em desenvolvimento", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public ArrayList<FazAi> getListFazAi(){
        return this.listFazAi;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_favorite) {
            Toast.makeText(Main.this, "Action clicked", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
