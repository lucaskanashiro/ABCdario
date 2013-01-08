package mds.abcedario.view;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import fga.mds.abcedario.R;
import mds.abcedario.view.superclasses.AbstractActivity;

public class TelaAux extends ListActivity {
	
	SimpleCursorAdapter mAdapter;
	
	static final String[] infos = {"Nome: ABCedário", "Versão: 1.0"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	}

}
