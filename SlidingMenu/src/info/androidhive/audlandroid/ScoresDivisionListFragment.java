package info.androidhive.audlandroid;

import info.androidhive.audlandroid.adapter.ScoreListBaseAdapter;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class ScoresDivisionListFragment extends Fragment{
	private String TAG = "info.androidhive.audlandroid.ScoresDivisionListFragment";
	private ArrayList<ArrayList<String>> list;
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		Bundle bundle = this.getArguments();
		list = new ArrayList<ArrayList<String>>();
		ArrayList<String> homeTeams = bundle.getStringArrayList("homeTeamList");
		list.add(homeTeams);
		ArrayList<String> homeTeamIDs = bundle.getStringArrayList("homeTeamIDList");
		list.add(homeTeamIDs);
		ArrayList<String> awayTeams = bundle.getStringArrayList("awayTeamList");
		list.add(awayTeams);
		ArrayList<String> awayTeamIDs = bundle.getStringArrayList("awayTeamIDList");
		list.add(awayTeamIDs);
		ArrayList<String> dates = bundle.getStringArrayList("dateList");
		list.add(dates);
		ArrayList<String> times = bundle.getStringArrayList("timeList");
		list.add(times);
		ArrayList<String> scores = bundle.getStringArrayList("scoreList");
		list.add(scores);
		View rootView = inflater.inflate(R.layout.fragment_list, container,false);
		ListView listView = (ListView) rootView.findViewById(R.id.listview);
		TextView textView = (TextView) rootView.findViewById(R.id.list_header);
		textView.setText(bundle.getString("divisionName"));
		final ScoreListBaseAdapter adapter = new ScoreListBaseAdapter(getActivity(),list);
		listView.setAdapter(adapter);
		return rootView;
	}
}
