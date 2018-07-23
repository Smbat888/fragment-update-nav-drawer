package com.example.smbat.appfortaron;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    private TextView textView;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        textView = view.findViewById(R.id.my_text);
        return view;
    }

    public void updateText(String text) {
        // Taron stex petqa qu global (field) array listy-y vor adapterin es tvel - update anes --- aysinqn gres
        // list = Provider.getEsimInch();
        // adapter.notify....
        textView.setText(text);
    }

}
