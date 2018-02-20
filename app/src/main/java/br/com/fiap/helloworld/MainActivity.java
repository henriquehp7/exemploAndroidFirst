package br.com.fiap.helloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //vamos pegar o text que ta no XML e utiliza-lo

    //toda tag do XML tem uma classe correspondente
    EditText edtNome;
    //esse edt é o ID q ta no XML
    //vai atrelar esse 'edittext edtnome' ao que ta no XML, faz isso pelo metodo logo abaixo, ta inicializando ele pelo 'findViewByID'
    //inicia a variavel dentro do onCreat, coloca-se o msm nome de variavel para ficar mais facil mais pode ser qlqr nome.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pegando o componente que tem o ID no XML e colocando no 'edt' que foi criando logo acima,
        // e vai pegar ele pelo ID, ele vai retornar, um objeto do tipo VIEW, só que tem que fazer um 'cast'
        //para transformar pra um EditText (cast  = EditText)

        edtNome = findViewById(R.id.edtNome); //o 'r' é uma classe criada automaticamente mapeia os conmponentes
    }


    public void salvar(View view) {

        //pegando o texto que foi digitado no componente
        String nome = edtNome.getText().toString();

        //aq criou um TOAST, para exibir a mensagem, depoi, abaixo, vamos criar um 'alert'
        //Toast.makeText(this, "O nome informado é : " +nome, Toast.LENGTH_SHORT).show();
        //o toast é uma mensagem que aparece um balaozinho de mensagem, para exibir a mensagem e o nome, nesse caso.

        //aqui vai criar uma mensagem de alerta informando alguma coisa e com um botao de 'ok', pode ter varios tipo de botao.
        AlertDialog.Builder alert = new AlertDialog.Builder(  this);//o this ta falando p usar a classe mainActivity como contexto

        alert.setTitle(R.string.HelloWorld);
        alert.setMessage(R.string.PrimeiroApp);
        alert.setPositiveButton(R.string.ok, null);
        alert.show();
    }
}
