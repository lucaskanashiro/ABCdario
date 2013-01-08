package mds.abcedario.view;

import mds.abcedario.view.superclasses.AbstractActivity;
import fga.mds.abcedario.R;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.content.Intent;

public class MainActivity extends AbstractActivity	 {
	
	//Atributos da GUI
	private ImageView imgIniciar;
	private ImageView imgSair;
	private ImageView imgAux;
	private MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        definirEventos();
        song = MediaPlayer.create(MainActivity.this, R.raw.musica_tela_inicial);
        song.start();
    }

	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		imgIniciar = (ImageView) findViewById(R.imgV.Iniciar);
		imgAux = (ImageView) findViewById(R.imgV.Aux);
		imgSair = (ImageView) findViewById(R.imgV.Sair);
	}

	@Override
	public void definirEventos() {
		// TODO Auto-generated method stub
		imgIniciar.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, TelaEscolheModo.class));
			}
		});
		
		
		imgAux.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view){
				startActivity(new Intent(MainActivity.this, TelaAux.class));
			}
		});
		
		
		imgSair.setOnClickListener(new OnClickListener() {
			
			public void onClick(View view){
				System.exit(0);
			}
		});
	}
 
	
	 @Override
	    protected void onPause() {
	        // TODO Auto-generated method stub
	        super.onPause();
	        song.release();
	        finish();
	    }
	
}
