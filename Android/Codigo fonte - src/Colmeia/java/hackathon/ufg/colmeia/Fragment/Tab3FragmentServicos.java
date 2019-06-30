package hackathon.ufg.colmeia.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import hackathon.ufg.colmeia.R;

public class Tab3FragmentServicos extends Fragment {

    WebView webview;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_3_servicos, container, false);
        webview = (WebView) rootView.findViewById(R.id.frag3_webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.google.com.br/maps/search/ufg/@-16.6830111,-49.2537338,15z/data=!3m1!4b1");

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

}