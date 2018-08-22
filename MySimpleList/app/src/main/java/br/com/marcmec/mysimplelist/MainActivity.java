package br.com.marcmec.mysimplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String[]> contato;
    private ListView celular;
    private ArrayAdapter<String> adapter;
    private String[] arrayContato; //array list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List of contatos
        arrayContato= new String[]{"marcos - 115468245", "vinicius - 854678523", "Bento - 756325619", "Mom - 755644485", "Dad - 988962549"};
    //aqui eu citei alguns exemplos de contatos, dentro de um Array
        celular= (ListView) findViewById(R.id.list_celular);//instanciei a lista criada no layout

        contato= new ArrayList<>(); //atribui a lista criada à um arraylist
        contato.add(arrayContato);//e adicionei os contatos no arraylist

        adapter= new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayContato);//utilizei o adapter para personalizar e colocar a lista criada em um formato

        celular.setAdapter(adapter); //pegar o formato da lista e insere na lista criada para a visualização do usuário

    }
}
