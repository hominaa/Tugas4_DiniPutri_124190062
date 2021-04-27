package id.ac.upnyk.tugas4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<Data> list = new ArrayList<>();

    public ListFragment() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewsCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rcv);
        recyclerView.setHasFixedSize(true);
        list.addAll(Data.getListTokoh());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
         Data data = new Data(Data.getListTokoh())
        recyclerView.setAdapter(Tokoh);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }
}