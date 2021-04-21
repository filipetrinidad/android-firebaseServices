package database_firebase.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseReference usuarios = referencia.child( "usuarios" );

        Usuario usuario = new Usuario();
        usuario.setName("Pedro");
        usuario.setSobrenome("Guilherme");
        usuario.setEmail("fipe5766@gmail.com");
        usuario.setSenha("1234");

        usuarios.setValue( usuario );

    }
}