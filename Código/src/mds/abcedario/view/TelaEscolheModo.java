package mds.abcedario.view;

import mds.abcedario.view.superclasses.AbstractActivity;
import android.os.Bundle;
import fga.mds.abcedario.R;

public class TelaEscolheModo extends AbstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_escolhe_modo);
        inicializarComponentes();
        definirEventos();
    }

	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void definirEventos() {
		// TODO Auto-generated method stub
		
	}

	
}
